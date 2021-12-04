package javame1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.*;
import java.util.*;

public class OutPutJson {


    public void outSales(List sales, String name) {
        try (Writer writer = new FileWriter(name)) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(sales, writer);
        } catch (IOException e){
            System.out.println("Что-то не так с Writer");
        }
    }
}
