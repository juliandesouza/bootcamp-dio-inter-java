public class MyLibrary {
    
public static void main (String [] args) {

    String firstName = "Julian";
    String secondName = "de Souza";

    String fullName = fullName (firstName, secondName);

    /// One big difference between a variable (the first "fullName" uphere) and a method (the second one) it's the use of parentheses 
}

public static String fullName (String firstName, String secondName) {
    return firstName.concat(" ").concat(secondName);
}

}
