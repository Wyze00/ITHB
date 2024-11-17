

public class NathanSebastianTanusubroto_1124037_Modul1_No1 {
    public static void main(String[] args) {
        
    /**
	 * Tugas 01a {Program untuk menghitung pitagoras}
	 * 
	 * Var angka1, angka2, hasil {int};
	 *
	 */
	
	 int angka1 = 3;
	 int angka2 = 4;
	 int hasil = (int) Math.sqrt(angka1 * angka1 + angka2 * angka2);

     System.out.println("Program untuk menghitung pitagoras");
     System.out.println();

     System.out.println("a : " + angka1);
     System.out.println("b : " + angka2);

	 System.out.println("c adalah :  " + hasil);
	 System.out.println();


	/**
	 * Tugas 01b {Program untuk menghitung volume kerucut}
	 *
     * Var PI,r,t double {π: Math.PI, r: jari - jari, t: tinggi}
	 *
	 */

	 final double PI = Math.PI;
	 double r = 10;
	 double t = 10;
	 double V = (PI * r * r * t) / 3;

	 
     System.out.println("Program untuk menghitung Volume kerucut");
     System.out.println();

     System.out.println("PI : " + PI);
     System.out.println("Jari-jari : " + r);
	 System.out.println("Tinggi : " + t);
 
	 System.out.println("Volume kerucut = " + V);	      
	 System.out.println();

    }
}
