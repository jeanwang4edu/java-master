package study.jeanwang2dev;

/**
 * Created by jean on 12/10/20.
 */
public class ExtendedPassword extends Password{
    private String decryptedPassword;

    public ExtendedPassword(String password) {
        super(password);
        this.decryptedPassword = password;
    }


}
