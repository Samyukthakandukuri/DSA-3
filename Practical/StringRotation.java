import java.util.Scanner;
public class StringRotation {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = sc.nextLine();
System.out.println("All Rotations are:");
    for (int i = 0; i < str.length(); i++) {
    System.out.println(str);
    str = str.substring(1) + str.charAt(0);
    }

        sc.close();
    }
}