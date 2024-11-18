import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
  
        Scanner scan = new Scanner(System.in);
    
        // Persegi
    
        int sisi = scan.nextInt();
    
        kelilingPersegi(sisi);
        System.out.println(luasPersegi(sisi));
    
        // Persegi Panjang
    
        int panjang = scan.nextInt();
        int lebar = scan.nextInt();
    
        kelilingPersegiPanjang(panjang, lebar);
        System.out.println(luasPersegiPanjang(panjang, lebar));
    
        // Segitiga
    
        int sisi1 = scan.nextInt();
        int sisi2 = scan.nextInt();
        int sisi3 = scan.nextInt();
    
        kelilingSegitiga(sisi1, sisi2, sisi3);
    
        double alas = scan.nextInt();
        double tinggi = scan.nextInt();
    
        System.out.println(luasSegitiga(alas, tinggi));
    
        // Lingkaran
    
        int jari = scan.nextInt();
    
        kelilingLingkaran(jari);
        System.out.println(luasLingkaran(jari));
  
    }
  
    // Keliling
  
    static void kelilingPersegi(int sisi) {
        System.out.println("Keliling persegi adalah : " + (sisi * 4));
    }
  
    static void kelilingPersegiPanjang(int panjang, int lebar) {
        System.out.println("Keliling persegi panjang adalah : " + (2 * (panjang + lebar)));
    }
  
    static void kelilingSegitiga(int sisi1, int sisi2, int sisi3) {
        System.out.println("Keliling segitiga adalah : " + (sisi1 + sisi2 + sisi3));
    }
  
    static void kelilingLingkaran(double jari) {
        System.out.println("Keliling lingkaran adalah : " + (2 * 3.14 * jari));
    }
  
    // Luas
  
    static int luasPersegi(int sisi) {
        return sisi * sisi;
    }
  
    static int luasPersegiPanjang(int panjang, int lebar) {
        return panjang * lebar;
    }
  
    static double luasSegitiga(double alas, double tinggi) {
        return (double) (alas * tinggi) / 2;
    }
  
    static double luasLingkaran(double jariJari) {
        return 3.14 * jariJari * jariJari;
    }
}