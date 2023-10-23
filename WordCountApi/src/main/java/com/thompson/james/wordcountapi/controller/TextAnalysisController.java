package com.thompson.james.wordcountapi.controller;

import java.io.IOException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.thompson.james.file.TextFileReader;
import org.thompson.james.process.TextAnalysisProcess;

/**
 *
 * @author James Thompson
 */
@RestController
@RequestMapping("/api/textanalysis")
public class TextAnalysisController {
    
    private TextAnalysisProcess textAnalysisProcess;
    
    public TextAnalysisController() {
        textAnalysisProcess = new TextAnalysisProcess();
    }
    
    @GetMapping()
    public String ping() {
        return "Pong!";
    }
    
    @PostMapping(path = "/file/process/json", 
                consumes = MediaType.MULTIPART_FORM_DATA_VALUE, 
                produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> ProcessFileToJson(
            @RequestParam("file") MultipartFile file) throws IOException {
        TextFileReader fileReader = new TextFileReader();
        String text = fileReader.getTextFromFile(file.getInputStream());
        
        String responseJson = textAnalysisProcess.process(text, "json");
        return ResponseEntity.ok(responseJson);
    }
    
    @PostMapping(path = "/file/process/text", 
                consumes = MediaType.MULTIPART_FORM_DATA_VALUE, 
                produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> ProcessFileToText(
            @RequestParam("file") MultipartFile file) throws IOException {
        TextFileReader fileReader = new TextFileReader();
        String text = fileReader.getTextFromFile(file.getInputStream());
        
        String responseJson = textAnalysisProcess.process(text, "textanalysis");
        return ResponseEntity.ok(responseJson);
    }
    
    @ExceptionHandler(IOException.class)
    public ResponseEntity handleIoException(IOException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Could not handle file");
    }
}
