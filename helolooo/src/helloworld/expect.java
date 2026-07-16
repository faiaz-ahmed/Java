package helloworld;

class Student {

    private String name;

    private int ID;

    private double CGPA;

    private String email;



    public Student()

    {

    	

    }



    public Student(String name, int ID, double CGPA, String email)

    {

        this.name = name;

        this.ID = ID;

        this.CGPA = CGPA;

        this.email = email;

    }



    public String getName() 

    {

        return name;

    }

    public void setName(String name) 

    {

        this.name = name;

    }

    public int getID() 

    {

        return ID;

    }

    public void setID(int ID) 

    {

        this.ID = ID;

    }

    public double getCGPA() 

    {

        return CGPA;

    }

    public void setCGPA(double CGPA)

    {

        this.CGPA = CGPA;

    }

    public String getEmail() 

    {

        return email;

    }

    public void setEmail(String email) 

    {

        this.email = email;

    }

}



public class expect {

    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = new Student();

        Student s3 = new Student();

        Student s4 = new Student();

        Student s5 = new Student();



        s1.setName("Farabi");

        s1.setID(123);

        s1.setCGPA(3.74);

        s1.setEmail("farabi.ahmed.253@northsouth.edu");

        System.out.println("Name: " + s1.getName() + "\nID: " + s1.getID() + "\nCGPA: " + s1.getCGPA() + "\nEmail: " + s1.getEmail() + "\n");



        s2.setName("Anika");

        s2.setID(124);

        s2.setCGPA(3.75);

        s2.setEmail("anika.tasnim@northsouth.edu");

        System.out.println("Name: " + s2.getName() + "\nID: " + s2.getID() + "\nCGPA: " + s2.getCGPA() + "\nEmail: " + s2.getEmail() + "\n");



        s3.setName("Asif");

        s3.setID(125);

        s3.setCGPA(3.76);

        s3.setEmail("asif.khan@northsouth.edu");

        System.out.println("Name: " + s3.getName() + "\nID: " + s3.getID() + "\nCGPA: " + s3.getCGPA() + "\nEmail: " + s3.getEmail() + "\n");



        s4.setName("Zara");

        s4.setID(126);

        s4.setCGPA(3.77);

        s4.setEmail("zara.rahman@northsouth.edu");

        System.out.println("Name: " + s4.getName() + "\nID: " + s4.getID() + "\nCGPA: " + s4.getCGPA() + "\nEmail: " + s4.getEmail() + "\n");



        s5.setName("Nabil");

        s5.setID(127);

        s5.setCGPA(3.78);

        s5.setEmail("nabil.islam@northsouth.edu");

        System.out.println("Name: " + s5.getName() + "\nID: " + s5.getID() + "\nCGPA: " + s5.getCGPA() + "\nEmail: " + s5.getEmail() + "\n");

        

        Student s6 = new Student("Farabi", 123, 3.74, "farabi.ahmed.253@northsouth.edu");

        Student s7 = new Student("Anika", 124, 3.75, "anika.tasnim@northsouth.edu");

        Student s8 = new Student("Asif", 125, 3.76, "asif.khan@northsouth.edu");

        Student s9 = new Student("Zara", 126, 3.77, "zara.rahman@northsouth.edu");

        Student s10 = new Student("Nabil", 127, 3.78, "nabil.islam@northsouth.edu");



        System.out.println("Name: " + s6.getName() + "\nID: " + s6.getID() + "\nCGPA: " + s6.getCGPA() + "\nEmail: " + s6.getEmail() + "\n");

        System.out.println("Name: " + s7.getName() + "\nID: " + s7.getID() + "\nCGPA: " + s7.getCGPA() + "\nEmail: " + s7.getEmail() + "\n");

        System.out.println("Name: " + s8.getName() + "\nID: " + s8.getID() + "\nCGPA: " + s8.getCGPA() + "\nEmail: " + s8.getEmail() + "\n");

        System.out.println("Name: " + s9.getName() + "\nID: " + s9.getID() + "\nCGPA: " + s9.getCGPA() + "\nEmail: " + s9.getEmail() + "\n");

        System.out.println("Name: " + s10.getName() + "\nID: " + s10.getID() + "\nCGPA: " + s10.getCGPA() + "\nEmail: " + s10.getEmail() + "\n");

        Student[] s= new Student[10];

        s[0]= new Student();

        s[0].setName("Farabi");

        s[0].setID(123);

        s[0].setCGPA(3.74);

        s[0].setEmail("farabi.ahmed.253@northsouth.edu");

        s[1]= new Student();

        s[1].setName("Anika");

        s[1].setID(124);

        s[1].setCGPA(3.75);

        s[1].setEmail("anika.tasnim@northsouth.edu");

        s[2]= new Student();

        s[2].setName("Asif");

        s[2].setID(125);

        s[2].setCGPA(3.76);

        s[2].setEmail("asif.khan@northsouth.edu");

        s[3]= new Student();

        s[3].setName("Zara");

        s[3].setID(126);

        s[3].setCGPA(3.77);

        s[3].setEmail("zara.rahman@northsouth.edu");

        s[4]= new Student();

        s[4].setName("Nabil");

        s[4].setID(127);

        s[4].setCGPA(3.78);

        s[4].setEmail("nabil.islam@northsouth.edu");

        s[5] = new Student("Farabi", 123, 3.74, "farabi.ahmed.253@northsouth.edu");

        s[6] = new Student("Anika", 124, 3.75, "anika.tasnim@northsouth.edu");

        s[7] = new Student("Asif", 125, 3.76, "asif.khan@northsouth.edu");

        s[8] = new Student("Zara", 126, 3.77, "zara.rahman@northsouth.edu");

        s[9] = new Student("Nabil", 127, 3.78, "nabil.islam@northsouth.edu");

        for(int i=0; i<s.length; i++)

        {

        	System.out.println("Student: "+(i+1));

        	System.out.println("The student information: \nName:"+ s[i].getName() + "\nID:" + s[i].getID() + "\nCGPA:" + s[i].getCGPA() + "\nEmail:" + s[i].getEmail()+ "\n" );

        }

    }

}