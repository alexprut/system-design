FROM openjdk:25
COPY build/libs/locationservice-*.jar service.jar
ENTRYPOINT ["java","-jar","/service.jar"]