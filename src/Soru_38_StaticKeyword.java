public class Soru_38_StaticKeyword {

    public static int length=0;
}

class ConsLength {
    static  Soru_38_StaticKeyword cons1=new  Soru_38_StaticKeyword();
    static  Soru_38_StaticKeyword cons2=new  Soru_38_StaticKeyword();
    static  {
        System.out.print(cons1.length);
    }
    public static void main(String[] args) {

        cons1.length=2;
        cons2.length=8;

        System.out.println(cons1.length);
    }
}
            /*
            A. 02
            B. 08 // DOGRU
            C. 2
            D. 8
            E. Kod calismaz.
            F. Kod calisir ancak exception olusur.
             */


