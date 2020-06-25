package com.rocknauta.Controller;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@Named
@SessionScoped
public class InicioController implements Serializable {
    @Getter
    @Setter
    private String language;
    @Getter
    @Setter
    private List<Locale> locales = Arrays.asList(new Locale("pt"),new Locale("en"));

    @PostConstruct
    public void init(){
        this.language = "en";
    }

    public void changeLanguage(){
        FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale(this.language));
    }

}
