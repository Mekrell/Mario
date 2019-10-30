/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Rasmus
 * @author Mia
 * @author Andreas
 * @author Emilie
 */
public class ShowMenu {
    public static void ShowTheMenu() throws FileNotFoundException {
       char Retry = 'Y';
        Scanner in = new Scanner(System.in);
         System.out.println("Show menu?: Y/N");
       while(Retry != 'N'){ 
         Retry = in.next().charAt(0);
       if (Retry == 'Y'){
          String menu = in.nextLine();
          String filename = "Data/PizzaMenukort.csv";
         ImportFromFile.importPizzaNames(filename);
         System.out.println("Show menu?: Y/N");     
     } else if (Retry == 'y'){
         assert true;
     }
    }
   }
  }
