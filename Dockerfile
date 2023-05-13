FROM openjdk:8
EXPOSE 8091
ADD target/mykube.jar mykube.jar
#Specify the command to run at container start up
ENTRYPOINT ["java","-jar","/mykube.jar"]
