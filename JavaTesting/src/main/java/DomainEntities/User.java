package DomainEntities;

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
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
