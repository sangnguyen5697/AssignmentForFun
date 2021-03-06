package Collections;

import java.util.ArrayList;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list1 == null) return list2;
        else if (list2 == null) return list1;
        list1.addAll(list2);
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int sum = 0;
        if (list1 != null) for (int num : list1) sum += num;
        if (list2 != null) for (int num : list2) sum += num;
        return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        if (toRemove == null) return original;
        ArrayList<Integer> newList = new ArrayList<Integer>();

        for (int num : original) {
            if (num != toRemove) newList.add(num);
        }

        return newList;
    }

    public boolean happyList(ArrayList<String> original) {
        int N = original.size();
        if (N <= 1) return true;

        for (int i = 0; i < N - 1; i++) {
            String curr = original.get(i), next = original.get(i + 1);
            if (curr == null || next == null) return false;
            boolean found = false;
            for (char c : curr.toCharArray()) {
                if (next.indexOf(c) != -1) {
                    found = true;
                    break;
                }
            }
            if (!found) return false;
        }

        return true;
    }
}
