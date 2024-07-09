//Q.1. Shift zeros and ones
//Problem Description:
//An Array contains only 0 and 1, you'll have to shift all the 0s to one side and all 1s to the other side in an array.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int temp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int arr_size = 0;
        if (sc.hasNextInt()) {
            arr_size = sc.nextInt();
        }

        int[] arr = new int[arr_size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr_size; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }

        for (int x = 0; x < arr_size; x++) {
            if (arr[x] == 1) {
                for (int y = x; y < arr_size; y++) {
                    if (arr[y] == 0) {

                        temp = arr[x];
                        arr[x] = arr[y];
                        arr[y] = temp;

                        count++;
                        break;
                    } else {
                        count++;
                    }
                }
            }
        }
        for (int z = 0; z < arr_size; z++) {
            System.out.print(arr[z]);
        }
    }


}