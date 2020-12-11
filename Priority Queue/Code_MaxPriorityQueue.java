import java.util.ArrayList;
public class PQ {
    
    private ArrayList<Integer> heap ;
    public PQ() {
       heap = new ArrayList<Integer>();

    }
    // Complete this class
    boolean isEmpty() {
        return heap.size()==0;
        // Implement the isEmpty() function here
    }

    int getSize() {
        return heap.size();
        // Implement the getSize() function here
    }

    int getMax() {
        if (isEmpty()){
            return Integer.MIN_VALUE;
        }
        return heap.get(0);
        // Implement the getMax() function here
    }

    void insert(int element) {
        heap.add(element);
        int childindex = heap.size()-1;
        int parent = (childindex-1)/2;

        while(childindex > 0){
            if(heap.get(childindex) > heap.get(parent)){
                int temp = heap.get(childindex);
                heap.set(childindex,heap.get(parent));
                heap.set(parent,temp );

                childindex = parent;
                parent = (childindex-1)/2;

            }
            else{
                return ;
            }
        }
        // Implement the insert() function here
    }

    int removeMax() {
        if (isEmpty()){
            return Integer.MIN_VALUE;
        }
        
        int ans = heap.get(0);
        heap.set(0,heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        
        int p = 0;
        int l = p*2+1;
        int r = p*2+2;
        
        while(l<heap.size()){
            int max = p;
            if (heap.get(l) > heap.get(max)){
                max=l;
                
            }
            if(r<heap.size() && heap.get(r) > heap.get(max)){
                max=r;
            }
            
            if (max==p){
                break ;
            }
            int temp = heap.get(max);
            heap.set(max,heap.get(p));
            heap.set(p,temp);
            
            
            p = max;
            l = p*2+1;
            r = 2*p+2;
        }
        
        return ans;

    }
}
