package oop;

// Класс проигрывателя
public class Player{
    
    String name;
    
    //Номер песни по списку(массиву)
    private int id = 0;
    
    Сarrier pl_carr;
    
    boolean condition = false;
    
    public Player(String player, Сarrier p1){
        this.name = player;
        this.pl_carr = p1;
    }
    
    public String getPlayer(){
        return this.name;
    }
    
    public void setPlayer(String player){
        this.name = player;
    }
    
    public Сarrier getPl_carr(){
        return this.pl_carr;
    }
    
    public void setPl_carr(Сarrier pl_carr){
        this.pl_carr = pl_carr;
    }
    
    public String getCondition(){
        String s = "Система сейчас работает?\n" + this.condition;
        return s;
    }
    
    public void setCondition(boolean condition){
        this.condition = condition;
    }
    
    //Включение песни
    public void play(){
        if (!this.condition){
            System.out.println("Система выключена");
        } else if (!this.pl_carr.carr.equals(this.name)){
            System.out.println("Данный накопитель информации не подходит к этой системе\n");
        } else {
            if (this.id == this.pl_carr.song.length){
                this.id = 0;
            }
            System.out.println("Сейчас играет: \n" + this.pl_carr.song[this.id] + "\n");
            this.id++;
        }
    }
    
    public boolean equals(Object other){
        if (other == null){
            return false;
        } else if (!(other instanceof Player)){
            return false;
        }
        
        Player o = (Player)other;
        
        if (this.name.equals(o.name)){
            return true;
        }
        
        return false;
    }
    
    public String toString(){
        return String.format("Player: %s", this.name);
    }
}
