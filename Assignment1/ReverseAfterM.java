import java.util.*;

public class ReverseAfterM {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5,6};
        List<Integer> vector = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
       
        // vector.add(1);
        // vector.add(2);
        // vector.add(3);
        // vector.add(4);
        // vector.add(5);
        // vector.add(6);
        // vector.add(7);
        // vector.add(8);
        // vector.add(9);
        // vector.add(111);


        int M = 3;

        int i = M+1;
        int j = vector.size()-1;

        while (i<j) {
            Collections.swap(vector, i++, j--);
        }

        System.out.println(vector);





    }
}
