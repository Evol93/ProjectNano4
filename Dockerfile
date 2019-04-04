FROM java:openjdk-7-jre-alpine

COPY . .

CMD ["gradlew", "buildAndCopy"]

CMD ["java", "-jar", "-Dwzpath=wz/", "dist/ProjectNano.jar", "&>", "logs/$(date +\"%Y_%m_%d_%I_%M_%p\").log"]
