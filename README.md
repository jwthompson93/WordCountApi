# Text Analysis API
A simple API application with a HTTP method to accept a file and output the following information about the file:
* The amount of words
* The average word length
* A count of word lengths
* The highest count of word lengths

## Getting Started
To run this application, you will need the following:
- Java 11+
- Apache Maven

### Running the API

1. Open the Command Prompt (Windows) or Terminal (Linux) at the root folder of the repository
2. Execute the following command:
	Windows
	``` 
	run.bat
	```
	Linux
	``` 
	run.sh
	```
	This script will build and install the WordCountLib project and then build and run the API
3. When the API is running, a statement similar to ' Started WordcountapiApplication in x seconds' will appear.

### Using the API
1. Open a web browser and navigate to the following URL:
	``` 
	http://localhost:8080/swagger-ui/index.html
	```
2. Below the text-analysis-controller, click on the '/api/textanalysis/file/process/text' drawer.
3. Click on the 'Try it out' button' on the right-hand side.
4. Click on the 'Choose file' button that's appeared and choose the text file to be analysed.
5. Click on the Execute button. After a short while, a Response Body will appear showing the following information about the text:
	* The amount of words
	* The average word length
	* A count of word lengths
	* The highest count of word lengths
