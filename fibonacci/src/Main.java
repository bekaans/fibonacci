import java.util.*;
import java.io.*;

class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a=0,i, b=1, girdi;
        System.out.print("Lütfen sayı değeri giriniz");
        girdi=input.nextInt();
        for ( i=0;i<girdi;i++)
        {
            System.out.print(a);
            System.out.print(" + ");
            System.out.print(b);
            System.out.print(" = ");
            System.out.println(a+b);
            a=b; b++;
        }

    }
}