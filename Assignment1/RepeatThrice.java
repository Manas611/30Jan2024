import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RepeatThrice {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 2, 1, 1,2,2,5,4,5,5,4,4,10));

        HashMap<Integer, Integer> m = new HashMap<>();
        
        for(int e:arr)
        {
            if(m.containsKey(e))
            {
                m.put(e, m.get(e)+1);
            }
            else
            {
                m.put(e, 1);
            }
        }

        for (int key : m.keySet()) {
            if(m.get(key)<3)
            {
                System.out.println(key);
            }
        }

    }
}
