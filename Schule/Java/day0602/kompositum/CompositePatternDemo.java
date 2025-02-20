package day0602.kompositum;

import java.util.ArrayList;
import java.util.List;



public class CompositePatternDemo {
    public static void main(String[] args) {
        Blatt blatt1 = new Blatt("Blatt 1");
        Blatt blatt2 = new Blatt("Blatt 2");
        Blatt blatt3 = new Blatt("Blatt 3");
        
        Kompositum kompositum = new Kompositum("1");
        kompositum.add(blatt1);
        kompositum.add(blatt2);
        
        Kompositum kompositum2 = new Kompositum("2");
        kompositum2.add(kompositum);
        kompositum2.add(blatt3);
        
        kompositum2.operation();
    }
}