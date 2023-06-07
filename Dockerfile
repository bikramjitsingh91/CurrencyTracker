FROM adoptopenjdk/openjdk11
EXPOSE 5000
COPY target/*.jar CurrencyTracker-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","/CurrencyTracker-0.0.1-SNAPSHOT.jar"]