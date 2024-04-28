FROM eclipse-temurin:17
WORKDIR /home
COPY ./target/hw8-0.0.1.jar hw8.jar
ENTRYPOINT ["java", "-jar", "hw8.jar"]