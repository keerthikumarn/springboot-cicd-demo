FROM openjdk:8
ADD target/springboot-cicd-demo-0.0.1-SNAPSHOT.jar springboot-cicd-demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/springboot-cicd-demo-0.0.1-SNAPSHOT.jar"]