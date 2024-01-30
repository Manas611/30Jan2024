import java.util.*;

public class Problem7 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 1};
        int k = 1;

        Arrays.sort(arr);

        ArrayList<Integer> ans = new ArrayList<Integer>();

        int n = arr.length;
        int i = n-1;

        while (k!=0) {
            ans.add(arr[i]);
            i--;
            k--;
        }

        Collections.reverse(ans);

        System.out.println(ans);
    }
}
