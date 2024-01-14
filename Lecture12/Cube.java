package Lecture12;

public class Cube implements ThreeDimensionalFigure{
    int side;
    Cube(int s){
        side = s;
    }
    @Override
    public void CurvedSurfaceArea() {

        System.out.println("-------Cube-------");
        System.out.println("side= "+side+" cm");
        System.out.println("Curved surface area= "+(6*side*side)+" cubic cm");
        System.out.println("--------------------------------------");
    }

    @Override
    public void TotalSurfaceArea() {
        System.out.println("-------Cube-------");
        System.out.println("side= "+side+" cm");
        System.out.println("Total surface area= "+(6*side*side)+" cubic cm");
        System.out.println("--------------------------------------");
    }

    @Override
    public void Volume() {
        System.out.println("-------Cube-------");
        System.out.println("side= "+side+" cm");
        System.out.println("volume= "+(side*side*side)+" cubic cm");
        System.out.println("--------------------------------------");
    }
}
