public class Operators {
    public static void main(String[] args) {
        /*
        Matematik operatörleri
        + toplama
        - çıkarma
        / bölme
        * çarpma
        % kalan operatörü
         */

        System.out.println(3 + 4);
        System.out.println(3 + 4.2);

        System.out.println(3 - 5);
        System.out.println(3 - 5f);

        System.out.println(10 / 4);
        //2.5 değerini elde etmek istiyorsak, değerlerden bir tanesi float yada double yapılır
        System.out.println(10f / 4);
        System.out.println(10 / 4d);

        System.out.println(3 * 4);
        System.out.println(3 * 4.5);

        System.out.println(10 % 4); //bölme işlemindeki kalan değerini vermektedir

        /*
        Atama ve arttırma operatörleri
        = atama
         */

        int a = 4;
        a = a + 2;
        System.out.println(a);

        int b = 6;
        b = b * 3;
        System.out.println(b);

        int c = 2;
        c += 2; // c = c+2 yazmak yerine kullanılan kısa bir yoldur
        System.out.println(c);

        int d = 4;
        d *= 4;
        System.out.println(d);

        //postfiks

        int e = 7; //1 arttırmak
        int f = 6; //1 azaltmak

        e++; // e = e + 1; e +=1
        f--; // f = f - 1; f -=1;

        System.out.println(e);
        System.out.println(f);

        //prefiks

        int g = 5;
        int h = 6;

        ++g;
        --h;

        System.out.println(g);
        System.out.println(h);


        int j = 7;

        System.out.println(j++); //postfikste değer güncellenmeden ekrana basılır
        System.out.println(++j); //prefikste değer güncellendikten sonra ekrana basılır

        int k = 10;

        System.out.println(k--);
        System.out.println(--k);

        /*
        Operatörlerin işlem sıraları
        -bunları en düzgün şekilde yapmak için parantez kullanılması en doğrusudur
         */

        System.out.println( 3 + 4 * 5);
        System.out.println((3f / 4) + (4 * 5));


    }
}
