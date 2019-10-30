package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//Laver en klasse der hedder importfromfile, så den kan hentes i en anden klasse
//Med denne klasse kan jeg importerer Data som ikke er i dette projekt
/*
 * @author Rasmus
 * @author Mia
 * @author Andreas
 * @author Emilie
*/
public class ImportFromFile {
    public static boolean importPizzaNames(String filename) throws FileNotFoundException{
                boolean retVal = false;
                String line = "";
                File file = new File(filename);
                FileReader fr = null;
                try {
                fr = new FileReader(file);
                } catch (Exception e) {
                        System.out.println("Error: " + e.toString());
                        }
                try {
                BufferedReader bw = new BufferedReader (fr);
                while ((line = bw.readLine()) != null){
                    System.out.println(line);
                }
                } catch (Exception e) { 
                    System.out.println("Error: " + e.toString());
                        
                }
   
                return retVal;
    }
            
            }
