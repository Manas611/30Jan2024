import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        int n = arr.length;

        Arrays.sort(arr);
        int dupli = -1;
        int arrSum = 0;

        for(int i=0;i<n-1;i++)
        {
            arrSum+=arr[i];
            if(arr[i] == arr[i+1])
            {
                dupli = arr[i];
            }
        }
        arrSum+=arr[n-1];

        int sum = 0;
        sum = n*(n+1)/2;

        arrSum = arrSum - dupli;

        System.out.println(sum-arrSum+ " " + dupli);

    }
}
