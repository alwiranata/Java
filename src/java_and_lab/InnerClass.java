
package java_and_lab;

class outerClass{
    int x= 5;
    
    static class staticClass{
        int a = 10;
    }
    
    private class innerClass2 { 
    int z = 10;
    }
    
    class innerClass {
        //private
        innerClass2 myPrivate = new innerClass2();
        int y = 5 + myPrivate.z;
    }
    
    class addNewInnerClass {
        public int myNewInnerMethod(){
            return x + 5;
        }
    }
    
     
}
public class InnerClass {
    public static void main(String[] args){
        outerClass myOuter = new outerClass();
        //inner
        outerClass.innerClass myInner = myOuter.new innerClass();
        //static
        outerClass.staticClass myStatic = new outerClass.staticClass();
        //access
        outerClass.addNewInnerClass myNewInner = myOuter.new addNewInnerClass();
        
        System.out.println(myOuter.x + myInner.y + myStatic.a  + myNewInner.myNewInnerMethod() );
    }
}
