import  java.util.Scanner;

public class Soal3 {

    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Pasien[] pasien = new Pasien[10];

        // Input;
        inputPasien(pasien);

        // Output
        jumblahPasien(pasien);
        umurPasien(pasien);
        namaPasien(pasien);
    }

    static void inputPasien(Pasien[] pasien){

        for(int i = 0; i<11; i++){

            if(i == 10){
                System.out.println("Penuh");
                break;
            }

            System.out.println("Mau input ?");
            if(scan.nextBoolean()){

                System.out.println("Masukan nama, alamat, telepon, usia, gender, bpjs");
                pasien[i] = new  Pasien(scan.next(), scan.next(), scan.next(), scan.nextInt(), scan.nextInt(), scan.nextBoolean());

            } else {
                break;
            }
        }
    } 

    static void jumblahPasien(Pasien[] pasien){

        for(int i = 0; i<10; i++){

            if(pasien[i] == null){
                System.out.println("Kamar ada : " + i);
                System.out.println("Kamar kosong : " + (10-i));
                break;
            } else if(i == 10){
                System.out.println("Kamar ada : 10");
                System.out.println("Kamar kosong : 0");
            }
        }
    }

    static void umurPasien(Pasien[] pasien){

        System.out.println("Masukkan umur pasien");
        int umur = scan.nextInt();
        int ctr = 0;

        for(int i = 0; i<10; i++){

            if(pasien[i] == null){
                break;
            } else if(pasien[i].usia < umur && pasien[i].bpjs){
                ctr++;
            }
        }

        System.out.println("Umur diabawah " + umur + " dan ada bpjs : " + ctr);
    }

    static void namaPasien(Pasien[] pasien){

        System.out.println("Masukkan nama pasien");
        String nama = scan.next();

        for(int i = 0; i<10; i++){

            if(pasien[i] == null){
                System.out.println("Nama tidak ada");
                break;
            } else if(pasien[i].nama.equalsIgnoreCase(nama)){
                System.out.println("Nama ditemukan");
                break;
            }
        }
    }
}

class Pasien {
    String nama, alamat, telepon;
    int usia, gender;
    boolean bpjs;

    Pasien(String nama, String alamat, String telepon, int usia, int gender, boolean bpjs) {
        this.alamat = alamat;
        this.gender = gender;
        this.nama = nama;
        this.telepon = telepon;
        this.usia = usia;
        this.bpjs = bpjs;
    }
}