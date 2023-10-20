package com.thompson.james.wordcountapi.controller;

import java.io.IOException;
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
    
    @PostMapping(path = "/process", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> ProcessFile(@RequestParam("file") MultipartFile file) throws IOException {
        TextFileReader fileReader = new TextFileReader();
        String text = fileReader.getTextFromFile(file.getInputStream());
        
        String responseJson = textAnalysisProcess.process(text);
        return ResponseEntity.ok(responseJson);
    }
}
