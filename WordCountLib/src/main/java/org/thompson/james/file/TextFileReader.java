/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.thompson.james.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author James Thompson
 */
public class TextFileReader {
    public String getTextFromFile(String path) throws FileNotFoundException, IOException {
        String txt = "";
        
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        while(bufferedReader.ready()) {
            txt += bufferedReader.readLine();
        }
        
        return txt;
    }
}
