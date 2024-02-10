import java.util.Scanner;

public class FractionalKnapsack {
    public static int getMaxIndex(int[] v, int[] w, int p){
        double max = 0;
        int index=0;
        int n = w.length;

        for(int i=0; i<n; i++){
            if(p!=i && v[i]/w[i] > max && w[i] != 0){
                max = (double) v[i]/w[i];
                index = i;
            }
        }
        return index;
    }

    public static double getOptimalValue(int capacity, int[] v, int[] w) {
        double value = 0.0;
        double a;
        int bestIndex = -1;  
        for (int i = 0; i < w.length; i++) {
            bestIndex = getMaxIndex(v, w, bestIndex);
            if (capacity == 0){ 
                return value;
            }
            else if(capacity > w[bestIndex]){
                a = w[bestIndex];
            }
            else{
                a = capacity;
            }
            value = value + (double)(a * (v[bestIndex]/w[bestIndex]));
            //w[bestIndex] -= a;
            capacity -= a;
            System.out.println(capacity + " - " + a + " value = " + value + "Weight - " + w[bestIndex]);
        }
        return value;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int capacity = sc.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
            weights[i] = sc.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
} 
