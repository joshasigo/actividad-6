FROM openjdk:11-jre-slim
VOLUME /tmp
COPY target/collection-service.jar collection-service.jar
ENTRYPOINT ["java","-jar","/collection-service.jar"]