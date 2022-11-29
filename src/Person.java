public class Person {

    private String firstName;
    private String lastName;
    private String email;

    public Person(String fn, String ln, String em)//FirstName, LastName, EMail
    {
        firstName = fn;
        lastName = ln;
        email = em;
    }

    public void Introduce()
    {
        System.out.println("Hello, my name is " + firstName + " " + lastName);
    }

    public String GetFirstName()
    {
        return firstName;
    }

    public String GetLastName()
    {
        return lastName;
    }

    public String GetEmail()
    {
        return email;
    }

    public void SetEmail(String em)
    {
        email = em;
    }
}
