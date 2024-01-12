package Lecture11;
interface ThreeDFigure{
    float pi=3.14f;
    void CurvedSurfaceArea();
    void TotalSurfaceArea();
    void Volume();
}
class sphere implements ThreeDFigure{
    float radius;
    sphere(float r){
        radius = r;
    }
    private void display(){
        System.out.println("------display--------");
    }

    @Override
    public void CurvedSurfaceArea() {
        System.out.println("We can simply leave the body of this Override method");
    }

    @Override
    public void TotalSurfaceArea() {
        float tsa;
        tsa = 4* sphere.pi * radius * radius;
        System.out.println("Total Surface area of sphere "+ tsa+" sq. cm");
    }

    @Override
    public void Volume() {
        System.out.println("We can simply leave the body of this Override method");}
}

public class solution {
    public static void main(String[] args) {
        sphere s= new sphere(3);
        s.TotalSurfaceArea();
    }
}
