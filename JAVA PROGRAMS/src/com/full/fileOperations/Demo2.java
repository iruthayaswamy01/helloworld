package com.full.fileOperations;

import java.io.*;

public class Demo2 {

	public static void main(String[] args)throws IOException{
		
		File f= new File("C:\\Irudi" ,"abc.txt");
		FileWriter fw= new FileWriter(f, false);
		fw.write("SRM");
		fw.flush();
		
		FileReader fr= new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		String line =br.readLine();
		
			
			System.out.println(line);
			
		
		f.createNewFile();
		System.out.println(f.exists());
	}
}
