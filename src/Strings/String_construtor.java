package Strings;

public class String_construtor {
    public static void main(String[] args)
    {
        char[] ch = {'j','a','v','a'};
        String s = new String(ch);

        System.out.println(s);


        byte[] b = { 97 ,98 ,67};
        String s1 = new String(b);
        System.out.println(s1);

    }
}
