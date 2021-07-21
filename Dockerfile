FROM maven:3.6.0-jdk-11-slim AS MAVEN_BUILD
COPY pom.xml /build/
COPY src /build/src/
WORKDIR /build/
RUN mvn package

FROM openjdk:11.0-jre
WORKDIR /app
EXPOSE 80 5432
COPY --from=MAVEN_BUILD /build/target/catastro-0.0.1-SNAPSHOT.jar /app/
ENTRYPOINT ["java", "-jar", "catastro-0.0.1-SNAPSHOT.jar"]
