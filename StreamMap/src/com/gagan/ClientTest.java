package com.gagan;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ClientTest {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("C:\\MyFile1.txt");
		list.add("D:\\MyFile2.txt");
		list.add("C:\\MyFile3.txt");
		
		Stream<Path> map = list.stream().map(uri -> Paths.get(uri));
		map.forEach(System.out::println);
	}

}
