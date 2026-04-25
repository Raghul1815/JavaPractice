import java.util.*;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        int i=n-2;

        while(i>=0 && a[i]>=a[i+1])
            i--;

        if(i>=0){
            int j=n-1;
            while(a[j]<=a[i])
                j--;

            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }

        int l=i+1, r=n-1;
        while(l<r){
            int temp=a[l];
            a[l]=a[r];
            a[r]=temp;
            l++;
            r--;
        }

        for(int k=0;k<n;k++)
            System.out.print(a[k]+" ");
    }
}
