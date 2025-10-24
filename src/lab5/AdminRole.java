/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author Enter Computer
 */
public class AdminRole {
    private String username;
    private AuthenticationManager authManager;
    private StudentDatabase studentDB;
    
    public AdminRole(AuthenticationManager auth, StudentDatabase db){
        authManager=auth;
        studentDB=db;
    }
    
    public boolean login(String username,String password,String fileName){
        authManager.loadFromFile(fileName);
        if(authManager.verify(username, password)){
            this.username=username;
            System.out.println("login successful");
            System.out.println("Welcome "+username);
            return true;
        }
        System.out.println("invalid username or password");
        return false;
    }
    
    
    
    
}
