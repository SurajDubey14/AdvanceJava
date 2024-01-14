package Lecture12;

public class Cuboid implements ThreeDimensionalFigure{

    int length,breadth,height;
    Cuboid(int l, int b, int h){
        length = l;
        breadth = b;
        height = h;
    }
    @Override
    public void CurvedSurfaceArea() {
        System.out.println("-------Cuboid-------");
        System.out.println("length= "+length+" cm");
        System.out.println("breadth= "+breadth+" cm");
        System.out.println("height= "+height+" cm");
        System.out.println("Total surface area= "+(2*((length*height)+(breadth*height)))+" cubic cm");
        System.out.println("--------------------------------------");
    }

    @Override
    public void TotalSurfaceArea() {
        System.out.println("-------Cuboid-------");
        System.out.println("length= "+length+" cm");
        System.out.println("breadth= "+breadth+" cm");
        System.out.println("height= "+height+" cm");
        System.out.println("Total surface area= "+(2*((length*breadth)+(breadth*height)+(height*length)))+" cubic cm");
        System.out.println("--------------------------------------");
    }

    @Override
    public void Volume() {
        System.out.println("-------Cuboid-------");
        System.out.println("length= "+length+" cm");
        System.out.println("breadth= "+breadth+" cm");
        System.out.println("height= "+height+" cm");
        System.out.println("volume= "+(length*breadth*height)+" cubic cm");
        System.out.println("--------------------------------------");

    }
}
