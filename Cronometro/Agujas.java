public class Agujas{
  private int dato;

  public Agujas(){
    this.dato=0;
  }

  public Agujas(int a){
    this.dato=a;
  }

  public void setDato(int a){
    this.dato=a;
  }

  public int getDato(){
    return this.dato;
  }

  public void aumentar(){
    this.dato=this.dato+1;
  }

}