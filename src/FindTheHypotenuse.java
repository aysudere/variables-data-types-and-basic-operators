import java.util.Scanner;

public class FindTheHypotenuse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first edge : ");
        int edge1 = scanner.nextInt();

        System.out.println("Please enter second edge : ");
        int edge2 = scanner.nextInt();

        double hypotenuse = Math.sqrt((edge1 * edge1) + (edge2 * edge2));
        System.out.println("Hypotenuse : " + hypotenuse);

    }
}
