FROM openjdk:24
COPY build/libs/producerservice-*.jar service.jar
ENTRYPOINT ["java","-jar","/service.jar"]