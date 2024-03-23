FROM openjdk:17
EXPOSE 9090
ADD target/blog-app-apis-0.0.1-SNAPSHOT.jar /blog-app-apis-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/blog-app-apis-0.0.1-SNAPSHOT.jar"]
