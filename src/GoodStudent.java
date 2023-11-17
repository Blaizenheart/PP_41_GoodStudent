import java.util.Locale;

public class GoodStudent {
    private String firstName, lastName, nickname;
    private int idNum;
    private double gpa;
    private String csStatus;
    //3 Constructors
    //1) Zero Argument Constructor
    public GoodStudent()
    {
        firstName = "";
        lastName = "";
        nickname = "";
        idNum = 0;
        gpa = 0.0;
        csStatus = "No";
    }
    //2) Constructor with all fields
    public GoodStudent(String myFirstName, String myLastName, String myNickname, int myIDNum, double myGpa, String myCSStatus)
    {
        firstName = myFirstName;
        lastName = myLastName;
        nickname = myNickname;
        idNum = myIDNum;
        gpa = myGpa;
        csStatus = myCSStatus;
    }
    //3) Constructor without Nickname
    public GoodStudent(String myFirstName, String myLastName, int myIDNum, double myGpa, String myCSStatus)
    {
        firstName = myFirstName;
        lastName = myLastName;
        nickname = "";
        idNum = myIDNum;
        gpa = myGpa;
        csStatus = myCSStatus;
    }
    //Accessors/Getters
    public String getFirstName()
    {
        return firstName + "'s " + "First Name: " + firstName;
    }
    public String getLastName()
    {
        return firstName + "'s " + "Last Name: " + lastName;
    }
    public String getNickname()
    {
        return firstName + "'s " + "Nickname: " + nickname;
    }
    public String getID()
    {
        return firstName + "'s " + "ID Number: " + idNum;
    }
    public String getGpa()
    {
        return firstName + "'s " + "GPA: " + gpa;
    }
    public String getCSStatus()
    {
        return "Is " + firstName +  " in a CS class?: " + csStatus;
    }
    //Mutators/Setters
    public void setNickname(String myNickname)
    {
        nickname = myNickname;
    }
    public void setGpa(double myGpa)
    {
        gpa = myGpa;
    }
    //Brain Methods
    public String CreateID() //creates a digital ID for each student
    {
        String firstInitial = firstName.substring(0,1).toLowerCase();
        String lastNameToLower =  lastName.toLowerCase();
        String idLastThree = String.valueOf(idNum).substring(String.valueOf(idNum).length()-3);
        return firstName + "'s " + "Digital ID: " + firstInitial + lastNameToLower + idLastThree;
    }
    public String CSGPA()
    {
        String result;
        double newGPA =  gpa * 1.15;
        result = firstName + "'s " + "GPA w/ CS boost: ";
        return result + newGPA;
    }
    //toString
    public String toString()
    {
        String result = "-------------------------------";
        result += "\nFirst Name: " + firstName;
        result += "\nLast Name: " + lastName;
        result += "\nNickname: " + nickname;
        result += "\nId#: " + idNum;
        result += "\nGPA: " + gpa;
        if (csStatus == "Yes") {
            result += "\n" + firstName + " is a CS student.";
        } else {
            result += "\n" + firstName + " is NOT a CS student.";
        }
        result += "\n-------------------------------";
        return result;
    }

}
