FROM openjdk:20-jdk-oracle
EXPOSE 8080
ADD target/SpringBoot_Homework_1_Conditional-0.0.1-SNAPSHOT.jar devapp.jar
ENTRYPOINT ["java","-jar","/devapp.jar"]