package ExampleOfComparableInterface;

import java.util.*;
import java.io.*;
class StudentList {

    public static void main(String[] args)throws IOException
    {
        /*---- ArrayList of student----*/
        ArrayList<Students> stdlist=new ArrayList<Students>();
        /*---- Inserting data of 5 students------*/
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter details of any 3 student : ");
        for(int i=1;i<=3;i++)
        {
            System.out.print("Name : ");
            String sname=br.readLine();
            System.out.print("Student id : ");
            String sid=br.readLine();
            System.out.print("Age(in year) : ");
            int stdage=Integer.parseInt(br.readLine());
            /*-----Student object-----*/
            Students std=new Students();
            /*--- setting data into student-----*/
            std.setStdid(sid);
            std.setStdname(sname);
            std.setAge(stdage);
            /*----------------------------------------*/
            /*-----Insertion into arraylist--------------*/
            stdlist.add(std);
            System.out.println("-------------------------------------------------------");
        }
        System.out.println("Students are : \n");
        for(Students s:stdlist)
        {
            System.out.println(s);
        }
        /*---- To sort--- arraylist----*/
        Collections.sort(stdlist);
        System.out.println("Students are : \n");
        for(Students s:stdlist)
        {
            System.out.println(s);
        }

    }

}

