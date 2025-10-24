/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5;

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

        // Create dependencies
        StudentDatabase sdb = new StudentDatabase("students.txt");
        AuthenticationManager auth = new AuthenticationManager();

        // Create Admin object (composition)
        AdminRole admin = new AdminRole(auth, sdb);

        // ---- LOGIN TEST ----
        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        boolean loggedIn = admin.login(username, password, "users.txt");

        // ---- Post-login test ----
        if (loggedIn) {
            System.out.println("✅ Admin access granted!");
            // You can test more features here later, like:
            // admin.addStudent();
            // admin.viewStudents();
        } else {
            System.out.println("❌ Access denied.");
        }

        input.close();
    }
}
