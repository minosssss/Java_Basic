import java.util.*;

import static java.util.Collections.*;


class Ex11_19 {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);

        addAll(list, 1,2,3,4,5);
        System.out.println(list);

        rotate(list,2); //반시계방향으로 두번 회전
        System.out.println(list);

        swap(list, 0,2); // 첫번째와 세번째를 교환
        System.out.println(list);

        shuffle(list);
        System.out.println(list);

        sort(list, reverseOrder());
        System.out.println(list);

        int idx = binarySearch(list, 3);
        System.out.println("index of 3 = " + idx);

        System.out.println("max="+max(list));
        System.out.println("min="+min(list));

        fill(list, 9); // list를 9로 채운다.
        System.out.println("list="+list);

        // list와 같은 크기의 새로운 list를 생성하고 2로 채운다.
        // 단, 결과는 변경 불가
        List newList = nCopies(list.size(), 2);

        System.out.println(disjoint(list, newList)); // 공통요소가 없으면 true

        copy(list, newList); // 앞의 리스트를 뒤에 리스트로 변경(복사)
        System.out.println(list);
        System.out.println(newList);

        replaceAll(list, 2, 1);
        System.out.println("replace List = "+list);

    }
}
