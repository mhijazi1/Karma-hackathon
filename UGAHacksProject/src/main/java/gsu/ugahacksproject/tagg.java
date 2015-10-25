package gsu.ugahacksproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import org.json.JSONObject;

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

    String commandPath = null;
    public tagg(String pythonPath){
        commandPath = pythonPath;
    }

    public String predict(String filePath){
        String output = null;
        String state = null;
        try {
//            System.out.println(fileContent);
           // Runtime rt = Runtime.getRuntime();
            Process p = Runtime.getRuntime().exec("python " + commandPath + "/predict.py " + filePath);
            BufferedReader error = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            String line = null;
            while ((line = error.readLine()) != null) {
                System.out.println("Python says: " + line);
            }
            
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            //p.waitFor();
            //InputStream stderr = p.getInputStream();
            //InputStreamReader in = new InputStreamReader(stderr);
            //BufferedReader reader = new BufferedReader(in);
            line = null;
            while ((line = in.readLine()) != null) {
                if(output == null)
                    output = line;
                else
                    output += line;
            }
            int exitVal = p.waitFor();

            JSONObject jsonObj = new JSONObject(output);
            state = jsonObj.getString("state");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return state;
    }
    public void trainNew(String filePath, String result){
         try {
//            System.out.println(fileContent);
           // Runtime rt = Runtime.getRuntime();
            Process p = Runtime.getRuntime().exec("python " + commandPath + "/trainNew.py " + filePath + " " + result + " good");
            BufferedReader error = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            String line = null;
            while ((line = error.readLine()) != null) {
                System.out.println("Python says: " + line);
            }
            int exitVal = p.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dispute(String filePath, String actualResult, String expectedResult){
        try {
//            System.out.println(fileContent);
           // Runtime rt = Runtime.getRuntime();
            Process p = Runtime.getRuntime().exec("python " + commandPath + "/trainNew.py " + filePath + " " + actualResult + " bad " + expectedResult);
            BufferedReader error = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            String line = null;
            while ((line = error.readLine()) != null) {
                System.out.println("Python says: " + line);
            }
            int exitVal = p.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}