package stream;

import java.util.concurrent.*;
import static stream.Stream.Input_str;
import static stream.Stream.sum;
import static stream.Stream.ii;

class Some implements Runnable {

    public void run() {
        if (ii == 0) {
            ii = 1;
            for (int i = 0; i < Input_str.length() / 2; i++) {
                if (Matcher.match(String.valueOf(Input_str.charAt(i)), " ")) {
                    sum++;
                }
            }
        } else {
            for (int i = Input_str.length() / 2; i < Input_str.length(); i++) {
                if (Matcher.match(String.valueOf(Input_str.charAt(i)), " ")) {
                    sum++;
                }
            }
        }
    }

}

public class Stream {

    // 21 пробел, время работы не используя потокои составляет 15 сек.
    public static String Input_str = "Машина не для гонок. Для гонок другие совсем машины. Машина это чисто транспортное средство, помогающее доехать от точки А до точки Б.";
    public static int sum = 0, ii = 0;

    public static void main(String[] args) {
        Thread new_o = new Thread(new Some());
        Thread new_t = new Thread(new Some());
        new_o.start();
        new_t.start();
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Count of space: " + sum);
    }

}
