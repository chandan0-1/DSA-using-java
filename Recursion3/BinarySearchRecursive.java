public class solution {

    public static int helper(int[] arr,int x,int s,int e){
        if (s>e){
            return -1;
        }
        int mid = (s+e)/2;
        
        if (arr[mid]==x){
            return mid;
        }
        if (arr[mid]>x){
            return helper(arr,x,s,mid-1);
        }
        // if (arr[mid]<x){
            return helper(arr,x,mid+1,e);
        // }
        // return -1;
        
    }
	// element - number to be searched
	public static int binarySearch(int input[], int element) {
		// Write your code here
        return helper(input,element,0,input.length-1);

	}
}

