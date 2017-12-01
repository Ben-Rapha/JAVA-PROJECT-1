
package project1;
import java.awt.Color;
import java.awt.GridLayout;
import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JFrame;
/**
 *
 * @author KINGSLEY OTTO
 */
public class Project1 {
    static String inFileName = "Date.txt";
    static DateGUI myDateGUI;
    static String temp;

    public static void main(String[] args) {
       
       DateGUI myDateGUI = new DateGUI(); //call the dategui class
       myDateGUI.setTitle("My Date Display");
       myDateGUI.setSize(800,600);
       myDateGUI.setLocation(400,200);
       String[] unsorted = {"", "", "", "", "", "", "", "", "" };
       String[] sorted = {"", "", "", "", "", "", "", "", ""};
       readFromFile(inFileName,unsorted, sorted); // access date file, check if valid,
       //if not , print to the console.
       selectionSort(sorted, sorted.length);// sort the dates out
       myDateGUI.setLeftSide(unsorted);//place unsorted date on the left
       myDateGUI.setRightSide(sorted); //place the sorted date on the right
       myDateGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       myDateGUI.DateGUI(); //power the date GUI
    
        
    }
    private static boolean isValidDate(String date) {    //check if dates in txt is valid 
        if (date == null || date.isEmpty() || date.length() != 8)
            return false; //return false if date is null, empty,or length is not equal to 8
      
        for (int i = 0; i < date.length(); i++)
            if(!Character.isDigit(date.charAt(i)))
                return false; //return false if date list contains non digit.
      
        return true; //return true if no test fails.
    }
    
    public static void readFromFile (String fileName, String[] unsorted, String[] sorted) { 
        // method to help read file and check if the list is valid , if not print to console
        File file;
        Scanner filereader;
        try{
            
            file = new File(fileName);
            filereader = new Scanner(file);
            int trackeR = 0;
            while(filereader.hasNextLine()){
                String line = filereader.nextLine();
             //this tokenizer helps split current read line into substrings,
                StringTokenizer token = new StringTokenizer(line,",");
                while(token.hasMoreTokens()){
                    String date = token.nextToken();
                    if(isValidDate(date)){
                    unsorted[trackeR] = date;
                    sorted[trackeR] = date;
                    trackeR++;
                    }else{
                        System.out.println(date + " is not a date");
                    }
                }  
            }
            filereader.close(); // close file after readering the file
        } catch(Exception e){
            System.out.println("Error:" + e.getLocalizedMessage());
            
        
        }
        
    }
    //election sort to help sort the date list in ascending order
     private static void selectionSort (String[] array, int length) { 
      for ( int i = 0; i < length - 1; i++ ) { 
         int indexLowest = i; 
         for ( int j = i + 1; j < length; j++ ){ 
            if (array[j].compareTo(array[indexLowest]) < 0) {
               indexLowest = j;
               if ( array[indexLowest].compareTo(array[i]) < 0) 
               temp = array[indexLowest];
               array[indexLowest] = array[i]; 
               array[i] = temp; 
            }
         }  
      } 
   } // method selectionSort 
    
}
