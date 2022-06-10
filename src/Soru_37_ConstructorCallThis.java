public class Soru_37_ConstructorCallThis {
    int x=10 , y;
    Soru_37_ConstructorCallThis(){
        System.out.print(x * y);
    }
    Soru_37_ConstructorCallThis(int x , int y){
        this();
        this.x=x;
        this.y=10;
        System.out.print(x*y);
    }
    Soru_37_ConstructorCallThis(int x,int y,int z){
        this(y,z);
        this.x=x;
        this.y=y;
        System.out.print(x*z);
    }
    public static void main(String[] args) {
        Soru_37_ConstructorCallThis dnm=new Soru_37_ConstructorCallThis(3,4,5);
        System.out.print(dnm.x * dnm.y);
    }

}
/*
A.0401212
B.0201212
C.0121212
D.0201512 // DOGRU
E.Kod calismaz
 */
