
package java_and_lab;


public class Encapsulation {
    private String name  ;
    
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public static void main (String[] args){
        Encapsulation newName =  new Encapsulation();
        newName.setName("Aldo Wiranata");
        System.out.println("nama = " + newName.getName());
    }
}
