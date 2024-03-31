package Strings;

public class String_methods {
    public static void main(String[] args) {
        String s = "mourya";
        System.out.println(s.charAt(3));

        s = s.concat("kumar");
        System.out.println(s);

        s +="kumar";
        System.out.println(s);

        String s1 = "java";
        System.out.println(s1.equals("Java"));

        String s2 = "java";
        System.out.println(s2.equalsIgnoreCase("Java"));

        String s3 = " ";
        System.out.println(s3.isEmpty());

        String s4 = "mourya";
        System.out.println(s4.length());

        String s5 = "jave";
        System.out.println(s5.replace('e','a'));

        String s6 = "abcdghs";
        System.out.println(s6.substring(5));

        String s7 = "abcdghs";
        System.out.println(s7.substring(3,7));

    }
}
