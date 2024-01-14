package Lecture12;

public class Sphere implements ThreeDimensionalFigure{

    float radius;
    Sphere(float r){
        radius = r;
    }
    @Override
    public void CurvedSurfaceArea() {
        System.out.println("-------sphere-------");
        System.out.println("Radius = "+radius+" cm");
        System.out.println("Curved Surface Area= "+(4*pi*radius*radius)+" cubic cm");
        System.out.println("--------------------------------------");
    }

    @Override
    public void TotalSurfaceArea() {
        System.out.println("Sphere have tsa=csa");
    }

    @Override
    public void Volume() {

        System.out.println("-------sphere-------");
        float v;
        v=((4/3)*3.14f*radius*radius*radius);
        System.out.println("Radius = "+radius+" cm");
        System.out.println("volume= "+(v)+" cubic cm");
        System.out.println("--------------------------------------");
    }
}
