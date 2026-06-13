package org.example.Map;

public class Hospital {

    int  id;
    String name;
    String disease;
    public Hospital(int id, String name, String disease){
        this.id = id;
        this.name = name;
        this.disease=disease;
    }

    public String toString(){
        return id+"-"+name+"-"+disease;
    }
}
