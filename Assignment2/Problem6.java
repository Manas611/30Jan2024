public class Problem6 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {9,9};

        int n = arr1.length;
        int m = arr2.length;

        int num1 = 0, num2 = 0;
        for(int i=0;i<n;i++)
        {
            num1 = num1*10 + arr1[i];
        }

        for(int i=0;i<m;i++)
        {
            num2 = num2*10 + arr2[i];
        }

        System.out.println(num1+ num2);
    }
}
