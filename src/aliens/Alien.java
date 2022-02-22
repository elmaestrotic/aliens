package aliens;

public class Alien {
//atributos
private String planetor;
private int edad, tipo;//1= gris, 2 = nordico


public Alien(){};//método constructor x default

public Alien(String planetor, int edad, int tipo){//método constructo especializado
        this.planetor = planetor;
        this.edad = edad;
        this.tipo = tipo;
        
        if (tipo==1){
            System.out.println("Se ha creado un Gris");
        }else{
            System.out.println("Seha creado un Pleyadiano");
        }
        
}

//métodos
void abducirVacas() {
    System.out.println("No dijo ni muu..");
    
    if (tipo==2){
        System.out.println("NO se puede");
    }
    } //fin del método abducirVacas

void abducirHumanos(){
    System.out.println("Venga q no es pa' eso..");
}//fin del metodo abducirHumanos

void chuparCabras(){
      if (tipo==2){
        System.out.println("NO se puede");
    }else{
          System.out.println("Llorela pa'..");
      }
}//fin del método chuparCabras


}
