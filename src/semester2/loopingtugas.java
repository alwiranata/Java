
package semester2;

public class loopingtugas {
    public static void main(String[]args){
        for ( var i = 1; i <= 10 ; i++){
            for( var j = 1 ; j <= 10; j ++){
                System.out.print((i * j) + "\t");
                       
            }
            System.out.println();
        }
        
        var tinggi = 5;
        
        for(var i = 1 ; i <= tinggi ; i ++){
            
            for (var spasi = 1 ; spasi <= tinggi- i ; spasi++){
                System.out.print(" ");
            }
            
            for(var bintang = 1 ; bintang <=(2 * i -1) ; bintang++){
                System.out.print("*");
            }
            
            System.out.println();
        }
       
    }
}
