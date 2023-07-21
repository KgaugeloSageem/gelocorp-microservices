FROM eclipse-mosquitto:17-jdk
VOLUME /tmp
ARG JAR_FILE=build/libs/microservices-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Djava.security.edge=file:/dev/./urandom", "-jar", "app.jar"]