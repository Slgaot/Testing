package DomainEntities;

import javaTesting.Resources.PasswordUtils;

public class User {
    private String name;
    private String password; //passwrd in hash mode and salted
    private String salt; // van canviant a cada usuari
    //password == Hash( password_real + salt)

    public User() {
        this("Tomeu", "secret");
    }

    public User(String name, String password) {
        this.name = name;
        //this.password = password; //Insegura !!!
        this.salt = PasswordUtils.genSalt();
        //falta fer hashn amb salt del password
        this.password = PasswordUtils.hashedPassword(password, this.salt);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean verifyPassword(String passwordEntered) {
        return PasswordUtils.verifyUserPassword(passwordEntered, salt, password);
    }

    public void setPassword(String password) {
        this.password = PasswordUtils.hashedPassword(password,salt);
    }
}
