FROM amazoncorretto:17-alpine
COPY build/libs/yeetcross-0.0.1-SNAPSHOT.jar /app/
ENTRYPOINT ["java", "-jar", "/app/yeetcross-0.0.1-SNAPSHOT.jar"]