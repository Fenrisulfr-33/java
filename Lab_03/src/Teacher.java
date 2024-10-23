package Lab_03.src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// ArrayLists computer users memory placement
// Arrays are a block of memory and u have to declare size can;t change it

public class Teacher {
    Student[] remembered = new Student[100];
    ArrayList<Student> students = new ArrayList<>();
    int curr = 0;

    public Teacher(String studentFile, String knownFile) {
        try {
            // This is some file reading. You will learn how to do this yourself later,
            // But for now, just know that this code is reading from a file with all
            // students and
            // with known students to fill its Array and ArrayList
            Scanner stu = new Scanner(new File(studentFile));
            Scanner know = new Scanner(new File(knownFile));
            while (stu.hasNext()) {
                String name = stu.next();
                int ID = Integer.parseInt(stu.next());
                students.add(new Student(name, ID));
            }
            while (know.hasNext()) {
                if (curr == remembered.length) {
                    break;
                }
                String name = know.next();
                int ID = Integer.parseInt(know.next());
                remembered[curr] = new Student(name, ID);
                curr++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }

    // This code adds new students to the Array of students with their names
    // remembered. If the Array is full, it returns false, else it returns true
    public boolean remember(Student s) {
        if (remembered.length != curr) {
            remembered[curr] = s;
            curr++;
            return true;
        }
        return false;
    }

    // Refer to the directions for how to code this
    // If the Student's name and ID match the name and ID of one of the students in
    // the remembered Array, return the Student's name.
    // If it isn't in the array or if you have reached a null entry, return
    // "Er...You"
    public String recallName(Student s) {
        String studentName = s.getName();
        int studentId = s.getID();
        for (int i = 0; i < remembered.length; i++){
            // System.out.println(remembered[i]);
            if (remembered[i] != null){
                //  String name = students.get(i).getName();
                //  int compareId = students.get(i).getID();
                String name = remembered[i].name;
                int compareId = remembered[i].ID;
                // System.out.println("Student Name: " + name);
                if ((studentName.compareTo(name) == 0) && (studentId == compareId)){
                        // System.out.println("Student Name: " + name);
                        return name;
                }
            }
        }
        return "Er...You";
    }

    public static void main(String[] args) {
        Teacher Steven = new Teacher("Lab_03\\src\\Students.txt", "Lab_03\\src\\Memorable.txt");
        Student Jacob = new Student("Jacob", 679);
        Student Adeline = new Student("Adeline", 276); 
        System.out.println("TESTING " + Steven.recallName(Jacob)); // Would return "Er...You"
        System.out.println("TESTING " + Steven.recallName(Adeline)); // Would return "Adeline"
    }
}
