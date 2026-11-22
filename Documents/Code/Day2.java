import java.util.Scanner;

public class Day2 {

    public static void increment(int n, int[] nums) {
        n++;
        for(int i = 0; i < nums.length; i++) {
            nums[i]++;
        }
    }

    public static void inc(int[] nums) {
        System.out.println("Inside inc -> nums -> " + nums);
    }
    public static void main(String[] args) {

        // StringBuilder -> used for strings that can be modified
        StringBuilder str = new StringBuilder("abc");
        str.append("abc");  // Appends the string to the original string

        System.out.print(str);

        str.insert(1, "bgc");   // Inserting a string in a given index.

        System.out.println(str.length());   // Returns the length of the string

        System.out.print(str);


        /*
        String s1 = new String("abc");
        System.out.println("char At 4 -> " + s1.charAt(5));
        System.out.println("Length of string -> " + s1.length());
        String s2 = s1.substring(3); // Returns a substring, starting from si. si -> inclusive
        System.out.println("s2 -> " + s2 + " Length of s2 -> " + s2.length());
        String s3 = s1.substring(2, 7); // Returns a substring, starting from si ending with ei. si -> inclusive, ei -> exclusive
        System.out.println("s3 -> " + s3 + " Length of s3 -> " + s3.length());

        String s3 = s1.toLowerCase();   // Returns a string after converting all characters into lowercase
        String s3 = s1.toUpperCase();   // Returns a string after converting all characters into uppercase

        String s3 = s1.concat(" Hey"); // Returns string after concatenating string 2 with string 1
        System.out.println(s3);
         Returns an array of strings, where strings are split based on the separator.
        String[] words = s1.split(" ");
        for(String word : words)
            System.out.println(word);
        System.out.print(s1.equals("abc")); // Comapares 2 strings and returns a boolean true if they're equal!

        System.out.print(Character.isLowerCase(s1.charAt(1)));

         */




        /*
        String s2 = new String("abc");
        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
         */



        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        // Number pattern
        int n = sc.nextInt();
        int end = (2 * n) - 1;
        for(int i = 1; i <= n; i++) {
            int num = (2 * i) - 1;
            for(int j = 1; j <= n; j++) {
                System.out.print(num + " ");
                num += 2;
                if(num > end)
                    num = 1;
            }
            System.out.println();
        }
         */


        /*
        // Star Pattern
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            // Spaces -> n - i
            for(int j = 1; j <= n - i; j++) {
                System.out.print("_ ");
            }
            // Stars -> 2i - 1
            for(int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = n - 1; i >= 1; i--) {
            // Spaces -> n - i
            for(int j = 1; j <= n - i; j++) {
                System.out.print("_ ");
            }
            // Stars -> 2i - 1
            for(int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
         */







        /*
        int a = 10, b = 20;
        if(a++ == 10 || ++b == 21)
            System.out.println("Hello");
        else
            System.out.println("World");
        System.out.println(a + " " + b);
         */

        /*
        int[] arr = new int[3];
        System.out.println("Inside main -> arr -> " + arr);
        inc(arr);

        int a = 10;
        int[] arr = new int[3];
        System.out.println(a);
        for(int num : arr)
            System.out.print(num + " ");
        System.out.println("------");
        increment(a, arr);
        System.out.println(a);
        for(int num : arr)
            System.out.print(num + " ");
        System.out.println("------");
        */


        /*
        int a = 10;
        int[] arr = new int[5];
        System.out.println(a + " " + arr);
         */
    }
}
