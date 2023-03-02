### Description
1. Start Master node.
1. Prepare Replica config from master node.
    1. Create replica user
    1. Backup Master data for initial to Slave node.
    1. Init Slave node
        1. Copy slave config file such as url to connect to master node.
        1. Override `pg_hba.conf` in master node
1. Restart Master node to apply config
1. Start Slave node

### Build, Test
```
sh docker-init.sh
```

### TODO
- [ ] Add pgAdmin (or an equivalent interface)
- [ ] Multi master replication
- [ ] Slave promotion to Master

### References
- https://www.postgresql.org/docs/current/runtime-config-replication.html#RUNTIME-CONFIG-REPLICATION-STANDBY
- https://medium.com/swlh/postgresql-replication-with-docker-c6a904becf77
- https://therishabh.in/setting-up-master-slave-replication-in-postgresql-using-dockers-and-external-volumes/
- https://bobcares.com/blog/postgres-docker-replication/
- https://github.com/mekeerati/docker-compose-example/tree/main/postgresql-read-replica
- https://hub.docker.com/_/postgres
- https://www.postgresql.org/docs/current/sql-createrole.html
- https://www.postgresql.org/docs/current/app-pgbasebackup.html
- https://hevodata.com/learn/postgresql-master-slave-replication/
- https://www.postgresql.org/docs/9.6/high-availability.html
- https://medium.com/swlh/postgresql-replication-with-docker-c6a904becf77
- https://therishabh.in/setting-up-master-slave-replication-in-postgresql-using-dockers-and-external-volumes/
- https://bobcares.com/blog/postgres-docker-replication/
- https://github.com/mekeerati/docker-compose-example/tree/main/postgresql-read-replica