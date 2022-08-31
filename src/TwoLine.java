import java.util.Scanner;
public class TwoLine {
    public static void main(String[] args) {
        System.out.println("Welcome to line comparison program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x1 and y1");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("the values of (x1,x2) ;" + x1 + "," + y1);
        System.out.println("enter x2 and y2");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.println("the values of (x2,y2) ;" + x2 + "," + y2);
        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("length of line :" + length);
        double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("length of line :" + length1);
        System.out.println("enter x3 and y3");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        System.out.println("the values of (x3,y3) ;" + x3 + "," + y3);
        System.out.println("enter x4 and y4");
        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();
        System.out.println("the values of (x4,y4) ;" + x4 + "," + y4);
        double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        System.out.println("length of line :" + length2);
    }
}