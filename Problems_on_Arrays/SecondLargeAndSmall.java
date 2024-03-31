package Problems_on_Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class SecondLargeAndSmall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Second Largest : "+arr[arr.length-2]);
        System.out.println("Second Smallest : "+arr[1]);
        //without defined method Sort
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        // in 0(n)
        int sec_smallest=Integer.MAX_VALUE;
        int smallest=Integer.MAX_VALUE;
        int sec_largest=Integer.MIN_VALUE;
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
               if(a[i]<smallest) sec_smallest=smallest; smallest=a[i];
               else if(smallest<a[i]<sec_smallest) sec_smallest=a[i];
               if(a[i]>largest) sec_largest=largest; largest=a[i];
                else if(largest>a[i]>sec_largest)  sec_lagest=a[i];
        }
        
        System.out.println("without defined method Sort");
        System.out.println("Second Largest : "+arr[arr.length-2]);
        System.out.println("Second Smallest : "+arr[1]);
        sc.close();
        
    }
}
