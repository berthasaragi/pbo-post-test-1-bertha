package com.mycompany.post_test_1;

import com.bags.Bag;
import java.util.ArrayList;

public class Post_test_1 {
    public static void main(String[] args) {
        ArrayList<Bag> bags = new ArrayList<>();
        bags.add(new Bag("tote bag", "Dior", 20000000));
        bags.add(new Bag("selempang", "LV", 35000000));
        bags.add(new Bag("ransel", "Chanel", 80000000));
        bags.add(new Bag("waist bag", "Hermes", 50000000));
        bags.add(new Bag("koper", "Gucci", 45000000));
        
        for (Bag tas : bags) {
            System.out.println("Tas jenis " + tas.getJenis() + " dengan merek " + tas.getMerk() + " seharga " + tas.getHarga() + ".");
        }
    }
}
