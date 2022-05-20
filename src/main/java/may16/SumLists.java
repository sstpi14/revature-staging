package may16;

import java.util.LinkedList;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SumLists {


    public static int listToInt(List<Integer> lst, int len) {

        int forward = 0;

        for (int i = len - 1, j = 1; i >= 0; i--, j *= 10) {
            forward += lst.get(i) * j;
        }

        return forward;
    }


    public static int revListToInt(List<Integer> lst, int len) {

        int reverse = 0;

        for (int i = 0, j = 1; i < len; i++, j *= 10) {
            reverse += lst.get(i) * j;
        }

        return reverse;
    }


    public static int add(int x, int y) {

        int sum = x + y;

        return sum;
    }


    public static List<Integer> intToList(int sum) {

        List<Integer> end = new LinkedList<Integer>();

        while (sum != 0) {
            end.add(0, sum % 10);
            sum /= 10;
        }

        return end;
    }


    public static void main(String[] args) {

        List<Integer> listA = new LinkedList<Integer>(Arrays.asList(2, 1, 3));
        List<Integer> listB = new LinkedList<Integer>(Arrays.asList(4, 8, 5));

        int lenA = listA.size();
        int lenB = listB.size();

        // Prints addition of forward ordered lists
        System.out.println(intToList(add(listToInt(listA, lenA), listToInt(listB, lenB))));

        // Prints addition of reverse ordered lists
        System.out.println(intToList(add(revListToInt(listA, lenA), revListToInt(listB, lenB))));
    }

}
