FROM openjdk:8
LABEL description="Echo IP Java Application"
EXPOSE 8080
COPY ./target/sample.jar /opt/sample-image.jar
COPY scouter.agent.jar /opt/scouter.agent.jar

WORKDIR /opt
CMD java $JAVA_OPTS -jar sample-image.jar
