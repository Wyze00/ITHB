import java.util.Scanner;

public class Soal10 {

    public static void main(String[] args) {
  
        Scanner scan = new Scanner(System.in);
    
        int harga = 0;
        String nama = "TS_" + randomGen();
    
        System.out.println("Masukkan makanan");
        String makanan = scan.next();
    
        while(!makanan.equals("X")){
    
            harga += tambahHarga(makanan);
            makanan = scan.next();
        }
    
        System.out.printf("%s harus membayar %d\n",nama,harga);
    }
  
    static int randomGen(){
        return (int) Math.ceil(Math.random()*9999);
    }
  
    static int tambahHarga(String makanan){
      
        if(makanan.equals("Risoles")){
            return 4000;
        } else if(makanan.equals("Mie-Ayam")){
            return 15000;
        } else if(makanan.equals("Sosis")){
            return 8000;
        } else if(makanan.equals("Indomie")){
            return 6000;
        } else if(makanan.equals("Es-Krim")){
            return 5000;
        } else {
            throw new Error();
        }
    }
}