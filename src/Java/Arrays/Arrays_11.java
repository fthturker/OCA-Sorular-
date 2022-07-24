package Java.Arrays;


import java.util.Arrays;

public class Arrays_11 {
    public static void main(String[] args) {
        String str="Java cok guzel";

        String[] kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); // [Java, cok, guzel]

        String[] kelimeler2=str.split("a");
        System.out.println(Arrays.toString(kelimeler2)); // [[J, v,  cok guzel]

        String[] kelimeler3=str.split("cok");
        System.out.println(Arrays.toString(kelimeler3)); // [Java ,  guzel]

        String[] kelimeler4=str.split("");
        System.out.println(Arrays.toString(kelimeler4)); // [J, a, v, a,  , c, o, k,  , g, u, z, e, l]

    }
}
