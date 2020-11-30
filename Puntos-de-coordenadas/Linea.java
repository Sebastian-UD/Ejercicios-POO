public class Linea{

  private Puntos p1;
  private Puntos p2;

  public Linea(){

  }

  public Linea(Puntos a, Puntos b){
    p1=a;
    p2=b;
  }
  
  ////Setters
  public void setP1(Puntos a){
    this.p1=a;
  }

  public void setP2(Puntos a){
    this.p2=a;
  }

  ////Getters
  public Puntos getP1(){
    return this.p1;
  }
  
  public Puntos getP2(){
    return this.p2;
  }

  //Magnitud de la linea
  public double magnitud(){
    return this.p1.distancia(this.p2);
  }

  //Mover ambos puntos en x
  public void moverX(float x){

    this.p1.moverX(x);
    this.p2.moverX(x);
  }
  
  //Mover ambos puntos en y
  public void moverY(float y){

    this.p1.moverY(y);
    this.p2.moverY(y);
  }

  //Mover ambos puntos de la misma manera, la misma cantidad en los tres ejes
  public void moverDiagonal(float a){ 
    this.p1.moverDiagonal(a);
    this.p2.moverDiagonal(a);
  }
  
  //Mover ambos puntos de la misma manera, pero una cantidad distinta para cada eje
  public void moverDiagonal(float i, float j){
    this.p1.moverDiagonal(i, j);
    this.p2.moverDiagonal(i, j);
  }
}