import java.util.*;
import java.lang.*;
import java.io.*;
class Student 
{
int regno;
String name,dpmt;
double cg;
public Student(int regno, String name,String dpmt,double cg){
this.regno=regno;
this.name=name;
this.dpmt=dpmt;
this.cg=cg;
}
public String toString() 
{ 
return this.regno + " " + this.name +  " " + this.dpmt + " "+this.cg; 
} 
}
class Sortbyroll implements Comparator<Student> 
{ 
public int compare(Student a, Student b) 
{ 
return a.regno - b.regno; 
} 
} 
  
class Sortbyname implements Comparator<Student> 
{ 
public int compare(Student a, Student b) 
{ 
return a.name.compareTo(b.name); 
} 
} 
  
class Sortbydpmt implements Comparator<Student> 
{ 
public int compare(Student a, Student b) 
{ 
return a.dpmt.compareTo(b.dpmt); 
} 
} 

public class HashSetExample
{
public static void main(String args[]){
HashSet<Student> set=new HashSet<Student>();
HashSet<Student> cloneset=new HashSet<Student>();

Student s1=new Student(67,"MEENAKSHI","CSE",8.2);
Student s2=new Student(42,"TITIKSHA","CSE",9.2);
Student s3=new Student(77,"BHITTU","BIO",8.3);

set.add(s1);
set.add(s2);
set.add(s3);

for(Student s:set)
{
System.out.println(s.regno +" "+ s.name +" "+ s.dpmt +" "+s.cg);
}

cloneset = (HashSet) set.clone();
System.out.println("\n\nCLONE OF STUDENT HASHSET AS FOLLOWS:");
for(Student s:set)
{
System.out.println(s.regno +" "+ s.name +" "+ s.dpmt +" "+s.cg);
}
System.out.println("BEFORE CLEARING....");
System.out.println("Is the set empty? "+set.isEmpty());  
System.out.println("\n\nWE HAVE " + set.size() +" STUDENTS IN LIST....!");
System.out.println("\n\n IS THE NAME MEENAKSHI PRESENT IN THIS LIST " + set.contains(s1));

List<Student> list=new ArrayList<Student>(set);
for(Student s:set)
{
System.out.println(s.regno +" "+ s.name +" "+ s.dpmt +" "+s.cg);
}
set.clear();  
System.out.println("AFTER CLEARING....");
System.out.println("Is the set empty? "+set.isEmpty());

Collections.sort(list, new Sortbyroll()); 
  
System.out.println("\nSORTED BY REGNO"); 
for (int i=0; i<list.size(); i++) 
System.out.println(list.get(i)); 
  
Collections.sort(list, new Sortbyname()); 
System.out.println("\nSORTED BY NAME"); 
for (int i=0; i<list.size(); i++) 
System.out.println(list.get(i)); 

Collections.sort(list, new Sortbydpmt()); 
System.out.println("\nSORTED BY DEPARTMENT"); 
for (int i=0; i<list.size(); i++) 
System.out.println(list.get(i)); 


}
}
