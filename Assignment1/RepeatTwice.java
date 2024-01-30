import java.util.Arrays;

public class RepeatTwice {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1, 32, 3, 6,2,70,32,70};

        Arrays.sort(arr);

        int n = arr.length;
        boolean flag = true;

        for(int i=0;i<n-1;i=i+2)
        {
            if(arr[i] != arr[i+1])
            {
                System.out.println(arr[i]);
                flag = false;
                break;
            }
        }

        if(flag==true)
        System.out.println(arr[n-1]);


    }
}
