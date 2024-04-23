FROM openjdk:21
COPY build/libs/producerservice-*.jar service.jar
ENTRYPOINT ["java","-jar","/service.jar"]