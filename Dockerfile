FROM amazoncorretto:11.0.14
#COPY .target/kiii-0.0.1-SNAPSHOT.jar kiii-0.0.1-SNAPSHOT.jar
#ENTRYPOINT ["java", "-jar", "/kiii-0.0.1-SNAPSHOT.jar"]
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} kiii-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/kiii-0.0.1-SNAPSHOT.jar"]