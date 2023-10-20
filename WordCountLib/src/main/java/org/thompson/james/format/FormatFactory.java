/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.thompson.james.format;

/**
 *
 * @author James Thompson
 */
public class FormatFactory {
    
    private FormatFactory() {}
    
    public static IFormat Format(String formatName) {
        switch(formatName) {
            case "json":
                return new JsonFormat();
            case "textanalysis":
                return new TextAnalysisFormat();
            default:
                return new JsonFormat();
        }
    }
}
