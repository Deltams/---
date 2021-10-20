package oop;

public class OOP {

    public static void main(String[] args) {
        
        Songs[] a = new Songs[5];
        a[0] = new Songs("GONE.Fludd", "ВТОРНИК");
        a[1] = new Songs("SQWOZ BAB", "ТАТАРСКИЙ БОГАТЫРЬ");
        a[2] = new Songs("ЛСП", "Девочка-пришелец");
        a[3] = new Songs("NЮ", "Не убивай");
        a[4] = new Songs("2rbina 2rista", "Boodoo People");
        
        Сarrier cd = new Сarrier("CD", a);
        Сarrier flash = new Сarrier("flash_drive", a);
        Сarrier plate = new Сarrier("plate", a);
        
        Player player_1 = new Player("CD", cd);
        player_1.setCondition(true);
        player_1.play();
        player_1.play();
        player_1.play();
        player_1.play();
        player_1.play();
        player_1.play();
        player_1.setCondition(false);
        
        Player player_2 = new Player("flash_drive", cd);
        player_2.setCondition(true);
        player_2.play();
        player_2.setCondition(false);
        
        player_1.setPl_carr(plate);
        player_1.setCondition(true);
        player_1.play();
        player_1.setCondition(false);
    }
}
