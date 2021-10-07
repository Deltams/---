package pkg1;

public class Zn2 {

    public static void main(String[] args) {

        // Для удобного вывода и быстрого изменения информации
        String[] s = {"Fizz", "Bizz"};

        for (int i = 1; i <= 100; i++) {

            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println(s[0] + s[1]);
            } else if (i % 3 == 0) {
                System.out.println(s[0]);
            } else if (i % 5 == 0) {
                System.out.println(s[1]);
            } else {
                System.out.println(i);
            }
        }
    }
}
