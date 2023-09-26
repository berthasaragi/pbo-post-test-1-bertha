package com.mycompany.post_test_1;

import com.bags.Bag;
import java.util.ArrayList;

public class Post_test_1 {
    public static void main(String[] args) {
        ArrayList<Bag> bags = new ArrayList<>();
        bags.add(new Bag("tote bag", "20.000"));
        bags.add(new Bag("selempang", "35.000"));
        bags.add(new Bag("ransel", "80.000"));
        bags.add(new Bag("waist bag", "50.000"));
        bags.add(new Bag("koper", "200.000"));
        
     for (Bag tas : bags) {
        System.out.println("tas jenis " + tas.getJenis() + " seharga " + tas.getHarga() + ".");
    }
    }
}
