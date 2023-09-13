package Oops;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {

		ArrayList<Integer> read = new ArrayList<>();
		ArrayList<String> scan = new ArrayList<>();
		
		read.add(3);
		read.add(3);
		read.add(5);
		 read.add(2, 9);
		 read.add(0, 7);
		 read.add(1, 8);
		System.out.println(read);
		
		
		scan.add("kabul");
		scan.add("USA");
		scan.add("india");
		System.out.println(scan);
		
		
	}
	

}
