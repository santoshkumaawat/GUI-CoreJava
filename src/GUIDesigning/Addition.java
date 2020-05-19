package GUIDesigning;


import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first no. : ");
        int a = sc.nextInt();
        System.out.println("Enter second no. : ");
        int b = sc.nextInt();
        int c = a + b;

        System.out.println("Addition : " + c);
    }
}
