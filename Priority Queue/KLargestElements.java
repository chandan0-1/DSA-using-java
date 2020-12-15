import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution {

	public static ArrayList<Integer> kLargest(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0; i<k; i++){
            pq.add(arr[i]);
        }
        
        for (int j=k;j<arr.length;j++){
            if(pq.peek() < arr[j]){
                pq.poll();
                pq.add(arr[j]);
            }
        }
        ArrayList<Integer> a = new ArrayList<>();
        while(!pq.isEmpty()){
            a.add(pq.peek());
            pq.poll();
        }
        
        return a;
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		
	}
}
