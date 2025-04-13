FROM openjdk:11-jre-slim
VOLUME /tmp
COPY target/purification-service-0.0.1-SNAPSHOT.jar purification-service.jar
ENTRYPOINT ["java","-jar","/purification-service.jar"]