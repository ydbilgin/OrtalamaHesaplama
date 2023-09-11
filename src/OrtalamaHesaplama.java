
import java.util.Scanner;

public class OrtalamaHesaplama {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik Notunuz: ");
        mat = inp.nextInt();

        System.out.println("Fizik Notunuz: ");
        fizik = inp.nextInt();

        System.out.println("Türkçe Notunuz: ");
        turkce = inp.nextInt();

        System.out.println("Kimya Notunuz: ");
        kimya = inp.nextInt();

        System.out.println("Tarih Notunuz: ");
        tarih = inp.nextInt();

        System.out.println("Müzik Notunuz: ");
        muzik = inp.nextInt();

        int toplam = (mat+fizik+kimya+turkce+fizik+tarih+muzik);
        double sonuc = toplam / 6;

        boolean sonuc1 = sonuc >= 60;
        String str = (sonuc1) ? "Sınıfı geçti" : "Sınıftan kaldı" ;
        System.out.println(sonuc +" "+ str);
    }
}
