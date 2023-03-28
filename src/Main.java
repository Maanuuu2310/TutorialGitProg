import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        final Scanner scanner = new Scanner(System.in);
        System.out.println(" introduce un papu numero");
        String num = scanner.nextLine();
        System.out.println("Hello, World " + num + " !" );
        scanner.close();
    }
}
