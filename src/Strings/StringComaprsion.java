package Strings;

public class StringComaprsion {
  public static void main(String[] args)
  {
      String s1  = new String("mourya");
      String s2 = new String("mourya");
      System.out.println(s1==s2);
      System.out.println(s1.equals(s2));


      StringBuffer s3  = new StringBuffer("mourya");
      StringBuffer s4 = new StringBuffer("mourya");
      System.out.println(s3==s4);
      System.out.println(s3.equals(s4));
  }
}
