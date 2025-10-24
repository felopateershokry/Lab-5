/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.ArrayList;

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
    
    public boolean addStudent(int id,String name,int age,String gender ,String department, float gpa ){
    if(name.isEmpty()||gender==null||gender.isEmpty()||department.isEmpty()||department==null||age<=0||gpa<0||gpa>4.0){
    return false; // invalid info
    }
    if(studentDB.contains(id)) //duplication student
        return false;
    Student s= new Student(id,name,age,gender,department,gpa);
    studentDB.addRecord(s);
    studentDB.saveToFile();
    return true; 
  }
    public ArrayList<Student> viewStudents(){
    return studentDB.returnAllRecords();
    }

    public boolean updateStudent(int id,int newAge,String newDepartment,float newGpa){
        Student found=studentDB.getRecord(id);
        if(found==null)
            return false;// no record 
        boolean updated=false;
        if(newAge>found.getAge()){
            found.setAge(newAge);
            updated=true;
        }
        else return false;//invalid age
        if(newDepartment!=null)
        {
            found.setDepartment(newDepartment);
            updated=true;
        }
        if(newGpa>=0&&newGpa<=4){
            found.setGpa(newGpa);
            updated=true;
        }
        else return false;//invalid gpa
        if(updated){
            studentDB.saveToFile();
            return true;
        }
        return false;
    }
    
    public boolean deleteStudent(int id){
        if(studentDB.contains(id)){
            studentDB.deleteRecord(id);
            return true;
        }
        return false;
        }
    
    public Student searchByID(int id){
        return studentDB.getRecord(id);
    }
    
    public ArrayList<Student> searchByName(String name){
        ArrayList<Student> results= new ArrayList<>();
        for(Student s: studentDB.returnAllRecords()){
            if(s.getFullname().toLowerCase().contains(name.toLowerCase()))
        results.add(s);
        }
        return results;  
    }
    
    }
    
    
    
    
    

