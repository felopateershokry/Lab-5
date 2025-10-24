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

public class StudentManager {
    // Shared table model for all students
    public static DefaultTableModel tableModel = new DefaultTableModel(
        new Object[][] {},
        new String[] { "ID", "Name", "Department", "GPA" }
    );
}
