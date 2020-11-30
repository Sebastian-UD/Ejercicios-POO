import java.util.Scanner;

class Puntos3d extends Puntos{
  private float corz;

  public Puntos3d(){
    super();
    this.corz=0;
  }
  public Puntos3d(float x, float y, float z){
    super(x, y);
    this.corz=z;
  }

  public void setCorz(float z){
    this.corz=z;
  }

  public float getCorz(){
    return this.corz;
  }

  //Distancia entre dos puntos
  public double distancia(Puntos3d p2){

    float restax=this.getCorx()-p2.getCorx();
    
    float restay=this.getCory()-p2.getCory();

    float restaz=this.corz-p2.corz;

    return Math.sqrt(Math.pow(restax,2) + Math.pow(restay,2) + Math.pow(restaz, 2));

  }

  //Distancia con respecto al origen
  public double distancia(){

    return Math.sqrt(Math.pow(this.getCorx(),2) + Math.pow(this.getCory(),2) + Math.pow(this.corz,2));
  }

  //Mover en z
  public void moverZ(float z){
    this.corz+=z;
  }
  
  //Mover en diagonal
  public void moverDiagonal(float a){
    super.moverDiagonal(a);
    this.moverZ(a);
  }

  //Mover en diagonal por separado
  public void moverDiagonal(float i, float j, float k){
    super.moverDiagonal(i, j);
    moverZ(k);
  }

  public void leer(){
    Scanner s=new Scanner(System.in);
    super.leer();
    System.out.println("Ingrese la coordenada z del punto");
    this.corz=s.nextFloat();
  }

  public void imprimir(){
    System.out.println("(" + this.getCorx() + "x , " + this.getCory() + "y " + this.corz + "z)");
  }
}