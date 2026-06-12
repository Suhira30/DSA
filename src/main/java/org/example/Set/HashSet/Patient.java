package org.example.Set.HashSet;

public class Patient {
    int id;
    String name;
    public Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + "-" + name;
    }

    public int hashCode(){
        return id;
    }

    public boolean equals(Object o){
        Patient p = (Patient)o;
        return  this.id == p.id;
    }
}
