package classes_and_objects.OOPS1;

// import classes_and_objects.Student; // we have to import while using it in different package
// students and studentUse are within the same package so we do not have to import the student class

public class StudentUse {
    
    public static void main(String[] args) {
        // Student s1 = new Student();     // new student() ---> CONSTRUCTOR ---> Creates object for us and its address is given by s1
        // s1.name = "Felix";     
        // s1.rollNumber = 27; //when we construct our own constructor the default const. does not work
        Student s1 = new Student("Felix", 27); 
        s1.setYear(2);
        s1.print();
        System.out.println(s1.getYear());
        System.out.println("Student Count = " + Student.numStudents);
        
    }
}
 