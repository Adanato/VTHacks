public class Student {
    
    private String name;
    private String state;

    private String race;

    private double gpa;


    public Student(String n, String s, String r, double g)
    {

        name = n;
        state = s;
        race= r;
        gpa = g;


    }

    

    public String getName()
    {
        return this.name;
    }
    public String getState()
    {
        return this.state;
    }
    public String getRace()
    {
        return this.race;
    }
    public double getGpa()
    {
        return this.gpa;
    }

}
