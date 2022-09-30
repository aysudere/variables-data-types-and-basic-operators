import java.util.Scanner;

public class ChangingVariableValues {
    public static void main(String[] args) {
        //Kullanıcıdan aldığınız iki sayının değerlerini değiştirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number 1 : ");
        int number1 = scanner.nextInt();

        System.out.println("Please enter number 2 : ");
        int number2 = scanner.nextInt();

        System.out.println("Before change number 1 : " + number1 + " number 2 : " + number2);

        int interim = number1;
        number1 = number2;
        number2 = interim;

        System.out.println("After change number 1 : " + number1 + " number 2 : " + number2);

    }
}
