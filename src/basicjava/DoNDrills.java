package basicjava;

public class DoNDrills {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++)
            System.out.println(i);

        for (int j = 10; j >= 0; j--)
            System.out.println(j);

        for (int k = 1; k <= 256; k = k * 2)
            System.out.println(k);

        for (int l = 0; l <= 255; l = l * 2 + 1)
            System.out.println(l);

        for (int count = 0 ;count < 50; count ++) {
            if (count%2 != 0)
                System.out.println(count*count);
        }
    }

}

