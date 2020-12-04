public class Cronometro{
  private Segundero s;
  private Minutero m;
  private Horas h;

  public Cronometro(){

  }

  public Cronometro(Segundero seg, Minutero min, Horas hor){
    this.s=seg;
    this.m=min;
    this.h=hor;
  }

  //SETTERS
  public void setSegundero(Segundero a){
    this.s=a;
  }
  public void setMinutero(Minutero a){
    this.m=a;
  }
  public void setHoras(Horas a){
    this.h=a;
  }

  //GETTERS
  public Segundero getSegundero(){
    return this.s;
  }
  public Minutero getMinutero(){
    return this.m;
  }
  public Horas getHoras(){
    return this.h;
  }
}