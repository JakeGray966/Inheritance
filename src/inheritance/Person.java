
package inheritance;


public class Person{
   
    
    private String Forename;
    private String Surname;
    private double shoeSize;
    private int Age;
    private String Mobile;

    
    
    public Person(String Forename, String Surname, double shoeSize, int Age, String Mobile) {
        
        this.Forename = Forename;
        this.Surname = Surname;
        this.shoeSize = shoeSize;
        this.Age = Age;
        this.Mobile = Mobile;
    }

    @Override
    public String toString() {
        return "Person{" + "\nForename=" + Forename + "\nSurname=" + Surname + "\nshoeSize=" + shoeSize + "\nAge=" + Age + "\nMobile=" + Mobile + '}';
    }
      
}

 
    
