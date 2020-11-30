import java.util.Scanner;

public class Puntos{
  private float corx;
  private float cory;
  
  public Puntos(){
   corx=0;
   cory=0;
  }

  public Puntos(float a, float b){
    corx=a;
    cory=b;
  }
  ////Setters
  public void setCorx(float corx){
    this.corx=corx;
  }

  public void setCory(float cory){
    this.cory=cory;
  }

  ////Getters
  public float getCorx(){
    return this.corx;
  }

  public float getCory(){
    return this.cory;
  }

  //Mover en x
  public void moverX(float x){
    this.corx+=x;
  }
  
  //Mover en y
  public void moverY(float y){
    this.cory+=y;
  }

  //Mover diagonal
  public void moverDiagonal(float a){
    this.moverX(a);
    this.moverY(a);
  }

  //Mover en diagonal por separado;
  public void moverDiagonal(float i,float j){
    this.moverX(i);
    this.moverY(j);
  }

  //Distancia entre dos puntos
  public double distancia(Puntos p2){

    float restax=this.corx-p2.corx;
    
    float restay=this.cory-p2.cory;

    return Math.sqrt(Math.pow(restax,2) + Math.pow(restay,2));

  }

  //Distancia con el origen
  public double distancia(){

    return Math.sqrt(Math.pow(this.corx,2) + Math.pow(this.cory,2));
  }

  public void imprimir(){
    System.out.println("(" + this.corx + "x , " + this.cory + "y)");
  }

  public void leer(){
    Scanner s=new Scanner(System.in);
    System.out.println("Ingrese la coordenada x del punto");
    this.corx=s.nextFloat();
    System.out.println("Ingrese la coordenada y del punto");
    this.cory=s.nextFloat();
  }
}