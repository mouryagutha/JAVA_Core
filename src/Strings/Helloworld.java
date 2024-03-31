package Strings;

public class Helloworld {

    public  static  void main(String[] args)
    {
        StringBuffer s = new StringBuffer("hello");
        s.append("world");
        System.out.println(s);


        String sb = new String("hello ");
        sb.concat("world");
        System.out.println(sb);
    }

}
