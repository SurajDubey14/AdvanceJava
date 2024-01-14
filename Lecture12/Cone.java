package Lecture12;

public class Cone implements ThreeDimensionalFigure{
    float radius,height;
    Cone(float r,float h){
        radius =r;
        height = h;
    }
    @Override
    public void CurvedSurfaceArea() {

        System.out.println("-------Cone-------");
        System.out.println("Radius= "+radius+" cm");
        System.out.println("Height= "+height+" cm");
        System.out.println("Curved surface area= "+(pi*radius*height)+" sq cm");
        System.out.println("--------------------------------------");
    }

    @Override
    public void TotalSurfaceArea() {

        System.out.println("-------Cone-------");
        System.out.println("Radius= "+radius+" cm");
        System.out.println("Height= "+height+" cm");
        System.out.println("Total surface area= "+(pi*radius*(height+radius))+" sq cm");
        System.out.println("--------------------------------------");
    }

    @Override
    public void Volume() {
        System.out.println("-------Cone-------");
        System.out.println("Radius= "+radius+" cm");
        System.out.println("Height= "+height+" cm");
        System.out.println("Volume= "+(pi*radius*radius*height)/3+" sq cm");
        System.out.println("--------------------------------------");
    }
}
