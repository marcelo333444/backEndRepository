FROM amazoncorretto:17-alpine-jdk

MAINTAINER emaaristimuno

COPY target/mf-0.0.1-SNAPSHOT.jar mf-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/mf-0.0.1-SNAPSHOT.jar"]
