public class Problem4 {
    public static void main(String[] args) {
        int[] arr = {5,2,2};

        int totalProduct = 1;
        int n = arr.length;

        for(int i=0;i<n;i++)
        {
            totalProduct = totalProduct*arr[i];
        }

        for(int i=0;i<n;i++)
        {
            arr[i] = totalProduct/arr[i];
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
