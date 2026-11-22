
import java.util.*;

public class Main {
    public static void printMessage(String message) {
        System.out.println(message);
    }
    public static void a() {
        System.out.println("Inside a!!");
    }
    public static void inner() {
        a();
        System.out.println("Inside inner!!");
    }

    public static void outer() {
        inner();
        System.out.println("Inside outer!!");
    }

    public static int fib1(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        return fib1(n - 1) + fib1(n - 2);
    }
    public static int fib(int n, int[] dp) {
        if(n == 0 || n == 1) {
            return n;
        }
        int ans1, ans2;
        if(dp[n - 1] == -1) {
            ans1 = fib(n - 1, dp);
            dp[n - 1] = ans1;
        } else {
            ans1 = dp[n - 1];
        }
        if(dp[n - 2] == -1) {
            ans2 = fib(n - 2, dp);
            dp[n - 2] = ans2;
        } else {
            ans2 = dp[n - 2];
        }
        return ans1 + ans2;
    }

    public static void tower(int n, String source, String helper, String destination) {
        if(n == 1) {
            System.out.println(source + " " + destination);
            return;
        }
        tower(n - 1, source, destination, helper);
        System.out.println(source + " " + destination);
        tower(n - 1, helper, source, destination);
    }

    public static void main(String[] y) {
        tower(45, "S", "H", "D");




        /*
        int[] dp = new int[100 + 1];
        Arrays.fill(dp, -1);
        System.out.println(fib(40, dp));
        for(int i : dp) {
            System.out.print(i + " ");
        }
         */




        /*
        boolean[] arr = new boolean[3];
        Arrays.fill(arr, true);
        for(int i = 0; i < arr.length; i++) {
            arr[i] = true;
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println(i + " " + arr[i]);
        }
         */

        /*
        outer();
        System.out.println("Inside main!");
        inner();

        printMessage("Hello");
        System.out.println("Inside main!");
        printMessage("Hey");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Value of n is : " + n);
        if(n > 10) {
            System.out.println("n is greater than 10");
        } else if(n == 10) {
            System.out.println("n is equal to 10");
        } else {
            System.out.println("n is lesser than 10");
        }
        for(int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }
         */
    }
}
