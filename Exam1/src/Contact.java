package Exam1.src;

/** Student Code for Coding Exam 1
 *  Put  your name here, and the CSU honor code
 *
 */
public class Contact {
    private String name;
    private String email;
    private long phone;

    // student code

    /**
     * Write the sets and gets necessary for this class function properly.
     * Tip: examine the code provided to know the name of the methods you
     *      should implement.
     */
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public long getPhone(){
        return phone;
    }

    public void setPhone(long phone){
        this.phone = phone;
    }
    // end student code

    // provided methods and constructors, DO NOT MODIFY

    /**
     * Contact constructor
     * @param name
     * @param email
     * @param phone
     */
    public Contact(String name, String email, long phone) {
        setName(name);
        setEmail(email);
        setPhone(phone);
    }

    /**
     * toString method
     * @return String
     */
    public String toString() {
        return String.format("{name:%s, email:%s, phone:%d}", getName(), getEmail(), getPhone());

    }
    // end provided code

    // you are free to use this main for testing if you develop in your own IDE
    public static void main(String[] args) {
    }
}