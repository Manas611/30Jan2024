public class Problem13 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7};
        int m = 9;
        int n = arr.length;
        boolean flag = true;

        for(int i=0;i<n;i++)
        {
            if(arr[i]>=m)
            {
                System.out.println(i);
                flag = false;
                break;
            }
        }

        if(flag == true)
            System.out.println(n);
    }
}
