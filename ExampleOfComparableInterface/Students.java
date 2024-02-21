package ExampleOfComparableInterface;

public class Students implements Comparable<Students>
{
    private String stdid,stdname;
    private int age;
    /*--------------------------------------------------------*/
    public String getStdid() {
        return stdid;
    }
    public void setStdid(String stdid) {
        this.stdid = stdid;
    }
    public String getStdname() {
        return stdname;
    }
    public void setStdname(String stdname) {
        this.stdname = stdname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public int compareTo(Students std)
    {
        //comparison according to age
        return (this.age - std.age);
    }
    @Override
    public String toString()
    {
        return "Student [stdid=" + stdid + ", stdname=" + stdname + ", age=" + age + "]";
    }
}