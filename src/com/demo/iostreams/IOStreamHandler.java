package com.demo.iostreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class IOStreamHandler {

	public static void main(String[] args) throws IOException  {
		//write data into file using file output stream
		writeDataIntoFile();
		//read data from the file using input stream
		int val= readDataFromFile();
		
		//read data from file using offset and byte
		readDataFromFilebyOffset();
		//moving file from one directory to another(cut and paste)
		//copy of file from one directory to another directory(copy and paste)
		

	}

	private static int readDataFromFilebyOffset() throws IOException  {
		InputStream in = null;
		BufferedInputStream bi = null;
		try {
			in =  new FileInputStream("D:\\pavan\\bbc.txt");
			bi = new BufferedInputStream(in);
			
			 byte[] buffer = new byte[6];
	         int i = bi.read(buffer, 0, 6);
	 
	            System.out.println("Number of bytes read:- " + i);
	 
	            for (byte b: buffer) {
	                char c = (char) b;
	                if (b == 0)
	                    c = '-';
	                System.out.print(c);
	            }
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		finally {
			in.close();
		}
		
		return 0;
		
	}

	private static int readDataFromFile() throws IOException {
		InputStream in = null;
		BufferedInputStream bi = null;
		try {
			in =  new FileInputStream("D:\\pavan\\bbc.txt");
			bi = new BufferedInputStream(in);
			
			int i=0;    
            while((i=bi.read())!=-1){    
             System.out.print((char)i);    
            }    
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		finally {
			in.close();
		}
		
		return 0;
		
	}

	private static void writeDataIntoFile() throws IOException {
		FileOutputStream fout = null;
		BufferedOutputStream bout = null;
		try {
			fout =  new FileOutputStream("D:\\pavan\\bbc.txt");
			bout = new BufferedOutputStream(fout);
			String str ="Sachin Ramesh Tendulkar is an Indian former international cricketer who served as captain of the Indian national team. He is widely regarded as one of the greatest batsmen in the history of cricket. He is the highest run scorer of all time in International cricket";
		 bout.write(str.getBytes());
		 bout.flush();
		 System.out.println("success");
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		finally {
			fout.close();
			 bout.close();
		}
		
	}

}
