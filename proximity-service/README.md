# Proximity Service
Discover nearby places such as restaurants, hotels, theaters, etc.

### Stats
- 100ML daily active users
- 200ML businesses
- (100ML*5)/10^5=5000 QPS
- Read/Write ration 1000:1

### Features
- Discover Nearby Places, k-nearest places
- Business owners can add, update and delete businesses

##### Functional Requirement
- A user can specify a search radius and get all places in that range

##### Non-functional Requirement
- Low latency
- Data Privacy
- High Availability and High Scalability, can handle spikes of traffic

### Diagram
![System Design](system-design.svg)

### API

* __url__: `/v1/search/nearby`
* __method__: `GET`
* __description__:
* __query parameters__:
    * {__latitude__}: `decimal`
    * {__longitude__}: `decimal`
    * {__radius__}: `int`
* __return on success__: example
  ```json
  {
    "total": 5,
    "businesses": [{}]
  }
  ```

* __url__: `/v1/businesses/`
* __method__: `GET`
* __description__:
* __query parameters__:
  * {__id__}: `int`
* __return on success__: example
  ```json
  {
    "id": 100,
    "name": "British Museum"
  }
  ```
    

### Build, Run
```
docker-compose up
```

#### Test
```
http://localhost:8180/v1/search/nearby?longitude=1&latitude=1&radius=1
```

### TODO
- [ ] PostGIS in PostgreSQL
- [ ] Geohash in Redis
- [ ] If there are not businesses in the area, return neighbors area businesses
- [ ] Implement Quadtree

### References
- https://questdb.io/docs/concept/geohashes/
- https://redis.io/commands/geohash/
- https://hub.docker.com/r/postgis/postgis