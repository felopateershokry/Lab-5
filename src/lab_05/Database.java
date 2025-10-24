/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_05;

/**
 *
 * @author Enter Computer
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


abstract class Database <T extends NewInterface>  {
//    
  protected String Filename ; 
  protected ArrayList<T> records ;
  
   abstract T createRecordFrom(String line) ;
  
  public Database(String Filename){
      this.Filename = Filename ; 
      this.records = new ArrayList<T>() ;
      
  }
    
public void addRecord (T record){
    if(record!= null){
        records.add(record) ; 
    }
    
} 

    public ArrayList<T> returnAllRecords(){
        
        return this.records ; 
    }
    
 public T getRecord(int Id){
     for(T emp : records){
            if(emp.getsearchId() == Id){
                return emp;
            }
        }
        return null;
 }
 
     public void deleteRecord(int Id){
        for(int i = 0 ; i<this.records.size() ; i++){
            if(this.records.get(i).getsearchId() == Id ){
                this.records.remove(i) ; 
                break;
            }
        }
     }
 
      public void saveToFile(){
        try {
      PrintWriter w = new PrintWriter(new FileWriter(this.Filename, false));
      for(int i=0 ; i<this.records.size() ; i++){
          w.println(records.get(i).lineRepresentation());  
      } 
       System.out.println("Data saved successfully to " + this.Filename);
      w.close();
        }
        catch (IOException ex) {
        ex.printStackTrace();
    }
          
}
        
        
        
         void readFromFile() {
      

        try (BufferedReader reader = new BufferedReader(new FileReader(this.Filename))) {
            String line;

            while ((line = reader.readLine()) != null) {
                T emp = this.createRecordFrom(line);
               this.addRecord(emp);
            }
        } catch (IOException e) {
            System.out.println("️Error reading file ");
        }
    }

 
              public boolean contains(int Id ){
            for(T emp : records){
           if(emp.getsearchId() == Id){
                return true;
            }  
         }
          return false ; 
    }
 



  
  
    
}