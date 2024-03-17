FROM maven:3-eclipse-temurin-21-alpine AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:21-jdk
COPY --from=build /target/visivault-0.0.1-SNAPSHOT.jar visivault.jar
EXPOSE 8080
ENTRYPOINT ["jaav","-jar","visivault.jar"]
