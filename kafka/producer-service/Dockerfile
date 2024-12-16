FROM openjdk:25
COPY build/libs/producerservice-*.jar service.jar
ENTRYPOINT ["java","-jar","/service.jar"]