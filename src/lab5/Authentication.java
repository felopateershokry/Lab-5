/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author Enter Computer
 */
public class Authentication {
     private String username;
     private String password;
     
     public Authentication(String username,String password){
     this.username=username;
     this.password=password;
     }
     
     public String getUsername(){return username;}
     public String getPassword(){return password;}
    
}
