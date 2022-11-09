FROM openjdk:18.0-jdk-oracle
ARG JAR_FILE=target/dswa4-books-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]