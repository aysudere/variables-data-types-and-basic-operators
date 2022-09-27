public class FloatDataTypes {
    public static void main(String[] args) {
        /*
        Double : 64 bit, 8 byte yer kaplar
        Float : 32 bit, 4 byte yer kaplar

        doble : . ile ayrılır
        otomatik dönüştürme : int float double
         */

        double a = 5.25;
        double b = 4.0;
        double c = 4d; // d : double
        System.out.println(c);

        double d = 4.23d; // d: double şeklini verir

        float q = (float)5.0;
        System.out.println(q);

        float w = 5f;
        float e = 5.2f;

        //genelde değişkenler double olarak tanımlanmaktadır.

        int r = 22/7;
        float t = 22f / 7f;
        double y = 22d / 7d;

        //aradaki fark bu şekilde rahat bir şekilde görülebilir. double'da doğrulur olasılığı daha fazladır
        System.out.println("r : " + r); // tam değer alınır
        System.out.println("t : " + t); // basamağın azı alınır
        System.out.println("y : " + y); // basamağın çoğu alınır

        int z = 5;
        float x = z;
        double v = z;
        System.out.println("x : " + x);
        System.out.println("v : " + v);

        double n = 3.52;
        float m = (float) n;
        //double'den float'a çevirirken değer kaybı olabilir hatası verir.

        double n1 = 70.25;
        double n2 = 60d;
        double n3 = 80.2;
        System.out.println("Ortalama double : " + (n1 + n2 + n3) / 3);

        float nu1 = 70.25f;
        float nu2 = 60f;
        float nu3 = 80.2f;
        System.out.println("Ortalama float : " + (nu1 + nu2 + nu3) / 3);



    }
}
