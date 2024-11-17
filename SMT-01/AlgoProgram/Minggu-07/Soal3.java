import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int jMhs = 10;
        String NIM[] = new String[jMhs];
        String nama[] = new String[jMhs];
        int quiz[] = new int[jMhs];
        int uts[] = new int[jMhs];
        int uas[] = new int[jMhs];
        float na[] = new float[jMhs];

        na[9] = 0;

        int juara1 = 9;
        int juara2 = 9;
        int juara3 = 9;
        int harapan1 = 9;
        int harapan2 = 9;
        int harapan3 = 9;

        for(int i = 0; i<jMhs; i++){

            NIM[i] = scan.next();
            nama[i] = scan.next();
            quiz[i] = scan.nextInt();
            uts[i] = scan.nextInt();
            uas[i] = scan.nextInt();

            na[i] = (float) ((uas[i]*0.4)+(uts[i]*0.35)+(quiz[i]*0.25));

            // Juara

            if(na[i] > na[harapan3]){
                harapan3 = i;
            }

            if(na[harapan3] > na[harapan2]){
                harapan3 = harapan2;
                harapan2 = i;
            }

            if(na[harapan2] > na[harapan1]){
                harapan2 = harapan1;
                harapan1 = i;
            }

            if(na[harapan1] > na[juara3]){
                harapan1 = juara3;
                juara3 = i;
            }

            if(na[juara3] > na[juara2]){
                juara3 = juara2;
                juara2 = i;
            }

            if(na[juara2] > na[juara1]){
                juara2 = juara1;
                juara1 = i;
            }
        }

        System.out.println();
        System.out.println(na[juara1]);
        System.out.println(na[juara2]);
        System.out.println(na[juara3]);
        System.out.println(na[harapan1]);
        System.out.println(na[harapan2]);
        System.out.println(na[harapan3]);
    }
}