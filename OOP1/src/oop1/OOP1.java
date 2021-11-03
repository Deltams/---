package oop1;

public class OOP1 {

    public static void main(String[] args) {
        
        Songs[] a = new Songs[5];
        a[0] = new Songs("GONE.Fludd", "ВТОРНИК");
        a[1] = new Songs("SQWOZ BAB", "ТАТАРСКИЙ БОГАТЫРЬ");
        a[2] = new Songs("ЛСП", "Девочка-пришелец");
        a[3] = new Songs("NЮ", "Не убивай");
        a[4] = new Songs("2rbina 2rista", "Boodoo People");
        
        CD cd = new CD("CD", a);
        Flash flash = new Flash("flash_drive", a);
        Record record = new Record("record", a);
        
        Player player_1 = new Player(cd);
        player_1.setCondition(true);
        player_1.play();
        player_1.play();
        player_1.play();
        player_1.play();
        player_1.play();
        player_1.play();
        player_1.setCondition(false);
        
        Player player_2 = new Player(cd);
        player_2.setCondition(true);
        player_2.play();
        player_2.setCondition(false);
        
        player_1.setPl_carr(record);
        player_1.setCondition(true);
        player_1.play();
        player_1.setCondition(false);
        
        FlashPlayer player_3 = new FlashPlayer(record);
        player_3.setCondition(true);
        player_3.play();
        player_3.play(flash);
        player_3.play();
        player_3.play();
        player_3.play();
        player_3.play();
        player_3.play();
        player_3.setCondition(false);
    }
}