import java.util.Scanner;

public class Soal4 {

    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan nama : ");
            String nama = scan.next();

        int step = 0;
        double gaji = 0;
        double balance = 0;
        double tax = 0;
        String pekerjaan = "";
        int knowledge = 0;
        int kredit = 0;

        while(step < 40){

            scan.nextLine();
            
            int stepBefore = step;
            step += Math.ceil(Math.random()*5);

            if(stepBefore < 10 && step >= 10){step = 10;}
            else if(stepBefore < 20 && step >= 20){step = 20;}
            else if(stepBefore < 40 && step >= 40){step = 40;}
            else {}
            
            System.out.printf("\nRoll dadu : %d\nStep saat ini : %d \n",step-stepBefore,step);

            // Kuliah

            if(step <= 10){
                if(step % 2 == 0){
                    knowledge++;
                    System.out.println("Knowledge : " + knowledge);
                }

                if(step == 10){

                    switch (knowledge) {
                        case 1:
                            pekerjaan = "Sales";
                            gaji = 700_000;
                            tax = 90_000;
                            break;
                        case 2:
                            pekerjaan = "Guru";
                            gaji = 1_200_000;
                            tax = 300_000;
                            break;
                        case 3:
                            pekerjaan = "Dokter";
                            gaji = 2_000_000;
                            tax = 500_000;
                            break;
                        case 4:
                            pekerjaan = "Dosen";
                            gaji = 3_000_000;
                            tax = 800_000;
                            break;
                        default:
                            pekerjaan = "Arsitek";
                            gaji = 5_000_000;
                            tax = 1_000_000;
                    }

                    System.out.println("\nPencet ENTER untuk melihat pekerjaanmu");
                    scan.nextLine();
                    System.out.printf("\nPekerjaan : %s \nGaji : %.2f \nPajak : %.2f\n",pekerjaan,gaji,tax);
                }

            } else if(step <= 20){
                if(step % 3 == 0 || step % 7 == 0){
                    kredit++;
                    System.out.println("Kredit : " + kredit);

                }
                else {
                    if(step % 2 == 0){
                    System.out.println("\nAnda harus membayar pajak sebesar : " + tax + "\n");
                        balance -= tax;
                    }
                }

                if(step == 20){

                    double gajiBefore = gaji;

                    switch (kredit) {
                        case 1:
                            gaji += 100_000;
                            break;
                        case 2:
                            gaji += 300_000;
                            break;
                        case 3:
                            gaji += 500_000;
                            break;
                        case 4:
                            gaji += 1_000_000;
                    }

                    System.out.println("Tekan ENTER untuk melihat hasil sementara");
                    scan.nextLine();
                    System.out.println("\nGaji anda bertambah sebesar : " + (gaji-gajiBefore));
                    System.out.println("Gaji anda saat ini : " + gaji);
                }

            } else {

                switch (step) {
                    case 22:
                    case 24:
                    case 26:
                    case 27:
                    case 30:
                    case 34:
                    case 39:
                        balance += 100_000;
                        System.out.println("\nBalance bertambah sebesar : " + 100_000);
                    }
                    
                    switch (step) {
                    case 21:
                    case 25:
                    case 29:
                    case 31:
                    case 33:
                    case 35:
                        balance -= 100_000;
                        System.out.println("\nBalance berkurang sebesar : " + 100_000);
                }
                
                if(step == 40){

                    balance = balance + gaji;

                    System.out.println("\nHasil dari permainan : ");
                    System.out.println("Nama Player : " + nama);
                    System.out.printf("Pekerjaan %s : %s\n",nama,pekerjaan);
                    System.out.printf("Gaji yang didapatkan oleh %s : %.2f\n", nama,gaji);
                    System.out.printf("Balance yang dimiliki %s sekarang : %.2f",nama,balance);
                }

            }
            System.out.println("\nTekan Enter untuk roll dadu");
        }
    }
}