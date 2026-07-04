public class string_methods {
    public static void main(String[] args) {
        String str1="hello";
        System.out.println("length of str1 = "+str1.length());
        char ch=str1.charAt(0);
        System.out.println("the first letter of word stored at str1 is "+ch);
        System.out.println("index of o in hello is "+str1.indexOf("o"));
        System.out.println("last index of l in hello is "+str1.lastIndexOf("l"));
        String str2=str1.toUpperCase();
        System.out.println("str1 in uppercase "+str2);
        String str3=str1.toLowerCase();
        System.out.println("str1 in lowercase "+str3);
        String str4="    hello    ";
        String str5 = str4.trim();
        System.out.println("str4 is "+str4+"which is trimed to "+str5);
        System.out.println(str5.replaceAll("l","p"));
        System.out.println(str5.isEmpty());
        System.out.println(str5.contains("he"));
        System.out.println(str5.equals("hello"));


    }
}
