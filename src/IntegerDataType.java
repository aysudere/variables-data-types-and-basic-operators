public class IntegerDataType {

    public static void main(String[] args) {
        /*
        tam sayıları gösteren 4 adet veri tipi vardır
        byte, short, int ve long
        -kapladıkları yerler ve tuttukları değerler açısından birbirinden ayrılırlar

        1 byte = 8 bit
        int : 32 bit, 4 byte
        short :
        byte : 8 bit, 1 byte
        long :
         */

        int a = 4; // en düşük değeri -2 üssü 31'e kadar, en yüksek değeri 2 üssü 31 -1
        System.out.println(Integer.MAX_VALUE); // tutabileceği maks değer
        System.out.println(Integer.MIN_VALUE); // tutabileceği min değer

        byte b = 100;
        System.out.println(Byte.MAX_VALUE); // tutabileceği max değer
        System.out.println(Byte.MIN_VALUE); // tutabileceği min değer

        short c = 101;
        System.out.println(Short.MAX_VALUE); // tutabileceği max değer
        System.out.println(Short.MIN_VALUE); // tutabileceği min değer

        long d = 102;
        System.out.println(Long.MAX_VALUE); // tutabileceği max değer
        System.out.println(Long.MIN_VALUE); // tutabileceği min değer

        /*
        Veri tiplerinin birbirine dönüştürülmesi

        byte - short - int - long

        herhangi bir işlem esnasında java otomatik dönüştürme yapmaktadır
        byte'da saklanan her şey, int'te de saklanabilir ancak int'te saklananlar byte'da saklanamaz
         */

        short j = 1000;
        int k = (j/2);
        System.out.println(k);

        int i = j; //otomatik dönüştürme olarak değer dönrülür.

        //ancak otomatik dönüştürme yapılmayan yerler de olabilir

        byte q = 100;
        byte w = (byte) (q/2);  //q - bytedır 2 ise int bu yüzden bir kayıp yaşanması muhtemeldir
        System.out.println(w);

        short e = 100;
        byte r = 2;
        int t = 4;
        long y = e + r + t; //otomatik dönüştürme yaptığı için sıkıntı çıkartmaz
        System.out.println(y);

    }
}
