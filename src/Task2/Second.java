package Task2;
import java.util.Scanner;

    public class Second {
        public static int f(int a, int b) {

            if (a == 0 && b > 0)
                return 1;
            else {
                if (a > 0 && b == 1)
                    return 0;
                else
                    return f(a - 1, b - 1) + f(a, b - 1);
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println(f(sc.nextInt(), sc.nextInt()));
        }
    }
