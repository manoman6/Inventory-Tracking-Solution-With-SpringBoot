FROM openjdk:17-jdk-slim
LABEL authors="emilianopadilla"

COPY target/Inventory-Tracking-Solution-With-SpringBoot-0.0.1-SNAPSHOT.jar Inventory-Tracking-Solution-With-SpringBoot-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/Inventory-Tracking-Solution-With-SpringBoot-0.0.1-SNAPSHOT.jar"]