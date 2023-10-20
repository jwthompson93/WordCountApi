/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.thompson.james.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author James Thompson
 */
public class TextFileReader {
    public String getTextFromFile(InputStream stream) {
        String txt = "";
        
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));
            while(bufferedReader.ready()) {
                txt += bufferedReader.readLine();
            }
        } 
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        return txt;
    }
}
