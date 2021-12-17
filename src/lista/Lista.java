package lista;

import java.util.ArrayList;   
import java.util.List;
import java.util.stream.Collectors;

import com.sun.net.httpserver.Authenticator.Result;

public class Lista {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Carlos");
		list.add("Roberto");
		list.add("Carol");
		list.add("Junior");
		list.add(0, "Maria");

		System.out.println(list.size());

		list.remove("");
		list.removeIf(x -> x.charAt(0) == 'M');

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("------------------------------");
		System.out.println(list.indexOf("Carlos"));

		
		System.out.println("-------------------------------");
		List<String>result = list.stream().filter(x->x.charAt(0) == 'C').collect(Collectors.toList());
		for (String x: result) {
			System.out.println(x);			
		}
		
		System.out.println("--------------------------------");
		String name = list.stream().filter(x->x.charAt(0) == 'C').findFirst().orElse(null);
		System.out.println(name);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}