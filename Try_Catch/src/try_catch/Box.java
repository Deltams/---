package try_catch;

public class Box {
    
    int x;
    int y;
    
    char[] xx = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
    char[] yy = {'1', '2', '3', '4', '5', '6', '7', '8'};
    
    public Box(){
        this.x = 0;
        this.y = 0;
    }
    
    public Box(int x, int y) throws IllegalArgumentException{
        if (x < 1 || y < 1 || x > 8 || y > 8){
            throw new IllegalArgumentException("Incorrect coordinates entered: ("+ x +", " + y + ")");
        }
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void setY(int y) throws IllegalArgumentException{
        if (y < 1 || y > 8){
            throw new IllegalArgumentException("Incorrect coordinate y: " + y);
        }
        this.y = y;
    }
    
    public void setX(int x) throws IllegalArgumentException{
        if (x < 1 || x > 8){
            throw new IllegalArgumentException("Incorrect coordinate x: " + x);
        }
        this.x = x;
    }
    
    public boolean equals(Object other){
        if (other == null){
            return false;
        } else if (!(other instanceof Box)){
            return false;
        }
        
        Box o = (Box)other;
        
        if (this.y == o.y && this.x == o.x){
            return true;
        }
        
        return false;
    }
    
    public String toString(){
        return String.format("You are in: %s%s", this.xx[this.x-1], this.yy[this.y-1]);
    }
}
