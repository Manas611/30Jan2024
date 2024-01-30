import java.util.*;

public class RemoveDupli {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 5, 5};

        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 5, 5 ));

        // int n = arr.size();
        int i = 0;
        while(i<arr.size()-1)
        {
            if(arr.get(i) == arr.get(i+1))
            {
                arr.remove(i+1);
                // System.out.println(arr);
                continue;
                // i--;
            }
            i++;
        }

        System.out.println(arr);

    }   
}
