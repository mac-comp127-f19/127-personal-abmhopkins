package basicjava;

import java.util.Scanner;

public class SentinelDrills {
    public static String isOdd(int inputNum) {
        if (inputNum % 2 > 0)
            return "That is odd";
        else
            return "That is even";
        }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int userNum;

        System.out.println("Enter an integer:");
        userNum = scan.nextInt();

        while (userNum > 0){
            System.out.println(isOdd(userNum));
            System.out.println("Enter an integer:");
            userNum = scan.nextInt();
        }

    }
}
