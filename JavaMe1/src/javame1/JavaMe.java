package javame1;

import java.util.*;

public class JavaMe {

    public static List<SalesOb> topFive(List<SalesOb> obj) {
        //Сортировка пузырьком
        for (int j = 1; j <= obj.size() - 1; j++) {
            int z = 0;
            for (int i = 0; i <= obj.size() - 1 - j; i++) {
                // swap
                if (obj.get(i).getQuantityGoodsSold() > obj.get(i+1).getQuantityGoodsSold()) {
                    z = 1;
                    SalesOb t = new SalesOb(obj.get(i));
                    obj.get(i).setDateSale(obj.get(i + 1).getDateSale());
                    obj.get(i).setIdProduct(obj.get(i + 1).getIdProduct());
                    obj.get(i).setIdSales(obj.get(i + 1).getIdSales());
                    obj.get(i).setIdSeller(obj.get(i + 1).getIdSeller());
                    obj.get(i).setQuantityGoodsSold(obj.get(i + 1).getQuantityGoodsSold());
                    obj.get(i + 1).setDateSale(t.getDateSale());
                    obj.get(i + 1).setIdProduct(t.getIdProduct());
                    obj.get(i + 1).setIdSales(t.getIdSales());
                    obj.get(i + 1).setIdSeller(t.getIdSeller());
                    obj.get(i + 1).setQuantityGoodsSold(t.getQuantityGoodsSold());
                }
            }
        }
        return obj;
    }

    public static void main(String[] args) {
        
        // Считываем данные с файлов
        JsonReader reader = new JsonReader();
        List<SalesOb> seles = reader.parseSeles("D:\\JavaMe1\\src\\javame1\\Sales.json");
        List<Product> prod = reader.parseProduct("D:\\JavaMe1\\src\\javame1\\Product.json");
        
        //Заносим данные product связываем ID(ключ) и продукт(значение)
        HashMap<Integer, String> product = new HashMap<>();
        for (int i = 0; i < prod.size(); i++) {
            product.put(prod.get(i).getIdProduct(), prod.get(i).getNameProduct());
        }
        
        //Количество товаров на данный день
        HashMap<String, Integer> dateKol = new HashMap<>();
        //Сумма проданных товаров на данный день
        HashMap<String, Integer> dateProd = new HashMap<>();
        for (int i = 0; i < seles.size(); i++){
            if (dateKol.containsKey(seles.get(i).getDateSale())){
                dateKol.put(seles.get(i).getDateSale(), dateKol.get(seles.get(i).getDateSale()) + 1);
                continue;
            } else if (dateProd.containsKey(seles.get(i).getDateSale())){
                dateProd.put(seles.get(i).getDateSale(), dateKol.get(seles.get(i).getDateSale()) + seles.get(i).getQuantityGoodsSold());
                continue;
            }
            dateKol.put(seles.get(i).getDateSale(), 1);
            dateProd.put(seles.get(i).getDateSale(), seles.get(i).getQuantityGoodsSold());
        }
        
        
        //сортируем по возрастанию продажи
        List<SalesOb> top5 = topFive(seles);
        TopFive[] top = new TopFive[5];
        
        //заносим данные о топ 5 продаваимых товарах
        for (int i = top5.size() - 1, j = 0; i >= top5.size() - 5; i--, j++) {
            top[j] = new TopFive(j, product.get(top5.get(i).getIdProduct()), top5.get(i).getQuantityGoodsSold());
        }
        
        // Задание №1 топ 5 товаров с наибольшим количеством продаж
        OutPutJson out = new OutPutJson();
        List list = Arrays.asList(top);
        out.outSales(list, "Output1.json");
        
        //Задание №2 среднее количество проданных товаров за 1 день
        Set<String> keys = dateKol.keySet();
        SredZnach[] sr = new SredZnach[keys.size()];
        int i = 0;
        for (String s : keys){
            sr[i] = new SredZnach(i, s, (double) dateProd.get(s) / (double) dateKol.get(s));
            i++;
        }
        List list2 = Arrays.asList(sr);
        out.outSales(list2, "Output2.json");
    }

}
