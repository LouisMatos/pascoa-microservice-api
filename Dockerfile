FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/pascoa-microservice-api-*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]