package oop1;

public abstract class Device {
    
    //Номер песни по списку(массиву)
    int id = 0;
    
    Сarrier pl_carr;
    
    boolean condition = false;
    
    public abstract void play(Сarrier car);
    
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
    
    public boolean equals(Object other){
        if (other == null){
            return false;
        } else if (!(other instanceof Player)){
            return false;
        }
        
        return true;
    }
}
