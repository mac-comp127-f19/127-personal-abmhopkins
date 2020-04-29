package arrayReading;

import java.util.Arrays;

public class arrayFindMax {

    public static int findMax(int[] a){
        Arrays.sort(a);
        return a[a.length-1];
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 7, 4};
        System.out.println(findMax(array));
    }
}