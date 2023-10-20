/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.thompson.james.format;

import com.google.gson.Gson;

/**
 *
 * @author James Thompson
 */
public class JsonFormat<T> implements IFormat<T> {
    private Gson gson;
    
    public JsonFormat() {
        this.gson = new Gson();
    }

    @Override
    public String format(T input) {
        return gson.toJson(input);
    }
}
