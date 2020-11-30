import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Puntos p1=new Puntos();
    Puntos p2=new Puntos();
    Linea l1=new Linea();

    p1.leer();
    p2.leer();

    System.out.println("El primer punto esá dado por las coordenadas: ");
    p1.imprimir();

    System.out.println("El segundo punto esá dado por las coordenadas: ");
    p2.imprimir();

    l1.setP1(p1);
    l1.setP2(p2);

    int op;

    System.out.println("Ingrese el número de la opción que desee:");
    System.out.println("1.) Distancia entre dos puntos");
    System.out.println("2.) Distancia entre el primer punto y el origen");
    System.out.println("3.) Mover el primer punto punto de forma horizontal");
    System.out.println("4.) Mover el primer punto de forma vertical");
    System.out.println("5.) Mover el primer punto en diagonal");
    System.out.println("6.) Mover el primer punto de forma horizontal y vertical");
    System.out.println("7.) Magnitud de la linea formada por los dos puntos");
    System.out.println("8.) Mover en x la linea formada por los dos puntos");
    System.out.println("9.) Mover en y la linea formada por los dos puntos");
    System.out.println("10.) Mover en diagonal la misma cantidad la linea formada por los dos puntos");
    System.out.println("11.) Mover de forma horizontal y vertical la linea formada por los dos puntos");
    Scanner s=new Scanner(System.in);

    op=s.nextInt();

    if(op==1){
      System.out.println("La distancia entre los puntos es: " + p1.distancia(p2) );
    }

    else if(op==2){
      System.out.println("La distancia que hay desde el origen hasta el primer punto es de: " + p1.distancia());
    }

    else if(op==3){
      System.out.println("Ingrese la cantidad que quiere que se desplace el punto");
      p1.moverX(s.nextFloat());
    }

    else if(op==4){

      System.out.println("Ingrese la cantidad que quiere que se desplace el punto");
      p1.moverY(s.nextFloat());
    }

    else if(op==5){
      System.out.println("Ingrese la cantidad que quiere que se desplace de forma horizontal y vertical");
      p1.moverDiagonal(s.nextFloat());
    }

    else if(op==6){

      System.out.println("Ingrese la cantidad que quiere que se desplace de forma horizontal");
      float x = s.nextFloat();
      
      System.out.println("Ingrese la cantidad que quiere que se desplace de forma vertical");
      float y = s.nextFloat();

      p1.moverDiagonal(x, y);
    }

    else if(op==7){
      System.out.println("La magnitud de la linea es de:" + l1.magnitud());
    }

    else if(op==8){
      System.out.println("Ingrese la cantidad que quiere que se desplacen los puntos en X");
      l1.moverX(s.nextFloat());
    }

    else if(op==9){
      System.out.println("Ingrese la cantidad que quiere que se desplacen los puntos en Y");
      l1.moverY(s.nextFloat());
    }

    else if(op==10){
      System.out.println("Ingrese la cantidad que quiere que se desplacen los puntos en diagonal");
      l1.moverDiagonal(s.nextFloat());
    }

    else if(op==11){

      System.out.println("Ingrese la cantidad que quiere que se desplace de forma horizontal");
      float x = s.nextFloat();
      
      System.out.println("Ingrese la cantidad que quiere que se desplace de forma vertical");
      float y = s.nextFloat();

      l1.moverDiagonal(x,y);
    }

    if(op==3 || op==4 || op==5 | op==6){
      System.out.println("El punto esá dado por las coordenadas: ");
      p1.imprimir();
    }

    else if(op==8 || op==9 || op==10 | op==11){
      System.out.println("El primer punto que forma la linea esá dado por las coordenadas: ");
      p1.imprimir();

      System.out.println("El segundo punto que forma la linea esá dado por las coordenadas: ");
      p2.imprimir();
    }
  }
}