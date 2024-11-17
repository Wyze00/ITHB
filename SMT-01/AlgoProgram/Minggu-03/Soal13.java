import  java.util.Scanner;

public class Soal13 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Cleric (C)");
        System.out.println("Warrior (W)");
        System.out.println("Ranger (R)");
        System.out.print("Pilih job : ");
            char job = scan.next().charAt(0);   
        System.out.println();


        System.out.println("Begginer (B)");
        System.out.println("Intermediate (I)");
        System.out.println("Expert (E)");
        System.out.print("Pilih tinggkatan : ");
            char lvl = scan.next().charAt(0);

        final int B = 1000;
        final int I = B + 1400;
        final int E = I + 1500;

        int mastery = (lvl == 'B') ? B : (lvl == 'I') ? I : E;

        int fighting,archery,nursing;

        if(job == 'C'){
            nursing = (int) (mastery * 0.5 ) / 20;
            fighting = (int) (mastery * 0.3 ) / 20;
            archery = (int) (mastery * 0.2 ) / 20;

        } else if(job == 'W'){
            nursing = (int) (mastery * 0.2 ) / 20;
            fighting = (int) (mastery * 0.5 ) / 20;
            archery = (int) (mastery * 0.3 ) / 20;

        } else {
            nursing = (int) (mastery * 0.2 ) / 20;
            fighting = (int) (mastery * 0.3 ) / 20;
            archery = (int) (mastery * 0.5 ) / 20;

        }

        System.out.println();
        System.out.println("Summary");
        System.out.println("        Job --> " + job);
        System.out.println("Level Skill --> " + (lvl == 'B' ? "Beginner" : lvl == 'I' ? "Intermediate" : "Expert"));
        System.out.println("Latihan yang dibutuhkan : ");
        System.out.println("- " + fighting + " kali latihan Fighting");
        System.out.println("- " + archery + " kali latihan Archery");
        System.out.println("- " + nursing + " kali latihan Nursing");
    }
}