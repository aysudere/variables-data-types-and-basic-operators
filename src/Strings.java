public class Strings {
    public static void main(String[] args) {
        /*
        Daha önce gördüğümüz 8 veriables ilkel veri tipidir
        Üzerlerinde herhangi bir method yada işlem bulundurmaz

        String :
        -"ilkel olmayan veri tipleridir"
        -Büyük harfle başlamak zorundadır
        -stringler toplanarak yazılabilmektedir
         */

        String a = "Hello";
        System.out.println(a + " Welcome");

        String b = "Java";
        String c = " Programming";
        String d = " Language";
        String sum = b + c + d;
        System.out.println(sum);

        String e = "Hello";
        int f = 35;
        String sum1 = e + f; // Otomatik dönüştürme yapıldığı için herhangi bir hata vermez
        System.out.println(sum1);

        String q = "Hello";
        double w = 3.52;
        byte r = 10;
        q = q + w + r;
        System.out.println(q); //toplanmadan, direkt olarak String içine atanmaktadır

        char t = '?';
        String y = "Hello How are u" + t;
        System.out.println(y); //char ile string değerleri toplanabilmektedir

        String u = "Java " +
                "Programming " +
                "Language"; //uzun stringlerde bu şekilde bir yol izlenebilir
        System.out.println(u);

        /*
         \t değeri 4 adet boşluk bırakmaktadır
         \n değeri alt satıra geçirmektedir
         */

        String i = "Java\nProgramming\nLanguage";
        System.out.println(i);

        String o = "Java\tProgramming\tLanguage";
        System.out.println(o);

    }
}
