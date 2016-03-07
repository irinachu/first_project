
//		package com.tutorialspoint;

		import java.io.FileInputStream;
		import java.io.IOException;
		import java.io.InputStreamReader;

		public class InputStream {
		   public static void main(String[] args) throws IOException {
		      FileInputStream fis = null;
		      InputStreamReader isr =null;
		      char c;
		      int i;
		      
		      try {
		         // new input stream reader is created 
		         fis = new FileInputStream("C:/test.txt");
		         isr = new InputStreamReader(fis);
		         
		         // read till the end of the file
		         while((i=isr.read())!=-1)
		         {
		            // int to character
		            c=(char)i;
		            
		            // print char
		            System.out.println("Character Read: "+c);
		         }
		      } catch (Exception e) {
		      
		         // print error
		         e.printStackTrace();
		      } finally {
		         
		         // closes the stream and releases resources associated
		         if(fis!=null)
		            fis.close();
		         if(isr!=null)
		            isr.close();
		      }   
		   }
		}

