public class Variables {
    /*
    Tüm methodlar main altına yazılır, her projede bir main methodu bulunması gerekiyor
     */

    public static void main(String[] args) {
        /*
        main methodu:
        değişkenler : verilerin depolandığı birimler
                    bu değişkenler programların başka yerlerinde kullanılabilir
                    bellekte bir adet yer ayrılır, program bittiğinde bellekten silinirler
                    değişkenler, türlerine göre ayrılır ardından tekrardan kullanılabilir
         */

        int a = 4;
        /*
        bilgisayar belleğinde, a int değeri oluşturulur.
         */

        System.out.println(a);

        int b;
        b = 5;
        b = 10;
        System.out.println(b);

        int c = 5;
        int d = 3 +5;
        System.out.println(d);

        int e = 3;
        int f = 4;
        int g = 5;
        int sum = e+f+g;
        int sum1 = e + g +f * 2;
        System.out.println(sum);
        System.out.println(sum1);

        System.out.println("Sum : " + sum);

        /*
        değişken isimleri verilirken, bazı kurallar vardır
        -variables sayı yada rakam ile başlayamaz
        -değişken isimlerinde türkçe karakter kullanılabilir ancak kullanılmamalı
        -çalıştırılmayan kodlar : yorum satırları olarak adlandırılabilir
        // : tekli yorum satırı
        /* : çoklu yorum satırı
         */

        int h = 10;
        int k = h * 2;
        int l = k - 3;
        int sum2 = 2 * h + k -l;
        System.out.println("Sum : " + sum2);



    }
}