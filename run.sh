## Build the WordCountLib project and installs it to the local repository
cd WordCountLib
mvn clean install

## Runs the Rest API in the WordCountApi project
cd ../WordCountApi
mvn clean spring-boot:run

## Returns the terminal to the project directory
cd ../