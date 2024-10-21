# Apache Druid

Apache Druid is a real-time analytics database designed for fast slice-and-dice analytics ("OLAP" queries) on large data
sets. Most often, Druid powers use cases where real-time ingestion, fast query performance, and high uptime are
important.

#### Functional Requirement

- Columnar storage format
- Massively parallel processing
- Realtime or batch ingestion
- Indexes for quick filtering
- Time-based partitioning
- Approximate algorithms
- Automatic summarization at ingest time

#### Non-functional Requirement

- Scalable distributed system
- Cloud-native, fault-tolerant architecture that won't lose data
- Self-healing, self-balancing, easy to operate

See https://druid.apache.org/docs/latest/design/#key-features-of-druid

### Stats

- Can ingest data at the rate of millions of records per second while retaining trillions of records and maintaining
  query latencies ranging from the sub-second to a few seconds.

### Tutorial
Based on https://druid.apache.org/docs/latest/tutorials/docker

### Diagram
![System Design](system-design.svg)

See https://druid.apache.org/docs/latest/design/architecture/

### Install, Run, Test

```
docker compose up -d
```

### UI

```
http://localhost:8888/
```

### TODO

- [ ] Add a write and read service

### References

- https://druid.apache.org/docs/latest/design/
- https://github.com/apache/druid/blob/30.0.1/distribution/docker/docker-compose.yml
- https://druid.apache.org/docs/latest/tutorials/docker
- https://druid.apache.org/docs/latest/tutorials/