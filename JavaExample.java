import java.util.ArrayList;

public class JavaExample {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Naveen");
		list.add("Rajesh");
		list.add("Rajan");
		list.add("Mahesh");
		list.add("Ramesh");
		
		list.add(1, "Matheen");
		
		for(String str : list){
			System.out.println(str);
		}
	}
}
