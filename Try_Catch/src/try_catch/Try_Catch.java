package try_catch;

public class Try_Catch {

    public static void main(String[] args) {
        
        try{
            Box board = new Box(1,1);
            System.out.println(board.toString());
            board.setX(4);
            board.setY(6);
            System.out.println(board.toString());
            board.setX(-1);
            board.setY(1);
        } catch (IllegalArgumentException n){
            System.out.println(n);
        }
        
    }
    
}
