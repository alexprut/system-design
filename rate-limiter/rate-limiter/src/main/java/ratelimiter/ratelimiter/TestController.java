package ratelimiter.ratelimiter;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
    TokenBucket tokenBucket = new TokenBucket(4, 2, 3000);
    @GetMapping("/test")
    public ResponseEntity<TestRecord> test() {
        if (tokenBucket.handleRequest()) {
            final String uri = "http://localhost:8080/test";
            RestTemplate restTemplate = new RestTemplate();
            return new ResponseEntity<>(restTemplate.getForObject(uri, TestRecord.class), HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.TOO_MANY_REQUESTS);
    }
}
