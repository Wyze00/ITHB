import java.util.Scanner;

public class Soal2 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        Karyawan[] karyawan = new Karyawan[scan.nextInt()];

        for(int i = 0; i<karyawan.length; i++){

            karyawan[i] = new Karyawan(scan.next(), scan.next());
            karyawan[i].alamat = new Alamat(scan.next(), scan.next(), scan.next());
            karyawan[i].penghasilan = new Penghasilan(scan.nextInt(), scan.nextInt(), scan.nextInt());
        }
    }
}

class Karyawan {

    String nama, jabatan;
    Alamat alamat;
    Penghasilan penghasilan;

    Karyawan(String nama, String jabatan){
        this.nama = nama;
        this.jabatan = jabatan;
    }
}

class Alamat {

    String jalan, kota, provinsi;

    Alamat(String jalan, String kota, String provinsi){
        this.jalan = jalan;
        this.kota = kota;
        this.provinsi = provinsi;
    }
}

class Penghasilan {

    int gaji, tunjanganTransport, tunjanganMakan;

    Penghasilan(int gaji, int tunjanganTransport, int tunjanganMakan){
        this.gaji = gaji;
        this. tunjanganTransport = tunjanganTransport;
        this. tunjanganMakan = tunjanganMakan;
    }
}

