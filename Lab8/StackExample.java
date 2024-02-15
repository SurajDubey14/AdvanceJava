package Lab8;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> cities = new Stack<String>();
        /*------Adding element in Stack-------*/
        cities.push("Noida");
        cities.push("Delhi");
        cities.push("Mumbai");
        cities.push("Dubai");
        cities.push("Lucknow");
        cities.push("Pune");
        cities.push("Surat");
        cities.push("Bangalore");
        cities.push("Agra");
        cities.push("Kanpur");
        /*-------Displaying the elements of the Stack*/
        if(cities.size()>0){
            System.out.println("------Displaying elements present in Stack--------");
            Iterator<String> city = cities.iterator();
            while(city.hasNext()){
                System.out.println(city.next());
            }
        }else{
            System.out.println("Stack is empty");
        }
        /*-----Removing top 4 element in stack-----*/
        for(int i=0;i<=3;i++) {
            cities.pop();
        }
        /*-------Displaying the elements of the Stack-------*/
        if(cities.size()>0){
            System.out.println("------Modified Stack Displaying elements present in Stack-------");
            Iterator<String> City= cities.iterator();
            while(City.hasNext()){
                System.out.println(City.next());
            }
        }else{
            System.out.println("Stack is empty");
        }
    }
}
