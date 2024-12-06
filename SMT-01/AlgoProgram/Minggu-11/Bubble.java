import java.util.Arrays;

public class Bubble {

    public static void main(String[] args){

        int[] arr = {5,2,3,1,4};

        bubbleDescendingBelakang(arr);

    }

    static void bubbleAscendingDepan(int[] arr){

        for(int i = 0; i<arr.length; i++){

            for(int j = 0; j<arr.length-i-1; j++){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    System.out.println(Arrays.toString(arr));
                }
            }
        }
    }

    static void bubbleAscendingBelakang(int[] arr){

        for(int i = arr.length-1; i>-1; i--){

            for(int j = arr.length-1; j>arr.length-i-1; j--){

                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                    System.out.println(Arrays.toString(arr));
                }
            }
        }
    }

    static void bubbleDescendingDepan(int[] arr){

        for(int i = 0; i<arr.length; i++){

            for(int j = 0; j<arr.length-i-1; j++){

                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    System.out.println(Arrays.toString(arr));
                }
            }
        }
    }

    static void bubbleDescendingBelakang(int[] arr){

        for(int i = arr.length-1; i>-1; i--){

            for(int j = arr.length-1; j>arr.length-i-1; j--){

                if(arr[j] > arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                    System.out.println(Arrays.toString(arr));
                }
            }
        }
    }
}