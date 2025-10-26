/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_05;

/**
 *
 * @author PC
 */
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StudentManager {
    // Shared table model for all students
    public static DefaultTableModel tableModel = new DefaultTableModel(
        new Object[][] {},
        new String[] { "ID", "Name", "Age" , "Gender" , "Department", "GPA" }
    );
    public static void loadFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 6) {
                    tableModel.addRow(data);
                } else {
                    System.err.println("Invalid line (skipped): " + line);
                }
            }
            System.out.println("Data loaded successfully from " + fileName);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
