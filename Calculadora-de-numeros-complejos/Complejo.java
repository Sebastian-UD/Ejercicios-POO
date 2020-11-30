import java.util.Scanner;

public class Complejo{
  float real=0;
  float imag=0;

  public float getReal(){
    return this.real;
  }

  public void setReal(float a){
    this.real=a;
  }

  public Complejo suma(Complejo c1){
    Complejo res=new Complejo();
    res.real=this.real+c1.real;
    res.imag=this.imag+c1.imag;
    return res;
  }

  public static Complejo suma(Complejo c1, Complejo c2){
    Complejo res = new Complejo();
    res.real = c1.real + c2.real;
    res.imag = c1.imag + c2.imag;
    return res;
  }

  public Complejo resta(Complejo c1){
    Complejo res=new Complejo();
    res.real=this.real-c1.real;
    res.imag=this.imag-c1.imag;
    return res;
  }

  public static Complejo resta(Complejo c1, Complejo c2){
    Complejo res=new Complejo();
    res.real=c1.real-c2.real;
    res.imag=c1.imag-c2.imag;
    return res;
  }

  public Complejo multiplicacion(Complejo c1){
    Complejo res=new Complejo();
    res.real=this.real*c1.real-(this.imag * c1.imag);
    res.imag=(this.real*c1.imag) + (this.imag*c1.real);
    return res;
  }

  public static Complejo multiplicacion(Complejo c1, Complejo c2){
    Complejo res=new Complejo();
    res.real=c1.real*c2.real-(c1.imag * c2.imag);
    res.imag=(c1.real*c2.imag) + (c1.imag*c2.real);
    return res;
  }


  public Complejo dividir(Complejo c2){
    Complejo res=new Complejo();
    Complejo numer=this.multiplicacion(c2.conjugado());
    res.real=numer.real/c2.multiplicacion(c2.conjugado()).real;
    res.imag=numer.imag/c2.multiplicacion(c2.conjugado()).real;
    return res;
  }

  public static Complejo dividir(Complejo c1, Complejo c2){
    Complejo res=new Complejo();
    Complejo numer=c1.multiplicacion(c2.conjugado());
    res.real=numer.real/c2.multiplicacion(c2.conjugado()).real;
    res.imag=numer.imag/c2.multiplicacion(c2.conjugado()).real;
    return res;
  }

  public Complejo conjugado(){
    Complejo res=new Complejo();
    res.real=this.real;
    res.imag=-this.imag;
    return res;
  }

  public static Complejo conjugado(Complejo c1){
    Complejo res=new Complejo();
    res.real=c1.real;
    res.imag=-c1.imag;
    return res;
  }

  public double norma(){
    return Math.sqrt(Math.pow(this.real,2)+Math.pow(this.imag,2));
  }

  public static double norma(Complejo c1){
    return Math.sqrt(Math.pow(c1.real,2)+Math.pow(c1.imag,2));
  }

  public void leer(){
    Scanner s=new Scanner(System.in);
    System.out.println("digite la parte real del numero complejo");
    this.real=s.nextFloat();
    System.out.println("digite la parte imaginaria del "+this+" numero complejo");
    this.imag=s.nextFloat();
  }

  public void imprimir(){
    if(this.imag>=0){
      System.out.println(this.real+"+"+this.imag+"i");
    }
    else{
      System.out.println(this.real+ "" + this.imag+"i");
    }
  }  
}