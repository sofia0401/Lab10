package Task1;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        int k,d,x;
        int count=0;
        Scanner sc=new Scanner(System.in);
        k=sc.nextInt();
        d= sc.nextInt();
        for (int i = (int) Math.pow(10,(k-1)); i<(int)Math.pow(10,k); i++) {
            x = i;
            int sum = 0;
            while (x > 0) {
                sum +=(x % 10);
                x = x / 10;
            }
            if (sum == d) count++;
        }
        System.out.println(count);
    }
}
