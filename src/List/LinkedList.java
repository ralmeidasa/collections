package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List<Double> notas1 = new ArrayList<Double>();
        notas1.add(7.0);
        notas1.add(8.5);
        notas1.add(9.3);
        notas1.add(5.0);
        notas1.add(7.0);
        notas1.add(0.0);
        notas1.add(3.6);
        System.out.println("Notas da lista 1: " + notas1.toString() + "\n");

        List<Double> notas2 = new java.util.LinkedList<>();

        notas2.addAll(notas1);
        System.out.println("Notas da lista 2: " + notas2 + "\n");
        System.out.println("Primeira nota da lista 2: " + notas2.get(0));
        notas2.remove(0);
        System.out.println("Lista 2 após remoção do índice 0: " + notas2);
    }
}
