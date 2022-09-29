package Sept_29;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        System.out.println(arrayList);

        arrayList.remove(2);
        System.out.println(arrayList);

        System.out.println(arrayList.get(1));
        System.out.println(arrayList+"사라지기 전=== // 값 변경!");

        arrayList.set(0, 12314);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList);

        boolean isCheck1 = arrayList.contains(2);
        System.out.println(isCheck1);

        int index = arrayList.indexOf(4);
        System.out.println(index);
    }
}
