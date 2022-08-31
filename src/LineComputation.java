import java.util.Scanner;
    public class LineComputation {
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
            double length = Math.sqrt(Math.pow(x2 - x1,2) +  Math.pow(y2 - y1, 2));
            System.out.println("length of line :" + length);
        }
    }
