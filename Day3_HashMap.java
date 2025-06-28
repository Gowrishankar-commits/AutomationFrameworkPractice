import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.google.common.collect.Multiset.Entry;

public class Day3_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		HashMap <Character, Integer> map = new HashMap<>();
		for(char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		
		for (Map.Entry <Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+ " " + entry.getValue());
		}
			

	}
	
}	
