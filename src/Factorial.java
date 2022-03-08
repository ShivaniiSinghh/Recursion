import java.util.Scanner;

public class Factorial {
    static int fact = 1;
    int res;
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println("Enter No. : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        f.calFact(n);
        System.out.println("Factorial of " + n + " is : " + fact);
    }
    void calFact(int n) {
        if (n >= 1) {
            fact = fact * n;
            calFact(n - 1);
        }
    }
}

