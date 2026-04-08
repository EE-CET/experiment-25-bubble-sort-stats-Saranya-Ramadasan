import java.util.Scanner;
public class BubbleSortStats {
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int totalSwaps = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    totalSwaps++;
                }
            }
        }
        
        System.out.println(totalSwaps);
        System.out.println(arr[0]);
        System.out.println(arr[n - 1]);
        
        sc.close();
    }
    
}
