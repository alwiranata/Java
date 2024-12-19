
package real_project;


class Person {
        String name  ;
        int age ;
        public void introduce(){
            System.out.println("Hi, I'm " + name + " and i'm " + age + "Years old");
        }
    }

class Person2 {
        String name  ;
        int age ;
        
        public Person2(String name, int age){
            this.name = name;
            this.age = age;
        }
        public void introduce(){
            System.out.println("Hi, I'm " + name + " and i'm " + age + "Years old");
        }
    }


public class ObjeckClass {

    
    public static void main(String[] args) {
      Person person  = new Person();
      person.name = "aldo Wiranata";
      person.age = 18;
      person.introduce();
      
      
      //person2
      Person2 newPerson = new Person2("Aldo Wiranata" ,17);
      newPerson.introduce();
    }
    
}
