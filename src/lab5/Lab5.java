/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Enter Computer
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        StudentDatabase sdb = new StudentDatabase("students.txt");
        AuthenticationManager auth = new AuthenticationManager();

        AdminRole admin = new AdminRole(auth, sdb);

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        boolean loggedIn = admin.login(username, password, "users.txt");

        if (loggedIn) {
            System.out.println("Admin access granted!");
            
             admin.addStudent(1, "Mariam Ali", 20, "F", "CS", (float) 3.8);
            admin.addStudent(2, "Omar Hassan", 21, "M", "IT", (float) 3.4);

            ArrayList<Student> all = admin.viewStudents();
            for (Student s : all) {
                System.out.println(s.lineRepresentation());
            }

            admin.updateStudent(1, 21,"cce", (float) 3.9);
            admin.deleteStudent(2);
            
        } else {
            System.out.println("Access denied.");
        }

        input.close();
    }
}
