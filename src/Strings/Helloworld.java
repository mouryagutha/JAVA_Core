package Strings;

public class Helloworld {

    public  static  void main(String[] args)
    {
        StringBuffer s = new StringBuffer("mourya");
        s.append("kumar");
        System.out.println(s);


        String sb = new String("mourya");
        sb.concat("kumar");
        System.out.println(sb);
    }

}
