import java.util.Scanner;

public class Contador {
    
    public static void main(String[] args) {
        
        Scanner Terminal = new Scanner(System.in);

       

        boolean AteTudoOk = true;
        while (AteTudoOk) {

            int parametroUm = Terminal.nextInt();
            int parametroDois = Terminal.nextInt();

            try {
            
                for (int i = parametroUm; i < contar(parametroUm,parametroDois); i++) {
                    System.out.println("Imprimindo "+ i);
                }
                AteTudoOk = false;

            } catch (ParametrosInvalidosException e) {
                System.out.println("Voce nao uso os padroes \nPrimeiro Numero deve Ser o Menor numero E o Segundo o Maior \nTente Novamente Por Gentileza ! ");
               
               
            }
            
        }

    }

  
    static int  contar(int parametroUm , int parametroDois) throws ParametrosInvalidosException{
        int seraParametro = 0;
        if (parametroUm < parametroDois) {
            seraParametro  = parametroDois + 1 ;
            
        }else{
            throw new ParametrosInvalidosException();
        }
        return seraParametro;
      
       
    }
}
