package nowcoder;

import java.util.ArrayList;

public class Demo2 {

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        ArrayList<Integer> list = new ArrayList<>(6);
        list.add(3);
        list.add(31);
        list.add(26);
        list.add(45);
        list.add(33);
        list.add(120);
        System.out.println(demo2.maxValue(list));

    }

    public int maxValue(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                if (i != j) {
                    if (compare(arr.get(i), arr.get(j)) == arr.get(j)) {
                        Integer intJ = arr.remove(j);
                        arr.add(i, intJ);
                    }
                }
            }
        }
        StringBuilder maxValue = new StringBuilder();
        for (Integer integer : arr) {
            maxValue.append(integer);
        }
        return Integer.parseInt(maxValue.toString());
    }

    public int compare(int value1, int value2) {
        char[] value1List = String.valueOf(value1).toCharArray();
        char[] value2List = String.valueOf(value2).toCharArray();

        int value1Length = value1List.length;
        int value2Length = value2List.length;

        int minLength = Math.min(value1Length, value2Length);

        for (int i = 0; i < minLength; i++) {
            if (value1List[i] < value2List[i]) {
                return value2;
            } else if (value1List[i] > value2List[i]) {
                return value1;
            }
        }

        if (value1Length == value2Length) {
            return value1;
        } else {
            if (value1Length > value2Length) {
                if (value1List[value2Length] > value1List[value2Length - 1]) {
                    return value1;
                } else {
                    return value2;
                }
            } else {
                if (value2List[value1Length] > value2List[value2Length - 1]) {
                    return value2;
                } else {
                    return value1;
                }
            }
        }

    }

}
