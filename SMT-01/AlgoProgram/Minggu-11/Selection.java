import java.util.Arrays;

public class Selection {

    public static void main(String[] args){

        int[] arr = {5,2,3,1,4,8,6,10,9,7};

        selectionDescendingBelakang(arr);

    }

    static void selectionAscendingDepan(int[] arr){

        for(int i = 0; i<arr.length; i++){

            int min = i;
            for(int j = i+1; j<arr.length; j++){

                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

            System.out.println(Arrays.toString(arr));
        }
    }

    static void selectionAscendingBelakang(int[] arr){

        for(int i = arr.length-1; i>-1; i--){

            int min = i;
            for(int j = i-1; j>-1; j--){

                if(arr[j] > arr[min]){
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

            System.out.println(Arrays.toString(arr));
        }
    }

    static void selectionDescendingDepan(int[] arr){

        for(int i = 0; i<arr.length; i++){

            int max = i;
            for(int j = i+1; j<arr.length; j++){

                if(arr[j] > arr[max]){
                    max = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;

            System.out.println(Arrays.toString(arr));
        }
    }

    static void selectionDescendingBelakang(int[] arr){

        for(int i = arr.length-1; i>-1; i--){

            int max = i;
            for(int j = i-1; j>-1; j--){

                if(arr[j] < arr[max]){
                    max = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;

            System.out.println(Arrays.toString(arr));
        }
    }
}