package question3;


public class Author {

    private String name;
    private String email;
    private char gender;
    
    public Author(String name, String email, char gender) {
        super();
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
    }
    
    public String toString(){
        return this.name + "("+this.gender+")"+" at "+this.email;
    }
    
    
}