package com.oops.encapsulation;
/* 
 * Save this in a file called Main.java and compile it. To test it 
 * create the file `input.txt` in the workspace / Working Directory
 * (For Eclipse/VisualStudio, by default this is the top level project folder)
 */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */
public class Main {
    public static Map<String,Integer> processData(ArrayList<String> array) {
        Map<String,Integer> retVal = new HashMap<String,Integer>();
        
       Collection<Integer> keys = retVal.values();      
        System.out.println(keys);
        
       return retVal;
    }

    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        String line;
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
            while(in.hasNextLine())
                inputData.add(in.nextLine());
            Map<String,Integer> retVal = processData(inputData);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            for(Map.Entry<String,Integer> e: retVal.entrySet())
                output.println(e.getKey() + ": " + e.getValue());
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}
