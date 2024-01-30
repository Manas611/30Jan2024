import java.util.ArrayList;
import java.util.List;

public class TaregetSum {

    static int findTotalWays(List<Integer>arr , int i,int s, int target)
    {
        if(i == arr.size() && s == target)
        {
            return 1;
        }
        if(s!=target && i>=arr.size())
        {
            return 0;
        }

        return findTotalWays(arr, i+1, s+arr.get(i), target) + findTotalWays(arr, i+1, s-arr.get(i), target);

    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
 
        int target = 3;

        System.out.println(findTotalWays(arr, 0, 0, target));
    }
}
