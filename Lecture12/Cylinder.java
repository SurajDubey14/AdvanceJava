package Lecture12;

class Cylinder implements ThreeDimensionalFigure {
    float radius,height;
    Cylinder(float r,float h){
        radius =r;
        height = h;
    }
    @Override
    public void CurvedSurfaceArea() {

        System.out.println("-------Cylinder-------");
        System.out.println("Radius= "+radius+" cm");
        System.out.println("Height= "+height+" cm");
        System.out.println("Curved surface area= "+(2*pi*radius*height)+" sq cm");
        System.out.println("--------------------------------------");
    }

    @Override
    public void TotalSurfaceArea() {

        System.out.println("-------Cylinder-------");
        System.out.println("Radius= "+radius+" cm");
        System.out.println("Height= "+height+" cm");
        System.out.println("Total surface area= "+(2*pi*radius*(radius+height))+" cubic cm");
        System.out.println("--------------------------------------");
    }

    @Override
    public void Volume() {

        System.out.println("-------Cylinder-------");
        System.out.println("Radius= "+radius+" cm");
        System.out.println("Height= "+height+" cm");
        System.out.println("volume= "+(pi*radius*radius*height)+" cubic cm");
        System.out.println("--------------------------------------");
    }
}
