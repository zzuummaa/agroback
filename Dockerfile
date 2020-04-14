FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=build/*.jar
COPY ${JAR_FILE} agroback.jar
ENTRYPOINT ["java","-jar","/agroback.jar"]