FROM amazoncorretto:11 as build
WORKDIR /workspace/app

COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src
RUN ./mvnw install -Dmaven.test.skip=true

FROM amazoncorretto:11
ARG DEPENDENCY=/workspace/app/target/
ARG JAR_FILE=*.jar
COPY --from=build ${DEPENDENCY}${JAR_FILE} /app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
