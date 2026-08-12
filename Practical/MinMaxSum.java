import java.util.Scanner;
public class MinMaxSum {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
long[] arr = new long[5];
long total = 0;
long min = Long.MAX_VALUE;
long max = Long.MIN_VALUE;
System.out.println("Enter 5 positive integers:");
    for (int i = 0; i < 5; i++) {
    arr[i] = sc.nextLong();
    total += arr[i];
            if (arr[i] < min)
                min = arr[i];

            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("Output:");
        System.out.println((total - max) + " " + (total - min));

        sc.close();
    }
}