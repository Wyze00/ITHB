import java.util.Scanner;

public class Soal9 {

    public static void main(String[] args){
  
        Scanner scan = new Scanner(System.in);
    
        String text = "qwertyuiop\nasdfghjkl\nzxcvbnm";
    
        System.out.println("Masukkan huruf yang ingin dicari");
    
        while(!cariHuruf(scan.next(),text));
    }
  
    static boolean cariHuruf(String huruf, String text){
  
        String[] baris = text.split("\n");
    
        for(int i = 0; i < baris.length; i++){
    
            int index = baris[i].indexOf(huruf);
      
            if(index != -1){
              
                System.out.printf("Baris %d, Huruf ke-%d\n",i+1,index+1);
                return true;
            }
        }
    
        System.out.println("Huruf tidak ditemukan silahkan coba lagi");
        
        return false;
    }
}