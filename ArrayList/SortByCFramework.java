import java.util.*;

class Student
{

int RegNum;

String NameOfStud;

  String ClgName;

  int Mark;

  String Dept;


public Student(int RegNum,
  String NameOfStud,
    String ClgName,
   
   int Mark,
    String Dept)
 
  {
  
  this.RegNum=RegNum;

    this.NameOfStud=NameOfStud;

    this.ClgName=ClgName;

    this.Mark=Mark;

    this.Dept=Dept;

  }

  public String toString()
  {

  return this.RegNum+" "+this.NameOfStud
    +" "+this.ClgName+" " +this.Mark +" "+this.Dept;

  }


}
    
 class SortByRegNum implements Comparator<Student> 
{ 
    
    public int compare(Student a, Student b) 
    { 
        return a.RegNum - b.RegNum; 
    } 
} 

 class SortByRegName implements Comparator<Student> 
{ 

    public int compare(Student a, Student b) 
    { 
        return a.NameOfStud.compareTo(b.NameOfStud); 
    } 
} 

class SortByClgName implements Comparator<Student>
 
 {
 public int compare(Student a,Student b)

  {
   	
	return a.ClgName.compareTo(b.ClgName);

  }

 }

 class SortByMarks implements Comparator<Student>
 
{
 public int compare(Student a,Student b)
 {

 
 return a.Mark - b.Mark; 

 }

 }
  

 class SortByDept implements Comparator<Student>
 
 {
 public int compare(Student a,Student b)
 {

    return a.Dept.compareTo(b.Dept);

  }
 
  } 



class SortByCFramework
{ 
    public static void main (String[] args) 
    { 
        ArrayList<Student> al = new ArrayList<Student>(); 
   al.add(new Student(01, "KamalHassan","SRC,SASTRA university",99,"CSE")); 
   al.add(new Student(07, "MSDhoni","SASTRA university",98,"ECE")); 
   al.add(new Student(06, "Rajinikanth","Anna university",100,"EEE")); 
  
        System.out.println("Unsorted array list"); 
        for (int i=0; i<al.size(); i++) 
            System.out.println(al.get(i)); 
  
        Collections.sort(al, new SortByRegNum()); 
  
        System.out.println("\nSorted by registerno"); 
        for (int i=0; i<al.size(); i++) 
            System.out.println(al.get(i)); 
  
        Collections.sort(al, new SortByRegName()); 
  
        System.out.println("\nSorted by name of the students"); 
        for (int i=0; i<al.size(); i++) 
            System.out.println(al.get(i));
 
         Collections.sort(al, new SortByClgName()); 
  
      System.out.println("\nSorted by ClgName"); 
       for (int i=0; i<al.size(); i++) 
           System.out.println(al.get(i));

      
      Collections.sort(al, new SortByMarks()); 
  
        System.out.println("\nSorted by Marks"); 
       for (int i=0; i<al.size(); i++) 
           System.out.println(al.get(i));

 
    Collections.sort(al, new SortByDept());

     
     System.out.println("\nSorted by Dept"); 
        for (int i=0; i<al.size(); i++) 
            System.out.println(al.get(i)); 
      
  } 
}
