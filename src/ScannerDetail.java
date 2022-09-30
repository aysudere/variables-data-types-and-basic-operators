import java.util.Scanner;

public class ScannerDetail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age : ");
        int age = scanner.nextInt();
        System.out.println("Your age : " + age);

        scanner.nextLine(); //Dummy input

        System.out.println("Please enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Your name : " + name);

        /*
        bu sorun, nexInt'ten sonra yada nextDouble'den sonra nextLine almaya çalışırken gerçekleşir
        eğer ilk önce String bir değer alsaydık böyle bir sıkıntıyla karşılaşmayacaktık
         */

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Please enter 3 age : ");

        int age1 = scanner1.nextInt();
        int age2 = scanner1.nextInt();
        int age3 = scanner1.nextInt();

        System.out.println("Age 1 : " + age1 + " Age 2 : " + age2 + " Age 3 : " + age3);
    }
}
