
package aliens;

public class Main {
    public static void main(String[] args) {
        Alien obj1=new Alien();
        obj1.abducirVacas();
        
        Alien obj2 = new Alien("Jupiter",600,2);
        obj2.chuparCabras();
        
        Alien oto = new Alien("Reticula",100,1);
        oto.chuparCabras();
    }
}
