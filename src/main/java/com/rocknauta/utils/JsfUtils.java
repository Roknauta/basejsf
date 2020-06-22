package com.rocknauta.utils;

import java.util.ResourceBundle;

public class JsfUtils {
    private final static ResourceBundle rb = ResourceBundle.getBundle("messages");

    public String obterValorMensagem(String key){
        return rb.getString(key);
    }

}
