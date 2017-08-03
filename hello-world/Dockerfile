FROM openjdk:latest
ADD build/libs/hello-world-0.0.1-SNAPSHOT.jar /opt/hello-world/hello-world.jar
EXPOSE 8080
CMD ["/usr/bin/java","-jar","/opt/hello-world/hello-world.jar"]