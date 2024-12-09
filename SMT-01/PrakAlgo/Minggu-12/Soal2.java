import java.util.Scanner;

public class Soal2 {

  static Scanner scan = new Scanner(System.in);
  
  public static void main(String[] args) {

    // input
    Pasien[] pasien = new Pasien[10];
    inputDataPasien(pasien);

    // Output
    System.out.println("Jumblah pasien : " + jumblahPasien(pasien));
    System.out.println("Usia yang dibawah : " + usiaPasien(pasien));
    System.out.println("Nama ada di index ke : " + namaPasien(pasien));
    penyakitPasien(pasien);
    
  }

  static void inputDataPasien(Pasien[] pasien){

    for(int i = 0; i<11; i++){

      if(i == 10){
        System.out.println("Kamar penuh");
        break;
      }

      System.out.println("Masukkan nama, alamat, telepon, usia, bpjs");
      pasien[i] = new Pasien(scan.next(), scan.next(), scan.next(), scan.nextInt(), scan.nextBoolean());
      System.out.println("Masukkan penyakit, deskripsi, harga");
      pasien[i].penyakit = new Penyakit(scan.next(), scan.next(), scan.nextDouble());

      System.out.println("Mau input ? (true/false)");
      if(!scan.nextBoolean()){
        break;
      }
    }
  }

  static int jumblahPasien(Pasien[] pasien){

    int jmlPasien = 0;

    for(int i = 0; i<10; i++){
      if(pasien[i] == null){
        break;
      }
      jmlPasien++;
    }
    
    return jmlPasien;
  }

  static int usiaPasien(Pasien[] pasien){

    System.out.println("Masukan usia");
    int usia = scan.nextInt();
    int jmlPasien = 0;

    for(int i = 0; i<10; i++){
      if(pasien[i] == null){
        break;
      }
      if(pasien[i].usia < usia){
        jmlPasien++;
      }
    }

    return jmlPasien;
  }

  static int namaPasien(Pasien[] pasien){

    System.out.println("Masukan nama");
    String nama = scan.next();

    for(int i = 0; i<10; i++){
      if(pasien[i] == null){
        break;
      }
      if(pasien[i].nama.equals(nama)){
        return i;
      }
    }

    return -1;
  }

  static void penyakitPasien(Pasien[] pasien){

    System.out.println("Masukan nama penyakit");
    String penyakit = scan.next();

    for(int i = 0; i<10; i++){
      if(pasien[i] == null){
        break;
      }
      if(pasien[i].penyakit.nama.equals(penyakit)){
        System.out.println("Nama : " + pasien[i].nama);
      }
    }
  }
}

class Pasien {

  String nama, alamat, telepon;
  int usia;
  boolean bpjs;
  Penyakit penyakit;

  Pasien(String nama, String alamat, String telepon, int usia, boolean bpjs){
    this.nama = nama;
    this.alamat = alamat;
    this.telepon = telepon;
    this.usia = usia;
    this.bpjs = bpjs;
  }
}

class Penyakit {

  String nama, deskripsi;
  double harga;

  Penyakit(String nama, String deskripsi, double harga){
    this.nama = nama;
    this.deskripsi = deskripsi;
    this.harga = harga;
  }
}