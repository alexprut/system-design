package ratelimiter.ratelimiter;

import java.sql.Time;

public class TokenBucket {
    final int capacity;
    int currentCapacity;
    long lastUpdate;
    int refillerRate;
    int intervalUpdateMilliseconds;

    public TokenBucket(int capacity, int refillerRate, int intervalUpdateMilliseconds) {
        this.capacity = capacity;
        currentCapacity = this.capacity;
        this.refillerRate = refillerRate;
        lastUpdate = System.currentTimeMillis();
        this.intervalUpdateMilliseconds = intervalUpdateMilliseconds;
    }

    public boolean handleRequest() {
        if (System.currentTimeMillis() - lastUpdate >= intervalUpdateMilliseconds) {
            currentCapacity = Integer.min(
                    capacity,
                    currentCapacity + (int) (System.currentTimeMillis() - lastUpdate) / intervalUpdateMilliseconds * refillerRate
            );
            lastUpdate = System.currentTimeMillis();
        }
        if (currentCapacity > 0) {
            currentCapacity--;
            return true;
        }

        return false;
    }
}
