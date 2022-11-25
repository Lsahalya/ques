FROM openjdk:8
ADD target/Questions-0.0.1-SNAPSHOT.jar Questions-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","Questions-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080