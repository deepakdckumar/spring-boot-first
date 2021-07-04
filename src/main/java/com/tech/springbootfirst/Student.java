package com.tech.springbootfirst;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private Integer id;
    private String name;
    private String progLang;
    
    public Student() {
    }
    
    public Student(Integer id, String name, String progLang) {
        this.id = id;
        this.name = name;
        this.progLang = progLang;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setProgLang(String progLang) {
        this.progLang = progLang;
    }

    public String getProgLang() {
        return this.progLang;
    }

}
