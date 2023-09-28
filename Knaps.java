import java.util.Scanner;

public class Knaps {

    static int getMaxDens(int n, int[] v, int[] w){
        int maxIndex = 0;
		double maxVal = 0;
        for(int i = 0; i< n; i++){
            if(w[i] != 0 && ((double) v[i] / w[i] < maxVal)){
                maxIndex = i;
                maxVal = ((double) v[i] / w[i]);
            }
        }
        return maxIndex;
    }

    static double getOptimalValue(int n, int c, int[] v, int[] w){
        int sum = 0;
        double val = 0;
        for(int j = 0; j < n; j++){
            sum += w[j];
        }
        for(int i = 0; i < n; i++){
            if (c <=0) return val;
            else if(sum <= c){
                val += (double) v[i] * w[i];
            }
            else{
                int index = getMaxDens(n, v, w);
                int a = Math.min(c, w[index]);
                val += a * (double) v[index] / w[index];
                w[index] -= a;
                c -= a;
            }
        }
        return val;
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
        System.out.println(getOptimalValue(n, capacity, values, weights));
        sc.close();
    }
}
