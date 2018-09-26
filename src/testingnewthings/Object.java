/*
 * Last Updated: 0/0/2017
 * Class description:
 */
package testingnewthings;

/**
 *
 * @author Pussy Whisperer
 */
public class Object {
    private String name;
    private int age;
    
    Object(String name, int age){
        this.name = name;
        this.age = age;
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
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString(){
        return "\nName: "+this.getName() + "\nAge: "+this.getAge()+"\n";
    }
}
