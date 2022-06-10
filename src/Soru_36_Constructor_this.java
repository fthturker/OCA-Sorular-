public class Soru_36_Constructor_this {
    int num;
    public Soru_36_Constructor_this(int num) {
        //INSERT CODE HERE
        this.num = num;
    }

    public static void main(String[] args) {
        System.out.println(new Soru_36_Constructor_this(50).num);
    }
}
/*
A.num= num;
B.num=this.num;
C.this.num=num;
D.yukaridakilerden hicbiri //DOGRU
 */