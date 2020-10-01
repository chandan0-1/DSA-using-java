package ClassesAndObjects;

public class DynamicArray {

	private int[] data;
	private int nextindex;
	
	public DynamicArray(){
		data = new int[5];
		nextindex=0;
	}
	
	public int size() {
		return nextindex;	
	}
	
	public boolean isEmpty() {
		return nextindex==0;
	}
	public int get(int i) {
		if (i>=nextindex) {
			return -1;
		}
		return data[i];
	}
	
	public void add(int ele) {
		if (nextindex==data.length) {
			doublesize();
		}
		data[nextindex]=ele;
		nextindex++;
		
	}
	
	private void doublesize() {
		int[] tmp=data;
		data =new int[2*tmp.length];
		for(int i=0;i<tmp.length;i++) {
			data[i]=tmp[i];
		}

	}
	public void replace(int i,int el) {
		if (i>=data.length) {
			return;
		}
		data[i]=el;
	}

}
