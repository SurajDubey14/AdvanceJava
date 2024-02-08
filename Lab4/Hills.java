package Lab4;

// Baseclass HillStation having Three subclasses Manali, Mussoorie, Gulmarg.
class HillStations{
    // Location Method
    public void location(){
        System.out.println("Location");
    }
    // FamousFor method
    public void famousFor(){
        System.out.println("Famous For");
    }
}
//Sub Classes
class Manali extends HillStations{
    // Location method overrides according to Manali
    public void location(){
        System.out.println("Manali  is located in Himachal Pradesh");
    }
    // FamousFor method overrides according to Manali
    public void famousFor(){
        System.out.println("Manali is famous for cool climate and snow-capped mountains");
    }
}
class Mussoorie extends HillStations{
    // Location overrides according to Mussorrie
    public void location(){
        System.out.println("Mussoorie is located in Uttarakhand");
    }
    // FamousFor method overrides according to Maussoorie
    public void famousFor(){
        System.out.println("Mussoorie is famous for scenic views, waterfalls");
    }
}
class Gulmarg extends HillStations{
    // Location method overrides according to Gulmarg
    public void location(){
        System.out.println("Gulmarg is located in Jammu kashmir");
    }
    // FamousFor method overrides according to Gulmarg
    public void famousFor(){
        System.out.println("Gulamrg is famous for Meadow of Flowers");
    }
}
public class Hills {
    public static void main(String[] args) {
        // Manali Object Methods
        System.out.println("--------------Manali-------------");
        Manali manali= new Manali();
        manali.location();
        manali.famousFor();
        System.out.println("--------------Mussoorie-------------");

        // Mussoorie Object Methods
        Mussoorie mussoorie = new Mussoorie();
        mussoorie.location();
        mussoorie.famousFor();
        System.out.println("--------------Gulmarg-------------");
        // Gulmarg Object Methods
        Gulmarg gulmarg = new Gulmarg();
        gulmarg.location();
        gulmarg.famousFor();
    }
}
