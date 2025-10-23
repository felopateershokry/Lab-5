/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;

import javax.swing.JFrame;

/**
 *
 * @author GAMING
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        

    // نبدأ نعمل object من StudentDatabase و نحدد اسم الملف
    
        StudentDatabase db = new StudentDatabase("students.txt");
                // نضيف شوية طلاب
 
        // نحاول نقرأ أي بيانات سابقة من الملف
     db.readFromFile();
        
        System.out.println("📘 Current Records:");
        for (Student s : db.returnAllRecords()) {
            s.display();
        }

       System.out.println("\n➕ Adding new students...");
        

       db.addRecord(new Student(4, "Ahmed Khaled", 20, "Male", "CCE",3.7f ));
       db.addRecord(new Student(5, "Mamdouh Yasser", 21, "Male",  "CS" , 3.4f));
       db.addRecord(new Student(6, "Ehab Mohamed", 19, "Male",  "IS" ,3.9f));


      db.saveToFile();
        
       System.out.println("\n✅ Data saved successfully!");
       
      // نعمل قراءة تاني عشان نتأكد إن كل حاجة اتسجلت صح
       db.readFromFile();
       
       System.out.println("\n📗 Records after reloading from file:");
        for (Student s : db.returnAllRecords()) {
           s.display();
            }

       // نجرب البحث
       System.out.println("\n🔍 Searching for student with ID 2...");
        Student found = db.getRecord(2);
       if (found != null)
            found.display();
        else
           System.out.println("❌ Student not found!");
//        
       // نجرب الحذف
        System.out.println("\n🗑️ Deleting student with ID 1...");
       db.deleteRecord(1);
        db.saveToFile();
//
      System.out.println("\n📕 Records after deletion:");
        for (Student s : db.returnAllRecords()) {
            s.display();
      }
    }

    
    }
    
    

