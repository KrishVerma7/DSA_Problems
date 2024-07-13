//Q.1. Find kth largest elements in an array
//This will use the concept of priority queue

import java.util.*;

public class July_11_Problem_1 {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements: ");
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
            pq.add(arr[i]);
        }

        for (int i = 0; i < size; i++) {
            arr[i] = pq.poll();
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the kth largest required number: ");
        int k = sc.nextInt();
        System.out.println(arr[k - 1]);
    }
}

