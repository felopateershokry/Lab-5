/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author Enter Computer
 */
public class StudentDatabase extends Database<Student>{

    public StudentDatabase(String Filename) {
        super(Filename);
    }

    @Override
    public Student createRecordFrom(String line) {
       
        String [] s = line.split(",") ; 
        int Id = Integer.parseInt(s[0]) ;
        String name = s[1] ; 
        int age = Integer.parseInt(s[2]) ; 
        String Gender = s[3];
        String Dep = s[4] ;
        float gpa = Float.parseFloat(s[5]) ; 
        
        return new Student (Id , name , age , Gender , Dep , gpa) ; 
       
        
    }


    
}
