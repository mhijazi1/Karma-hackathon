package gsu.ugahacksproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sleepynhi
 */
public class tagg {

    public tagg() throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);

        File inFile = new File("./test.txt");
        String fileContent = "";

        try {

            Scanner fileInput = new Scanner(inFile);
            while (fileInput.hasNext()) {
                fileContent += fileInput.nextLine() + '\n';
            } 
        }catch (Exception e){
                    System.out.println("Error");
                    }
        
        
        try {
            System.out.println(fileContent);
            Runtime rt = Runtime.getRuntime();
            Process p = rt.exec("python predict.py" + fileContent);
            p.waitFor();
            InputStream stderr = p.getInputStream();
            InputStreamReader in = new InputStreamReader(stderr);
            BufferedReader reader = new BufferedReader(in);
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println("Python says: " + line);
            }
            int exitVal = p.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
