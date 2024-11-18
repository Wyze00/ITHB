import java.util.Scanner;

public class Soal8 {

    public static void main(String[] args) {
  
        Scanner scan = new Scanner(System.in);
    
        double jarak = 0;
    
        System.out.println("Masukkan destinasi : ");
        
        String destinasi1 = scan.next();
        String destinasi2 = scan.next();
    
        while(!destinasi2.equals("X")){
    
            jarak += dest(destinasi1,destinasi2);
  
            destinasi1 = destinasi2;
            destinasi2 = scan.next();
        }
    
        System.out.println("Masukkan pesawat");
    
        int hargaPesawat = getPesawat(scan.next());
    
        double harga = (Math.ceil(jarak) * hargaPesawat)/3;
    
        System.out.printf("Dengan jarak %.0f km harga yang harus dibayar adalah Rp %.0f0\n", jarak, harga);
    }
  
    static double hitungJarak (double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
  
    static double dest(String destinasi1, String destinasi2){
  
        double x1 = getX(destinasi1);
        double y1 = getY(destinasi1);
        double x2 = getX(destinasi2);
        double y2 = getY(destinasi2);
      
        return hitungJarak(x1, y1, x2, y2);
    }
  
    static double getX(String destinasi){
  
        if(destinasi.equals("Indonesia")){
            return 100;
        } else if(destinasi.equals("Jerman")){
            return 15;
        } else if(destinasi.equals("Russia")){
            return 129;
        }  else if(destinasi.equals("China")){
            return 283;
        } else if(destinasi.equals("Burkina Faso")){
            return 374;
        } else if(destinasi.equals("Ukraina")){
            return 203;
        } else if(destinasi.equals("Afghanistan")){
            return 2390;
        } else if(destinasi.equals("Inggris")){
            return 394;
        } else if(destinasi.equals("Prancis")){
            return 232;
        } else {
            throw new Error();
        }
    }
  
    static double getY(String destinasi){
  
        if(destinasi.equals("Indonesia")){
            return 23;
        } else if(destinasi.equals("Jerman")){
            return 1243;
        } else if(destinasi.equals("Russia")){
            return 3948;
        }  else if(destinasi.equals("China")){
            return 382;
        } else if(destinasi.equals("Burkina Faso")){
            return 10;
        } else if(destinasi.equals("Ukraina")){
            return 989;
        } else if(destinasi.equals("Afghanistan")){
            return 1;
        } else if(destinasi.equals("Inggris")){
            return 38;
        } else if(destinasi.equals("Prancis")){
            return 90;
        } else {
            throw new Error();
        }
    }
  
    static int getPesawat(String pesawat){
  
        int harga = 0;
  
        if(pesawat.equals("Boeing-737")){
            harga = 1500;
        } else if(pesawat.equals("Airbus-A320")){
            harga = 1800;
        } else if(pesawat.equals("Boeing-787-Dreamliner")){
            harga = 2900;
        } else if(pesawat.equals("Sukhoi-Su-27")){
            harga = 900; 
        } else if(pesawat.equals("Boeing-747")){
            harga = 1200;
        } else if(pesawat.equals("Sikorsky-UH-60 Black Hawk")){
            harga = 3700;
        } else if(pesawat.equals("Gulfstream-G650")){
            harga = 600;
        } else if(pesawat.equals("Cessna-Citation-X")){
            harga = 350;
        } else {
            harga = 0;
        }
      
        return harga;
    }
}