/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_05;

/**
 *
 * @author Enter Computer
 */
public class Student implements NewInterface{
    private int Id ; 
    private String Fullname ; 
    private int Age ; 
    private String Gender , Department ; 
    private float Gpa ;
    
   public Student() {
       this.Id = 0 ; 
       this.Fullname = "unknown" ;
       this.Age = 0 ; 
       this.Gender = "unknown"; 
       this.Gpa = 0 ;
       this.Department = "unknown" ; 
   }

    
   public Student(int Id ,String Fullname ,int Age ,String Gender ,String Department , float Gpa  ){
       this.Id = Id ; 
       this.Fullname = Fullname ;
       this.Age = Age ; 
       this.Gender = Gender ; 
       this.Gpa = Gpa ;
       this.Department = Department ; 
   }
  

    public int getId() {
        return Id;
    }

    public String getFullname() {
        return Fullname;
    }

    public int getAge() {
        return Age;
    }

    public String getGender() {
        return Gender;
    }

    public float getGpa() {
        return Gpa;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setGpa(float Gpa) {
        this.Gpa = Gpa;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }
   
    @Override
    public int getsearchId (){
        return this.Id ; 
    }
    
    @Override
    public String lineRepresentation (){
        String s ;
        s = this.Id + "," + this.Fullname + "," + this.Age + "," + this.Gender +"," + this.Department + "," + this.Gpa  ;
        return s ; 
    }
   
    public void display (){
        System.out.println(this.lineRepresentation());
    }
   
    
}

