package study.jeanwang2dev;

public class Main {

    public static void main(String[] args) {
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        // the lines below will give an error
//        two.name = "kate";
//        Math math = new Math();
        String pw = "IamPassword%@37";
        Password password = new Password(pw);
        password.storePassword();
        System.out.println("In or not: " + password.letMeIn("IamPassword%@3"));

        int testNum = 5;
        int key = 6;
        int result = testNum ^ key;
        System.out.println("Result is " + result);

//        final String secretKey= "www%secret$random";
//        String originalString = "helloWorldMessage";
//        String encryptedString = AES.encrypt(originalString, secretKey);
//        String decryptedString = AES.decrypt(encryptedString, secretKey);
//
//        System.out.println(originalString);
//        System.out.println(encryptedString);
//        System.out.println(decryptedString);
    }
}
