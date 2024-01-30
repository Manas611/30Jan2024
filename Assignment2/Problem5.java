public class Problem5 {
    public static void main(String[] args) {
        // int[] arr = {1,2,3};

        // int l = 8;
        // int r = 9;

        // int n = arr.length;

        // l--;

        // int val = 0;

        // while(l<r)
        // {
        //     val = val + arr[l%n];
        //     l++;
        // }

        // System.out.println(val);



        int[] arr = {1,2,3};
        int l = 0;
        int r = 3;
        int n = arr.length;
        
        
        int diff;
        int s = l, e = r;
        l = l%n;
        r = r%n;

        if(l==0 && r==n-1)
        {
            diff = e-s+1;
        }
        else
        {
            diff = e-s;
        }
        diff = diff/n;
        System.out.println(diff);

        System.out.println(l+" "+r);
        int sum = 0;

        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }

        sum = sum*diff;
        System.out.println(sum);

        if(l!=0)
        {
            for(int i=l;i<n;i++)
            {
                sum+=arr[i];
            }
        }
        
        System.out.println(sum);

        if(r!=n-1)
        {
            for(int i=0;i<=r;i++)
            {
                sum+=arr[i];
            }
        }

        

        System.out.println(sum);

    }
}
