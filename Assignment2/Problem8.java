import java.util.ArrayList;

public class Problem8 {

    static ArrayList<Integer> mergeArray(int[] arr1,ArrayList<Integer> arr2)
    {
        ArrayList<Integer> ans1 = new ArrayList<>();

        int i = 0 , j = 0;
        int n = arr1.length, m = arr2.size();

        while(i<n && j<m)
        {
            if(arr1[i] < arr2.get(j))
            {
                ans1.add(arr1[i]);
                i++;
            }
            else if(arr1[i] >= arr2.get(j))
            {
                ans1.add(arr2.get(j));
                j++;
            }
        }

        while(i<n)
        {
            ans1.add(arr1[i]);
            i++;
        }

        while (j<m) {
            ans1.add(arr2.get(j));
            j++;
        }

        return ans1;
    }
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3},{10,20,30},{11,12,15},{5,8,9}};
        int k = 4;
        ArrayList<Integer> out = new ArrayList<>();

        
        for(int i=0;i<k;i++)
        {
            ArrayList<Integer> ans = new ArrayList<>();
            // System.out.println(arr1[i][0]);
            ans = mergeArray(arr1[i],out);
            // System.out.println(ans + " ANS "  );
            int len = ans.size();
            out.clear();
            for(int j=0;j<len;j++)
            {
                out.add(ans.get(j));
            }
            // System.out.println(out);
        }

        System.out.println(out);
    }
}
