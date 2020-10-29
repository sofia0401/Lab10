package Task3;

import java.util.Scanner;

public class Third {

    public static void func (int N) {
        if (N > 0) {
            func(N / 10);
            System.out.println(N % 10);
        }
    }

    public static void main(String[] args) {
        int N;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        func(N);
    }
}
