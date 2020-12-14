public class Solution {
    
    public static void downHeapify(int[] arr,int i,int n){
        int p=i;
        int l = 2*p+1;
        int r = 2*p +2;
        
        while (l<n){
            int min = p;
            if (arr[l] < arr[min]){
                min = l;
            }
            
            if (r<n && arr[r] < arr[min]){
                min = r;
            }
            
            if (min==p){
                return ;
            }
            
            int temp =arr[p];
            arr[p] = arr[min];
            arr[min] = temp;
            
            p = min;
            l = 2*p +1;
            r = 2*p+2;
        }
    }

	public static void inplaceHeapSort(int arr[]) {
        
        int n = arr.length;
        for (int i=(n/2)-1; i>=0; i--){
            downHeapify(arr,i,n);
        }
        
        for (int j=n-1; j>=0;j--){
            int temp = arr[0];
            arr[0] = arr[j];
            arr[j] = temp;
            downHeapify(arr,0,j);
        }
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Change in the given input itself.
		* Taking input and printing output is handled automatically.
		*/
		
	}
}
