import java.util.Scanner;

public class King {

    static Scanner scan = new Scanner(System.in);

    public static void  main(String[] args){

        System.out.println();

        // Input;
        String[] temp = scan.nextLine().split(" ");
        int[][] matrix = new int[Integer.parseInt(temp[0])][Integer.parseInt(temp[0])];

        for(int i = 0; i<matrix.length; i++){

            for(int j = 0; j<matrix.length; j++){
                matrix[i][j] = 0;
            }
        }
        
        // Input prajurit

        for(int i = 0; i<Integer.parseInt(temp[1]); i++){

            String[] m = scan.nextLine().split(" ");
            
            matrix[Integer.parseInt(m[0])-1][Integer.parseInt(m[1])-1] = Integer.parseInt(m[2]);
        }

        // Input serangan

        for(int i = 0; i<Integer.parseInt(temp[2]); i++){

            String[] m = scan.nextLine().split(" ");

            if(m[0].equals("2")){

                for(int j = 0; j<matrix.length; j++){

                    if(matrix[j][Integer.parseInt(m[2])-1] <= 0){
                        continue;
                    }

                    matrix[j][Integer.parseInt(m[2])-1] -= Integer.parseInt(m[1]);
                }


            } else if(m[0].equals("1")){

                for(int j = 0; j<matrix.length; j++){

                    if(matrix[Integer.parseInt(m[2])-1][j] <= 0){
                        continue;
                    }

                    matrix[Integer.parseInt(m[2])-1][j] -= Integer.parseInt(m[1]);
                }


            } else {

                for(int j = 0; j<matrix.length; j++){

                    for(int k = 0; k<matrix.length; k++){

                        if(k == j || k == matrix.length-j-1){

                            if(matrix[j][k] <= 0){
                                continue;
                            }

                            matrix[j][k] -= Integer.parseInt(m[1]);
                        }
                    }
                }
            }
        }

        // Input search
        
        for(int i = 0; i<Integer.parseInt(temp[3]); i++){

            String[] m = scan.nextLine().split(" ");
            
            int j = Integer.parseInt(m[0])-1;
            int k = Integer.parseInt(m[1])-1;
            int radius = Integer.parseInt(m[2])-1;

            int ctr = 0;
            int hp = 0;
            for(int o = j-radius; o<=j+radius; o++){

                for(int p = k-radius; p<=k+radius; p++){

                    if(matrix[o][p] <= 0){
                        continue;
                    }

                    ctr++;
                    hp += matrix[o][p];
                }
            }

            if(ctr != 0){
                System.out.println("Ada prajurit " + ctr + " dengan hp " + hp);
            } else {
                System.out.println("Tidak ada prajurit");
            }
        }
    }
}

