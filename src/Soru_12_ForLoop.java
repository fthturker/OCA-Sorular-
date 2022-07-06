public class Soru_12_ForLoop {
    public static void main(String[] args) {
        // FOR LOOP belirli sayida veya belirli sartlar saglanincaya kadar tekrar edilmesi gereken
        // bir islemi verimli bir sekilde yazmaniza olanak taniyan kod bloklaridir
        // verilen bir String`i tersine cevirin
        // verilen bir sayidan 1 e kadar tum sayilari toplayin
        // verilen bir tamsayinin rakamlar toplamini bulun
        // kullanicinin verdigi sayilari, toplam 500 oluncaya kadar toplayin
        // kullanicinin verdigi sayilari kullanici tamam diyene kadar toplayin
        // avantaj yapan durumlar islemde
        // islemi kac kere yapacaginiz belli ise
        // islemi baslatan ve bitiren degisken ayni ise

        // 1'den 100 e kadar (100 dahil) olan tamsayilari toplanyin
        int toplam = 0;
        for (int i = 1; i <= 100; i++) {
            toplam += i;

        }
        System.out.print(toplam);
        System.out.println("");

        // verilen iki sayinin ilkinden baslayip ikinciye kadar
        // 3'er 3'er yazdirin (ikinci sayi sartlari saglamiyorsa yazdirilmayabilir)
        int bas = 20;
        int bitis = 61;
        for (int i = bas; i < bitis; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println("");
        // verilen sayidan baslayarak geriye 1'e dogru
        // 3 ile bolunebilen sayilari yazdirin
        int input = 100;
        for (int i = input; i >= 1; i--) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

/*
                for (int i = 0; i < 10; ) {

            i = i++; // post increment once atama sonra artırma i hep 0 olur

            System.out.println(" Hello World");
        }
*/

    }
}
/*
A. 9
B. 10
C. 11
D. 6. satirdan dolayi kod calismaz
E. 9. satirdan dolayi kod calismaz
F. kod sonsuz bir donguye girer  //Dogru
 */