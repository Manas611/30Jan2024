import java.util.HashSet;
import java.util.Set;

public class Problem9 {
    public static void main(String[] args) {
        int[] arr = {33, 20, 34, 30, 35};

        int n = arr.length;

        Set<Integer> st = new HashSet<>();

        for(int i=0;i<n;i++)
        {
            st.add(arr[i]);
        }

        int maxi = -1;

        for(int it:st)
        {
            if(!st.contains(it-1))
            {
                int cnt = 1;
                int x = it;
                while(st.contains(x+1))
                {
                    cnt++;
                    x++;
                }
                maxi = Math.max(maxi, cnt);
            }
        }

        System.out.println(maxi);


    }
}
