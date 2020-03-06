package com;


	
	import java.io.FileInputStream;

	import java.io.IOException;

	//How to read Any File in Java
	public class jsonread {
		public static void main(String[] args) throws IOException {
			FileInputStream fis= new FileInputStream("abc.txt");
			fis.read();
			
			int a=0;
			
			while((a=fis.read())!=-1) {
				char c=(char)a;
				System.out.println(c);
			}
	

		}
	}

	


