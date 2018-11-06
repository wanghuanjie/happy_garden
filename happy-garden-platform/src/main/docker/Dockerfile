FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD hbxhx-docker-explore-service.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]