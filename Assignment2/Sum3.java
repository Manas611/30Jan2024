import java.util.ArrayList;
import java.util.Arrays;

public class Sum3 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,8,9};
        int k = 13;
        Arrays.sort(arr);

        int n = arr.length; 
        for(int i=0;i<n;i++)
        {
            int s = i+1;
            int e = n-1;
            while(s<e)
            {
                if(arr[i] + arr[s] + arr[e] == k)
                {
                    System.out.println(arr[i] + " "+ arr[s] + " "+arr[e]);
                    s++;
                    e--;

                    while(s<e && arr[s] == arr[s-1])
                    {
                        s++;
                    }
                    while (s<e && arr[e] == arr[e+1]) {
                        e--;
                    }

                }
                else if(arr[s] + arr[e] + arr[i]  > k)
                {
                    e--;
                }
                else if(arr[s] + arr[e] + arr[i] < k)
                {
                    s++;
                }
            }
        }
    }
}
