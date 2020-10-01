package ClassesAndObjects;

public class DynamicArrayMain {

	public static void main(String[] args) {
		DynamicArray d=new DynamicArray();
		for (int i=0;i<100;i++) {
			d.add(50+i);
		}
		System.out.println(d.isEmpty());
		System.out.println(d.size());
		System.out.println(d.get(5));
		d.replace(5, 5000);
		System.out.println(d.get(5));
		System.out.println(d.get(1000));
		
	}

}
