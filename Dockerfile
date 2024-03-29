FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT [ "sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]