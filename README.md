# Java-Advanced

**In this series we learn more about advanced java concepts to become a better developer and  a master in java**

## Learning  Tips
* Each advanced concept is under a separate branch to make it easier for one to understand  each concept independently

## Topics under java advanced 
1. **MethodCalling and creating new objects in java**
>Method calling is found on the main branch where we learn how to create new methods and the correct way to create a new object that reuses some properties from other objects without overriding the existing objects 
[start here](https://github.com/Anericokakai/Java-Advanced "method colling")

### Example of instantiation of an object
```java
public  class Main{
    Students nerd=new Students("Nerd developer","nairobi ",20);
}
 
```
2. **Exception handling in java**
>we learn both checked and unchecked  Exception and how to handle each of them . In simple terms checked exceptions are exceptions that prevents the code from being compiled until the errors are handled while unchecked exceptions the compiler cant detect the error till the code is executed [start here](https://github.com/Anericokakai/Java-Advanced/tree/Exception_handling)

### Example of checked exception handling in java
#### 1. throws FileNotFoundException,IOException 
```java
public class CheckedExceptions {
    public static void main(String[] args)  throws FileNotFoundException,IOException {

//         CHECKED EXCEPTION
//        JAVA CAN NOT ALLOW YOU TO RUN THE PROGRAM WITH CHECKED EXCEPTION
//        UN LIKE UNCHECKED EXCEPTIONS WHERE JAVA ALLOWS YOU TO RUN THE PROGRAM
//        WE HAVE A CHECKED EXCEPTION
//        I USED THE WRONG PATH TO OUR FILE AT src
        FileReader file=new FileReader("/home/devkakai/projects/OOP/sr/shoes.json");

        BufferedReader fileData=new BufferedReader(file);
//        PRINT THE FIRST 5 LINES OF THE FILE
        for (int i=0;i<5;i++){
            System.out.println(fileData.readLine());
        }
    }
}

```
### Example of a try catch block in java
```java
import java.util.ArrayList;
import java.util.List;
public  class TryCatchException {
  public static   void WriteList(){
        try {
//            CREATE AN EMPTY LIST
            List<Integer> list=new ArrayList<>(5);
//           ADD ONE ELEMENT TO THE LIST

            list.add(20);
//                    ACCESS THE SECOND ELEMENT TO THE LIST WHICH DOES NOT EXIST
            
            Integer a=list.get(1);
            System.out.println("accessing the first element"+a);
        }catch (ArrayIndexOutOfBoundsException error){
            System.err.println("IndexOutOfBoundsException error:"+error);

    }finally {
            System.out.println("THIS BLOCK WILL ALWAYS BE EXCECUTED");

        }
        }
    public static void main(String[] args) {
        WriteList();
    }
}
```


3. ***Equals method in objects***
>In java the equals method works only on in built data types .When we want to check if objects are the same based on certain properties we have to use the ``` Comparable``` interface  in our class where we declare the variables to hold our method
> which forces as to override the equals method
[start Here](https://github.com/Anericokakai/Java-Advanced/tree/equalsAndHashCodes)

### An Example of implementing the Comparable interface to compare objects based on  RegNo
```java
public class SortStudents implements  Comparable<SortStudents> {
    private String name;
    private  String Email;
    private int RegNo;
    private int age;
 @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SortStudents)) return false;
        SortStudents that = (SortStudents) o;
        return getRegNo() == that.getRegNo();
    }}

//IMPLEMENT THE CONSTRUCTORS GETTERS AND SETTERS  HERE



```

### Main class where we instantiate the objects and compare them
```java
// THE MAIN FUNCTION CLASS TO COMPARE IF THE OBJECTS ARE EQUAL BASED ON THE REGISTRATION NUMBER 
public class EqualsAndHashCodes {
    public static void main(String[] args) {

//        INSTANTIATE THREE OBJECT USING THE STUDENTS CLASS
        SortStudents james=new SortStudents("james","james@",2,20 );
        SortStudents jane =new SortStudents("jane","jane@",2,21);
        SortStudents  janis= new SortStudents("janis","james@",3,25);

        System.out.println(jane.equals(james));
// THE RESULTS OF THE ABOVE IS TRUE SINCE WE ARE USING REG NO TO COMPARE THE OBJECTS
//        


    }
}
```

4. ***sort objects in java***
* To sort objects in java we can not use the sort method directly in java since it only compares inbuilt data types
* we have to implement  the comparable interface to our class containing the object
* the Comparable takes in the class as the  then it only has one method ```compareTo( Classname var){ //logic haandled}```
* in the example below we sort the objects based on regNo in descending order
* to code along [start here](https://github.com/Anericokakai/Java-Advanced/tree/Comparator_comparables)
#### class implementation
```java
public class SortStudents implements  Comparable<SortStudents> {
    private String name;
    private  String Email;
    private int RegNo;
    private int age;
    @Override
    public int compareTo(SortStudents sortStudents){
        return  this.RegNo-sortStudents.RegNo;

    }

}

```
### main function instantiation  of the objects and sorting them in a list
```java
public class ComparableSort {
    public static void main(String[] args) {

        ArrayList<SortStudents> myList=new ArrayList<SortStudents>();

        SortStudents jhon= new SortStudents("jhon","jhon@",5, 15);
        SortStudents jhon2= new SortStudents("jhon2","jhon2@",1, 8);
        SortStudents jhon3=new SortStudents("jhon3","jhon3@",8, 4);

        myList.add(jhon);
        myList.add(jhon2);
        myList.add(jhon3);
//##################################################################
// SORT USING THE COLLECTION METHOD THAT WE HAVE OVERRIDE

        Collections .sort(myList);

//        LOOP THROUGH EACH ELEMENT USING THE FOR EACH METHOD

        myList.forEach(sortStudents -> {
            System.out.println(sortStudents.getName());
        });}}
```

5.***sort Objects Based on different properties***
>sometimes we want to sort objects based on different criteria example we can choose to sort students based on registration number and also based on exam performance . In this scenario we have to create custom different methods to sort our objects
* the comparator interface is used to sort different objects based on different criteria 
* we only need to create a class that implements the Comparator interface

### example of a Comparator interface which sorts students based on age
```java
import java.util.Comparator;

public class AgeComparator implements Comparator<SortStudents> {

//    !forces us to implement the method compare
//    we sort the student in descending order

    @Override
    public  int compare(SortStudents student1,SortStudents student2){
        if(student1.getAge()<student2.getAge()) return -1;
        if (student1.getAge()>student2.getAge()) return 1;
        else return 0;
    }
}

```

### How to  use  our custom sort in our main class

```java
import java.util.ArrayList;
import java.util.Collections;
public class ComparableSort {
    public static void main(String[] args) {

        ArrayList<SortStudents> myList = new ArrayList<SortStudents>();

        SortStudents jhon = new SortStudents("jhon", "jhon@", 5, 15);
        SortStudents jhon2 = new SortStudents("jhon2", "jhon2@", 1, 8);
        SortStudents jhon3 = new SortStudents("jhon3", "jhon3@", 8, 4);

        myList.add(jhon);
        myList.add(jhon2);
        myList.add(jhon3);
    }

//    ##################################################################

//        SORT BASED ON  OUR CUSTOM COMPARATOR

        Collections.sort(myList,new AgeComparator() );


// PRINT THE DATA IN OUR LIST USING THE FOR LOOP
        System.out.println("THE NEW COMPARISON METHOD:");
        myList.forEach(sortStudents -> {
            System.out.println(sortStudents.getName());
        });
    }
```

_till next time:::_


