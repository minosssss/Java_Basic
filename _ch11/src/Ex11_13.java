import java.util.*;

class Ex11_13 {
    public static void main(String[] args) {
        Set set = new TreeSet(new TestComp());

        for (int i = 0; set.size()  < 6; i++) {
            int num = (int)(Math.random()*45)+1;
            set.add(new Test());
        }
        System.out.println(set);
    }
}


class Test {}

class TestComp implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return -1;
    }
}