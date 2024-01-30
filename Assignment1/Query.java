public class Query {
    public static void main(String[] args) {
        int n = 4;
        int q = 2;

        int ans1 = 0;
        int ans2 = 1;
        for(int i=1;i<=n;i++)
        {
            if(q==1)
            {
                ans1 = ans1 + i;
            }
            else
            {
                ans2 = ans2 * i;
            }
        }

        if(q==1)
            System.out.println(ans1);
        else
            System.out.println(ans2);
    }
}
