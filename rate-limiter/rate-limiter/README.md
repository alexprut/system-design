## Rate Limiter Service

## Requirements

* Gradle
* Java 17

## Settings variables

| Name | Description       |
| --- |-------------------|
| `HTTP_HOST` | default `0.0.0.0` |
| `HTTP_PORT` | default `8081`    |

### Build
```
./gradlew clean build
```

### Test
```
./gradlew test
```

### Run
```
java -jar build/libs/gs-actuator-service-0.1.0.jar
```

```
./gradlew bootRun
```

### API
curl http://localhost:8080/test
curl localhost:8080/actuator/health

* __url__: `/test`
* __method__: `GET`
* __description__:
* __return on success__: example
  ```json
  {
      "test": "test"
  }
  ```

### References
- https://spring.io/guides/gs/actuator-service/
- https://spring.io/guides/gs/rest-service/