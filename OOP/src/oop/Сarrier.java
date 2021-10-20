package oop;

//Класс носителя информации
public class Сarrier {
    
    String carr;
    
    Songs[] song;
    
    public Сarrier(String carr, Songs []song){
        this.carr = carr;
        this.song = song;
    }
    
    public String getCarr(){
        return this.carr;
    }
    
    public void setCarr(String carr){
        this.carr = carr;
    }
    
    public Songs[] getSong(){
        return this.song;
    }
    
    public void setSong(Songs[] song){
        this.song = song;
    }
    
    public boolean equals(Object other){
        if (other == null){
            return false;
        } else if (!(other instanceof Сarrier)){
            return false;
        }
        
        Сarrier o = (Сarrier)other;
        
        if (this.carr.equals(o.carr)){
            return true;
        }
        
        return false;
    }
    
    public String toString(){
        return String.format("Сarrier: %s", this.carr);
    }
}
