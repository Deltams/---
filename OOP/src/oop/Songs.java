package oop;

//Класс песен
public class Songs {
    
    String name_performer;
    
    String name_song;
    
    public Songs(String name_p, String name_s){
        this.name_performer = name_p;
        this.name_song = name_s;
    }
    
    public Songs(){
        this.name_performer = "Unknown";
        this.name_song = "Unknown";
    }
    
    public Songs(String name_s){
        this.name_performer = "Unknown";
        this.name_song = name_s;
    }
    
    public String getName_performer(){
        return this.name_performer;
    }
    
    public void setName_performer(String name_p){
        this.name_performer = name_p;
    }
    
    public String getName_song(){
        return this.name_song;
    }
    
    public void setName_song(String name_s){
        this.name_song = name_s;
    }
    
    public boolean equals(Object other){
        if (other == null){
            return false;
        } else if (!(other instanceof Songs)){
            return false;
        }
        
        Songs o = (Songs)other;
        
        if ("Unknown".equals(o.name_performer) || "Unknown".equals(o.name_song)){
            return false;
        } else if (this.name_performer.equals(o.name_performer) && this.name_song.equals(o.name_song)) {
            return true;
        } 
        
        return false;
    }
    
    public String toString(){
        return String.format("Performer: %s\nSong title: %s", this.name_performer, this.name_song);
    }
}
