package com.rocknauta.Controller;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ResourceBundle;

@Named
@ViewScoped
public class BaseJsfController implements Serializable {

    @Getter
    @Setter
    private String nome;

    @PostConstruct
    public void init(){
    }

    public String obterChave(String key){
        ResourceBundle rb = ResourceBundle.getBundle("messages");
        return rb.getString(key);
    }

    public void teste(){
        System.out.println("Teste");
    }

}
