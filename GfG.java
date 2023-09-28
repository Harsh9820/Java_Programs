import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int sum = sc.nextInt();
                    int arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                    arr[i] = sc.nextInt();
                    
                    Gfg ob = new Gfg();
                    System.out.println(ob.perfectSum(arr,n,sum));
                }
        }
}    
// } Driver Code Ends


class Gfg{

	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    // Your code goes here
        int c=0;
	    for(int i=0; i<n; i++){
            int cSum = arr[i];
            if(cSum == sum){
                c++;
            }
            else{
                for(int j=i+1; j<n; j++){
                    cSum += arr[i];
                    if(cSum == sum){
                        c++;
                    }
                }
            }
        }
        return c;
	} 
}