
package java_and_lab;


class utama {
    protected String brand = "LG";
    public void barang(){
        System.out.println("Ini barang merek " + brand);
    }
}
class TV extends utama{
    private String modelName = "Samsung"; // Private attribute
    
    public void tampilkanInfo(){
        System.out.println("Brand1 " +  brand);
        barang();
        System.out.println("Brand2 " + modelName);
    }
    

    
}

public class inheritance {
    
   
    public static void main(String[] args) {
        TV newBrand = new TV(); 
        newBrand.tampilkanInfo();
    }
    
}
