package netaji.it.com;
public class OwnCollection {
	private Object[] objArry=new Object[5];
	private int elementCount=0;
	
	public void add(Object obj) {
		if(elementCount==objArry.length) {
			incrementCapacity();
		}
		objArry[elementCount]=obj;
		elementCount++;
	}
	public void incrementCapacity() {
		Object[] nextArry=new Object[capacity()*2];
		for(int i=0;i<objArry.length;i++) {
			nextArry[i]=objArry[i];
		}
		objArry=nextArry;
	}
	public int capacity() {
		return objArry.length;
	}
	public int size() {
		return elementCount;
	}
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for(int i=0;i<size();i++) {
			sb.append(objArry[i]);
		}
		int start=sb.lastIndexOf(",");
		if(start!=-1) {
			sb.delete(start, start+2);
		}
		sb.append("]");
		return sb.toString();
	}
}
class Student{}
class Employee{}
	class Test{
		public static void main(String[] args) {
			OwnCollection oc=new OwnCollection();
			System.out.println(oc.size());
			System.out.println(oc.capacity());
			System.out.println(oc);
			oc.add(new Student());
			oc.add(new Student());
			oc.add(new Student());
			//oc.add(new Student());
			oc.add(new Employee());
			oc.add(new Employee());
			//oc.add(new Employee());
			System.out.println();
			System.out.println(oc.size());
			System.out.println(oc.capacity());
			System.out.println(oc);
			System.out.print(oc);
			System.out.println();
			oc.add(new  Employee());
			oc.add(new Student());
			System.out.println();
			System.out.println(oc.size());
			System.out.println(oc.capacity());
			System.out.println(oc);
		}
	}
	