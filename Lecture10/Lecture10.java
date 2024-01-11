// Polymorphism

package Lecture10;

/*----------Class For volume calculation in 3d shapes*/
class VolumeCalculator{
    /*------------------Methods-----------------------*/
    /*-----changing the number of parameter------------*/
    /*------------volume of cube---------------*/
    public void volume(int side){
        System.out.println("-------Cube-------");
        System.out.println("side= "+side+" cm");
        System.out.println("volume= "+(side*side*side)+" cubic cm");
        System.out.println("--------------------------------------");
    }

    /*-----------------volume of sphere------------------------------*/
    public void volume(float radius){
        System.out.println("-------sphere-------");
        float v;
        v=((4/3)*3.14f*radius*radius*radius);
        System.out.println("Radius = "+radius+" cm");
        System.out.println("volume= "+(v)+" cubic cm");
        System.out.println("--------------------------------------");
    }
    /*-----------volume of cuboid---------------*/
    public void volume(int length, int breadth, int height){
        System.out.println("-------Cuboid-------");
        System.out.println("length= "+length+" cm");
        System.out.println("breadth= "+breadth+" cm");
        System.out.println("height= "+height+" cm");
        System.out.println("volume= "+(length*breadth*height)+" cubic cm");
        System.out.println("--------------------------------------");
    }

    //Overloading by changing  order of parameters
    /*-------volume of cylinder--------*/
    public void volume(int radius,float height){
        float v = 3.14f * radius * radius * height;
        System.out.println("---------cylinder----------");
        System.out.println("Radius = "+radius+" cm");
        System.out.println("Height = "+height+" cm");
        System.out.println("volume= "+(v)+" cubic cm");
        System.out.println("--------------------------------------");
    }
    /*-------volume of cone--------*/
    public void volume(float height,int radius){
        float v = (3.14f * radius * radius * height)/3;
        System.out.println("---------cone----------");
        System.out.println("Radius = "+radius+" cm");
        System.out.println("Height = "+height+" cm");
        System.out.println("volume= "+(v)+" cubic cm");
        System.out.println("--------------------------------------");
    }
}
public class Lecture10 {
    public static void main(String[] args) {
        VolumeCalculator vc=new VolumeCalculator();
        vc.volume(7);  // volume of cube will be executed
        vc.volume(7.0f);  // volume of sphere will be executed
        vc.volume(10,12.0f); // volume of cone will be executed
        vc.volume(14.0f,15); // volume of cylinder will be executed
        vc.volume(10,12,14); // volume of cuboid will be executed

/*      1 :- if we have only one method(int) and we have to pass float value then its error.
        2 :- if we have a method(float)and we have to pass a value like 25.0 it will consider
       as double
        3 :- we have to put it as 25.0f to pass it as a double value.
 */
    }
}
