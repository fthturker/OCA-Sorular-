package Java.Constructor;

public class Ogretmen {

    public Ogretmen(){
        isim="Ali";
        soyisim="Can";
        brans="Fizik";

    }

    String isim="İsim belirtilmedi";
    String soyisim="Soyisim belirtilmedi";
    String brans="Brans belirtilmedi";

public Ogretmen(String ism,String soyism,String brns){
    isim=ism;
    soyisim=soyism;
    brans=brns;
}
Ogretmen ogr3=new Ogretmen("Veli","Cem","Kimya");

}
