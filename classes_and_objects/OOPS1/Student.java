package classes_and_objects.OOPS1;

public class Student {
    
    static int numStudents;

    //default access::: visible within same package
    String name;
    final int rollNumber; // final data members can be initialized as soon as they are declared ---> cannot be changed further
    //public access::: visible in other packages also
    public String branch;
    //private access::: visible within the class
    private int year;

    // Create A Constructor::: constructor has no return type as it creates objects
    public Student(String name , int rn){  // name of constructor should be same as the class
        this.name = name; // use this with data member not with the local variable
        rollNumber = rn;
        numStudents++;
    }

    public void setYear(int n){
        if(n<1 || n>4){
            return;
        }
        year = n;
    }

    public int getYear(){
        return year;
    }

    public void print(){
        System.out.println(name + " : " + rollNumber);  
    }
}


// important keywords:::
// 1) final
// 2) this ---> to access data member which has same name as a local variable 
// 3) static ---> shared by all objects and belong to class