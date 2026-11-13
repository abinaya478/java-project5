import java.util.Scanner;

public class CloudApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cloud Java Application");
        System.out.print("Enter your name: ");

        String name = sc.nextLine();

        System.out.println("Welcome " + name);
        System.out.println("Application Created Successfully!");

        sc.close();
    }
}
