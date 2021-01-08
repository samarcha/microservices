FROM java:8
EXPOSE 8090
ADD /target/Publicite-0.0.1-SNAPSHOT.jar publicite.jar
ENTRYPOINT ["java", "-jar", "publicite.jar"]