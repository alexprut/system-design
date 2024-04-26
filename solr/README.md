# Solr

Open-source enterprise-search platform, written in Java.

### Functional Requirement
- Advanced Full-Text Search
- Real-time indexing
- High volume traffic
- Dynamic clustering
- Indexing, Querying, Mapping, Ranking

### Build, Run, Test, UI
```
docker-compose up -d
```

#### UI
```
http://localhost:8983/solr/
```

### Tutorial
Based on https://solr.apache.org/guide/solr/latest/getting-started/solr-tutorial.html

### Diagram
![System Design](system-design.svg)

### TODO
- [ ] Ingest web pages data and create a search product
- [ ] Sample data
- [ ] Solr cluster
- [ ] Use Zookeeper
- [ ] Add examples of production use cases and stats

### References
- https://solr.apache.org/
- https://solr.apache.org/features.html
- https://solr.apache.org/guide/solr/latest/getting-started/solr-tutorial.html
- https://solr.apache.org/guide/solr/latest/getting-started/solr-admin-ui.html
- https://en.wikipedia.org/wiki/Apache_Solr
- https://lucene.apache.org/
- https://tika.apache.org/