FROM openjdk:17-alpine
LABEL maintainer="sd"
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/logconfig-0.0.1.jar
ADD ${JAR_FILE} logconfig.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/logconfig.jar"]