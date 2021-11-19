package zn6;

import java.util.*;

public class Zn6 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in, "cp1251");
        
        // КРОК/task_6_2/src/./../../task_6_1/../../../мемы/котики
        System.out.print("Введите путь к файлу: ");
        String[] s = in.nextLine().split("/");
        Stack<String> st = new Stack<>();
        for (String item : s) {
            switch (item) {
                case "..":
                    if (st.size() >= 2) {
                        st.pop();
                        st.pop();
                    } else {
                        st.clear();
                        st.push(item);
                    }
                    break;
                case ".":
                    if (st.size() >= 1) {
                        st.pop();
                    } else {
                        st.push(item);
                    }
                    break;
                default:
                    st.push(item);
                    break;
            }
        }
        String ans = "";
        for (String st1 : st) {
            if (ans.equals("")){
                ans = ans + st1;
                continue;
            }
            ans = ans + "/" + st1;
        }
        System.out.println(ans);
    }

}
