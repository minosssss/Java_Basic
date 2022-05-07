
import java.util.*;

class Ex11_15 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        int[] score = {80,95,50,34,34,65,10,100};

        for (int i : score) set.add(i);

        System.out.println("50보다 작은 값: " + set.headSet(50));
        System.out.println("50보다 큰 값: " + set.tailSet(50));
    }
}
