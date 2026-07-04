public class substring_method {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.substring(1,4);
        System.out.println(str2);
        String email = "abhinavaby07@gmail.com";
        String userName = email.substring(0,email.indexOf("@"));
        System.out.println("user name = "+userName);
        String domain =  email.substring(email.indexOf("@")+1);
        System.out.println("domain = "+domain);

    }
}
