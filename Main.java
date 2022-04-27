import java.io.IOException;
import java.lang.IllegalArgumentException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class FinalProject{
 public static void main(String[] args){
     Scanner choice = new Scanner(System.in);
     
     System.out.println("1. Print all contents of database\n");
     
     System.out.println(". Print all genres of music available (no duplicates)\n");
     
     System.out.println(". Print all Podcasts\n");
     
     System.out.println(". Print TV shows by episode number\n");

     System.out.println(". Print Podcast seasons\n");
     
     System.out.println(". Print content that can be listened to\n");
     
     System.out.println(". Print songs before 2000\n");
     
     System.out.println(". Print all content that can be viewed\n");
     
     System.out.println(". Print photos oldest to youngest\n");
     
     System.out.println(". Quit the program\n");
     
     int decision = choice.nextInt();
     
     if(decision == 1){
     try {
			      BufferedReader reader= new BufferedReader(new FileReader("Final Project CSV.csv"));
			
			String line;
			while((line= reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found");
		}
		catch(IOException e) {
			System.out.println("Error while reading File");
		}
     }
     else if(decision == 2){
         
     }
     else if(decision == 3){
         
     }
     else if(decision == 4){
         
     }
     else if(decision == 5){
        
     }
     else if(decision == 6){
        
     }
     else if(decision == 7){
        
     }
     else if(decision == 8){
        
     }
     else if(decision == 9){
        
     }
     else if(decision == 10){
        
     }
     else if(decision == 11){
        
     }
     else if(decision == 12){
        
     }
     else if(decision == 13){
        
     }
     
    }
 }

