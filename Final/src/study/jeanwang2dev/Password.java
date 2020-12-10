package study.jeanwang2dev;

import java.util.Objects;

/**
 * Created by jean on 12/10/20.
 */
public class Password {
    private static final String key = "www%secret$random";
    private final String encryptedPassword;

    public Password(String password) {
        AES.setKey(key);
        this.encryptedPassword = encryptDecrypt( password);
    }

    private String encryptDecrypt(String password){
        return AES.encrypt(password, key );
    }

    public void storePassword(){
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean letMeIn(String password){
        if( password.compareTo(Objects.requireNonNull(AES.decrypt(this.encryptedPassword, key))) == 0){
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("Nope, you can not get in");
            return false;
        }
    }
}
