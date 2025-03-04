
package semester2;


public class MengingatSemester1 {
   public static void main (String[] args){
       System.out.println("Hello World");
      byte getByte = 100;
      short getShort =1000;
      int getInt  = 10000;
      long getLong = 100000L;
      
      float getFloat = 10.100F;
      double getDouble  = 10.111;
      
      int account = 100_000;
      
      int iniInt = 1000;
      long iniLong = iniInt;
      
      char value = 'A';
      
      var firstName = "aldo";
      var lastName = "wiranata";
      var age = 18;
      var fullName = firstName + " " + lastName ;
      
      
         
      System.out.printf("%d %d %d %d%n", getByte, getShort, getInt, getLong);
      System.out.printf("Float dan Double  bernilai : %.2f %.1f%n", getFloat  ,getDouble);
      System.out.printf("Nilai :%d%n",account);
      System.out.printf("Nilai :%d%n",iniLong);
      System.out.printf("Value :%c%n", value);
      System.out.printf("FullName :%s%nAge :%d%n", fullName , age);
   }
   
}
