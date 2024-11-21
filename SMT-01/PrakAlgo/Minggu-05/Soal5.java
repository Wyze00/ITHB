import java.util.Scanner;

public class Soal5 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int random = (int) Math.ceil(Math.random()*50);
        int kesempatan = 1;
        int temp;

        System.out.println();
        System.out.println(random);

        System.out.println("Tebak angka antara 1 sampai 50, anda memiliki 10 kesempatan \n");
        
        while(kesempatan <= 10){

            System.out.printf("Kesempatan ke-%d : ",kesempatan);
                temp = scan.nextInt();

            if(temp == random){
                System.out.printf("Selamat! anda berhasil menebak angka : %d", random);
                break;
            } else {
                System.out.printf("Terlalu %s kesempaan tersisa: %d \n",(temp > random ? "besar" : "kecil"),(10-kesempatan));
            }

            kesempatan++;

            if(kesempatan == 11){
                System.out.printf("Maaf, Anda kehabisan kesempatan. Angka yang dicari adalah %d.",random);
            }
        }
    }
}
