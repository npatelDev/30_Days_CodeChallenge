import java.util.HashMap;

import java.util.Map.Entry;

public class BasicPrograme {
	public static void main(String[] args) {
		
		HashMap<Integer,String> emp=new HashMap<Integer,String>();
		emp.put(1, "Hello");
		emp.put(2, "Java");
		emp.put(3, "PHP");
		emp.put(4, "JavaScripts");
		emp.put(5, "MongoDb");
		emp.put(6, "Angular");
		
		for(Entry<Integer, String> m: emp.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
