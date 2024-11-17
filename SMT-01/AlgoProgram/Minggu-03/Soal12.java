import  java.util.Scanner;

public class Soal12 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println();

        System.out.print("Masukkan trophy : ");
            int trophy = scan.nextInt();

        System.out.print("Masukkan persentase (1-100)% : ");
            int persen = scan.nextInt();

        System.out.print("Masukkan status townhall (true/false) : ");
            boolean th = scan.nextBoolean();

        String status;
        int shield,bintang;

        if(th == false && persen < 50){
            status = "Victory";
            bintang = 3;
            shield = persen < 40 ? 0 : 2;

        } else {
            status = "Defeat";
            bintang = (th == true ? 1 : 0) + (persen >= 50 ? 1 : 0);
            shield = th == true ? 2 : 0;

            if(persen == 100 && th == true){
                bintang++;
                shield += 2;
            }
        }
        
        System.out.println();
        System.out.println("Summary");
        System.out.println("Trophy : " + (status == "Victory" ? "+" : "-") + (trophy*bintang/3));
        System.out.println("Status : " + status);
        System.out.println("Shield : " + shield + " jam");
        System.out.println("Bintang : " + (bintang==3?0:bintang));
    }
}