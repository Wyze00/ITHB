import java.util.Scanner;

public class Latihan1 {

    public static void main(String[] args){

	Scanner scan = new Scanner(System.in);

	/**
	 * Tugas 01 {Program untuk menghitung pitagoras}
	 * 
	 * Var a,b,c int {a: angka 1, b: angka 2,c: hasil}
	 *
	 */
	
	 int a = 3;
	 int b = 4;
	 int c = (int) Math.sqrt(a * a + b * b);

	 System.out.println("Hasilnya adalah : " + c);
	 System.out.println();

		 
	 /**
	  * Tugas 02 {Program untuk menghitung volume kerucut}
	  *
	  * Var π,r,t double {π: Math.pi, r: jari - jari, t: tinggi}
	  *
	  */

	 final double PI = 3.14;
	 double r = 10;
	 double t = 10;
	 double V = (PI * r * r * t) / 3;

	 System.out.println("Volume kerucut = " + V);	      
     System.out.println();	


	 /**
	  * Tugas 03 {Program sederhana untuk data seseorang}
	  *
	  * Var nama, alamat telepon, gender String {}
	  *     status boolean {}
	  *     penghasilan double {}
	  *
	  */

	  String nama, alamat, telepon, gender;
	  int usia;
	  boolean status;
	  double penghasilan;

	  System.out.print("Masukkan Nama: ");
	  nama = scan.nextLine();

	  System.out.print("Masukkan Alamat: ");
          alamat = scan.nextLine();

	  System.out.print("Masukkan Telepon: ");
          telepon = scan.nextLine();

	  System.out.print("Masukkan Gender: ");
          gender = scan.nextLine();

	  System.out.print("Masukkan Usia: ");
          usia = scan.nextInt();

	  System.out.print("Masukkan Status: ");
          status = scan.nextBoolean();

	  System.out.print("Masukkan penghasilan: ");
          penghasilan = scan.nextDouble();

	  System.out.println();

	  System.out.println("Nama saya " + nama + ", seorang " + gender + " tinggal di " + alamat + " dan Telepon " + telepon + ". Tahun ini usia saya " + usia + ", " +status + " , dan penghasilan saya " + penghasilan);
	  System.out.println();

	
	  /**
	   * Tugas 04 {Program untuk mengkonversi detik menjadi format 'HH:MM:SS'}
	   *
	   * Var detik, menit, jam int {}
	   *
	   */

	   int jam, menit, detik;

	   System.out.print("Masukkan detik : ");
	   detik = scan.nextInt();

	   jam = detik / 3600;
	   detik = detik % 3600;

	   menit = detik / 60;
	   detik = detik % 60;

	   System.out.println("Konversi : " + jam + "jam, " + menit + " menit, " + detik + "detik.");

	   System.out.println();
	
      /**
	   * Tugas 05 {Program}
	   *
	   * Var {}
	   *
	   */

	   int nilai = 0;

	   System.out.println("Audisi pemazmur Provinsi Jawa Barat");
	   System.out.println();

	   System.out.println("Juri ke-1");
	   System.out.println();
	   System.out.println("Penilaian Teknikal");
	   System.out.print("Intonasi : ");
	   nilai = nilai + scan.nextInt();
	   System.out.print("Kualitas Vokal : ");
	   nilai = nilai + scan.nextInt();
	   System.out.println("Penilaian Artistik");
       System.out.print("Kesesuaian dengan partitur : ");
       nilai = nilai + scan.nextInt();
       System.out.print("Penampilan secara keseluruhan : ");
       nilai = nilai + scan.nextInt();

	


	  


    }

}