import java.util.Scanner;

public class GetInputs {
    public static void main(String[] args) {

        /*
        Kullanıcından değer alma
        kullanıcıdan değer almak scanner objesini kullanmak zorundayız
        Scanner class'ından scanner objesi oluşturulur
        Scanner objesi içerisinde belirli methosları bulunur

        **Her objeyi kullanmak için yeniden scanner objesi kullanılıyor?
         */

        Scanner scanner = new Scanner(System.in);

        //int
        System.out.println("Please enter your age : ");
        int age = scanner.nextInt();
        System.out.println("Your age : " + age);

        Scanner scanner1 = new Scanner(System.in);

        //double
        System.out.println("Please enter your age : ");
        double ageDobule = scanner1.nextDouble();
        System.out.println("Your age : " + ageDobule);

        Scanner scanner2 = new Scanner(System.in);

        //string

        System.out.println("Please enter your name : ");
        String name = scanner2.nextLine();
        System.out.println("Your name : " + name);

        //örnek

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Number : ");
        if(scanner3.hasNextInt()) {
            int number = scanner3.nextInt();
            System.out.println("Number : " + number);
        }
        else {
            System.out.println("This is not an integer!");
        }

    }
}
