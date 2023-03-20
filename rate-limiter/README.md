# Rate Limiter
A rate limiter is used to control the rate of traffic send by a client or service.
Usually rate limiting is implemented within a component called API gateway.

### Features
- Prevent resource starvation caused by DOS attacks
- Prevent server from being overloaded
- Prevent server from being overloaded
- Allow different sets of throttle rules

### Algorithms
- Token bucket
- Leaking bucket
- Fixed window counter
- Sliding window log
- Sliding window counter

### Build, Run, Test
1. Start api `service`
2. Start `rate-limiter` service
3. Make requests in browser to http://localhost:8080/test

### TODO
- [ ] Fixed window system
- [ ] Use IP address to rate limit
- [ ] Add configuration or rule engine

### References
- https://www.tryexponent.com/courses/system-design-interview/system-design/design-rate-limiter