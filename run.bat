:: Build the WordCountLib project and installs it to the local repository
cd WordCountLib
call mvn clean install

:: Runs the Rest API in the WordCountApi project
cd ../WordCountApi
call mvn clean spring-boot:run

:: Returns the terminal to the project directory
cd ../