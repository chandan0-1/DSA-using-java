import java.util.ArrayList;

public class PQ {

	private ArrayList<Integer> heap;

	public PQ() {
		heap = new ArrayList<Integer>();
	}

	boolean isEmpty() {
		return heap.size() == 0;
	}

	int size() {
		return heap.size();
	}

	int getMin() throws PriorityQueueException {
		if (isEmpty()) {
			// Throw an exception
			throw new PriorityQueueException();
		}
		return heap.get(0);
	}

	void insert(int element) {
		heap.add(element);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;

		while (childIndex > 0) {
			if (heap.get(childIndex) < heap.get(parentIndex)) {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			} else {
				return;
			}
		}
	}

	    int removeMin() throws PriorityQueueException {
        if (isEmpty()){
            throw new PriorityQueueException();
        }
        int ele = heap.get(0);
        heap.set(0,heap.get(heap.size()-1));
        heap.remove(heap.size()-1);

        int parent = 0;
        int left = (2*parent)+1;
        int right = (2*parent) + 2;
        
        while(left<heap.size()){
            int min = parent;
            if(heap.get(min) > heap.get(left)){
                min = left;
            }

            if (right < heap.size() && heap.get(min) > heap.get(right)){
                min = right;
            }
            if (min==parent){
                break;
            }

            int temp = heap.get(min);
            heap.set(min,heap.get(parent));
            heap.set(parent,temp);

            parent = min;
            left = 2 * parent+1;
            right = 2 * parent + 2;

        }
        return ele;

        }
}
class PriorityQueueException extends Exception {

}
