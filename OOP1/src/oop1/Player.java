package oop1;

// Класс универсального проигрывателя
public class Player extends Device{
    
    public Player(Сarrier p1){
        this.pl_carr = p1;
    }
    
    public String toString(){
        return String.format("Player: Universal");
    }

    public void play(Сarrier car) {
        if (!this.condition){
            System.out.println("Система выключена");
        } else {
            this.id = 0;
            this.pl_carr = car;
            System.out.println("Сейчас играет: \n" + this.pl_carr.song[this.id] + "\n");
            this.id++;
        }
    }
    
    public void play() {
        if (!this.condition){
            System.out.println("Система выключена");
        } else {
            if (this.id == this.pl_carr.song.length){
                this.id = 0;
            }
            System.out.println("Сейчас играет: \n" + this.pl_carr.song[this.id] + "\n");
            this.id++;
        }
    }
}