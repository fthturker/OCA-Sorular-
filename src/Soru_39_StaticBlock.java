public class Soru_39_StaticBlock {
    String m="m"; //instance variable
    static String value = "t"; // static variable
    static{ value += "a"; } // static blok
    { value += "c"; } // static olmayan blok
    public Soru_39_StaticBlock() { // constructor
        m="h";
        value += "b";

    }
    public Soru_39_StaticBlock(String s) { // constructor
        value += s;
        m="k";
    }
    public static void main(String[] args) {
        Soru_39_StaticBlock order = new Soru_39_StaticBlock("f");
        order = new Soru_39_StaticBlock();
        System.out.println(order.value + order.m);
    }
}
/*
        A. tacb
        B. tacfcbk
        C. tacbfh
        D. tacfcbh  // Dogru
        E. tacftach
        F. Kod calismaz.
        G. Kod calisir ama exception olusur.
 */

