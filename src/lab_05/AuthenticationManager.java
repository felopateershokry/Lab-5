/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_05;

/**
 *
 * @author Enter Computer
 */
import java.io.*;
import java.util.*;
public class AuthenticationManager {
    
private ArrayList<Authentication> data=new ArrayList<>();
public void loadFromFile(String filename){
    try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
        String line;
        while((line=reader.readLine())!= null){
        String parts[]=line.split(":");
        if(parts.length==2)
            data.add(new Authentication(parts[0].trim(),parts[1].trim()));      
        }
    }
        catch (IOException e) {
            System.out.println("️Error loading users data");
        }
}

public boolean verify(String username,String password){
    for (Authentication c : data) {
            if (c.getUsername().equals(username) && c.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

}

