
package patikaödevler;

import java.util.Scanner;


public class NotHesaplama {
    public static void main(String[] args) {
        int matematik, kimya, fizik, muzik, tarih, turkce;  
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Matematik notunuzu giriniz: ");
        matematik = scanner.nextInt();
        
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = scanner.nextInt();
        
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = scanner.nextInt();
        
        System.out.print("Müzik notunuzu giriniz: ");
        muzik = scanner.nextInt();
        
        System.out.print("Tarih notunuzu giriniz: ");
        tarih = scanner.nextInt();
        
        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = scanner.nextInt();
        
        double ortalama = (matematik+tarih+turkce+fizik+kimya+muzik)/6;
        
        boolean kontrol = ortalama >= 60;
            String sonuc = kontrol ? "Sınıfı Geçti" : "Sınıfta Kaldı";
            System.out.println(sonuc);
        
    }
}
