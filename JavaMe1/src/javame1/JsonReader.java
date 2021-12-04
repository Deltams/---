package javame1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class JsonReader {

    private String str(String s) {
        String ans = "";
        try {
            FileReader file1 = new FileReader(s);
            BufferedReader br = new BufferedReader(file1);
            String line;
            boolean letter = false;
            int numW = 0;
            while ((line = br.readLine()) != null) {
                ans = ans + line + "\n";
            }
        } catch (FileNotFoundException e) {
            System.out.println("Что-то не так с чтением файла");
        } catch (IOException e) {
            System.out.println("Что-то не так с BufferedReader");
        }
        return ans;
    }

    public List<SalesOb> parseSeles(String s) {
        String json = str(s);
        Gson gson = new Gson();
        return gson.fromJson(json, new TypeToken<List<SalesOb>>() {}.getType());
    }
    
    public List<Product> parseProduct(String s) {
        String json = str(s);
        Gson gson = new Gson();
        return gson.fromJson(json, new TypeToken<List<Product>>() {}.getType());
    }
}
