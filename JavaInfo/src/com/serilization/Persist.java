package com.serilization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Persist{    
	 public static void main(String args[]){    
	  try{    
	  //Creating the object    
	  Student s1 =new Student(211,"ravi");    
	  //Creating stream and writing the object    
	  FileOutputStream fout=new FileOutputStream("C:\\Users\\dmk61\\OneDrive\\Desktop\\serilize\\f.txt");    
	  ObjectOutputStream out=new ObjectOutputStream(fout);    
	  out.writeObject(s1);    
	  out.flush();    
	  //closing the stream    
	  out.close();    
	  System.out.println("success");    
	  }catch(Exception e){System.out.println(e);}    
	 }    
	}    