FROM openjdk:22-jdk
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} music-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/music-0.0.1-SNAPSHOT.jar"]