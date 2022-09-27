public class CharBoolean {
    public static void main(String[] args) {
        /*
        Char : karakterleri göstermek için kullanılır. Bellekte 2 byte yer kaplar. 2 ^ 16
        Boolean : koşul durumlarında kullanılır, true yada false değerlerini alır
         */

        char a = 'a'; //char değerlerini göstermek için 'tek tırnak' ve tek simge kullanılır
        char b = '?';
        char c = 14392;
        System.out.println(c); //sayılara karşılık gelen string karakterleri bulunmaktadır

        char e = '\u063C';
        System.out.println(e);

        /*
        unicode karakterlerini görmek için unicode-table sayfasına gidilebilir
         */

        boolean f = true;
        boolean g = false;
        System.out.println("true : " + f);
        //true yada false, koşul sağlandı yada sağlanmadı anlamına gelmektedir

    }
}
