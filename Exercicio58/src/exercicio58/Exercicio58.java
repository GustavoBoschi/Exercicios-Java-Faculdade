package exercicio58;

public class Exercicio58 {

    public static void main(String[] args) {

        double anacelto = 1.50;
        double felisberto = 1.10;
        int i = 0;
        
      while (felisberto < anacelto){
          
          felisberto = felisberto + 0.03;
          anacelto = anacelto +0.02;
          i++;
      }
      
        System.out.printf("Demorará %d anos para que Felisberto passe Anacelto "
                + ", quando isso acontecer, Felisberto terá %.2f e Anacelto %.2f\n"
                + "", i, felisberto, anacelto);
        
    }

}
