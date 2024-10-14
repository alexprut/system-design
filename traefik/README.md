# Traefik

An open-source Proxy (or api gateway, edge proxy, reverse proxy) that makes publishing your services a fun and easy
experience. It receives requests on behalf of your system and identifies which components are responsible for handling
them, and routes them securely.

### Functional Requirement
- Automatic detection and configuration of services
- Plugin extendable
- HTTP, TCP, UDP

### Build, Run, Test, UI

```
docker-compose up -d reverse-proxy
```
```
docker-compose up -d whoiam
```
```
docker-compose up -d --scale whoami=3
```

```
curl -H Host:whoami.docker.localhost http://127.0.0.1
```

#### UI

```
http://localhost:8080
```

### Tutorial
Based on https://doc.traefik.io/traefik/getting-started/quick-start/

### Diagram

![System Design](system-design.svg)

### TODO

- [ ] Add a real service example

### References

- https://doc.traefik.io/traefik/