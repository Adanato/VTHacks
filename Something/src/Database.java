import java.util.ArrayList;


public class Database {
    private ArrayList<Student> database;
    private String name;

    public Database(String Newname)
    {
        this.name = Newname;
        this.database = new ArrayList<Student>();
    }

    /**
     * Returns the name of the database;
     * 
     * @return The name of the database
     */
    public String getName()
    {
        return this.name;
    }
    /**
     * Returns the name of the database;
     * 
     * @return The name of the database
     */
    public void setName(String newName)
    {
        this.name = newName;
    }
    /**
     * 
     * @return Array of students
     */
    public ArrayList<Student> getDatabase()
    {
        return this.database;
    }


}
