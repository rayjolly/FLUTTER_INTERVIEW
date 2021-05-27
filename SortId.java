import java.util.*;
import java.lang.*;
import java.io.*;
  

class Student
{
    int id;
    String name;
  

    public Student(int id, String name)
                               
    {
        this.id = id;
        this.name = name;
        
    }
  
    
    public String toString()
    {
        return this.id + " " + this.name;
                          
    }
}
  
class Sortbyid implements Comparator<Student>
{
  
    public int compare(Student a, Student b)
    {
        return a.id - b.id;
    }
}
  
class SortId
{
    public static void main (String[] args)
    {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(4, "abc"));
        ar.add(new Student(10, "ab2"));
        ar.add(new Student(5, "abc3"));
        ar.add(new Student(6, "abc5"));
  
        System.out.println("Unsorted");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
  
        Collections.sort(ar, new Sortbyid());
  
        System.out.println("\nSorted by id");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
    }
}
