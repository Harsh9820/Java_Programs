import java.util.Scanner;

public class Knaps {
    static int BestItem(int[] w, int[] v, int n){
        int maxValue = 0;
        int index = 0;
        for(int i =0;i<n;i++){
            if(w[i] > 0){
                if(v[i] / w[i] > maxValue){
                    maxValue = v[i] / w[i];
                    index = i;
                }
            }   
        }
        return index;
    }
    static double knapSack(int c, int[] w, int[] v, int n){
        //int[] res = new int[n];
        double total = 0;
        
        for(int i = 0; i< n; i++){
            if(c==0){
                return total;
            }
            else{
                int bI = BestItem(w, v, n);
                if(i == bI && c > 0){
                    total = total + (double)(v[i] / w[i]) * w[i];
                    c = c - w[i];
                }
            }
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int capacity = sc.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
            weights[i] = sc.nextInt();
        }
        System.out.println(knapSack(capacity, weights, values, n));
    }
}
