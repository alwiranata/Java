

package java_and_lab;



public class Classes {
    String Name;
    int Age;
    
    public Classes(String firstName ,String lastName ,int age){
       Name = firstName + lastName ;
       Age = age;
    }
    
    public static void main(String[] args) {
      Classes myObj = new Classes("Aldo" ," Wiranata" ,20);
      System.out.println("Name : " + myObj.Name  );
      System.out.println("Age  : " + myObj.Age   );
    }
    
}
