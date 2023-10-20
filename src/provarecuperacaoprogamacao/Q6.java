package provarecuperacaoprogamacao;

import java.io.DataInputStream;

public class Q6 {
    public static void main(String[] args) {
        DataInputStream dado;
        String filme = "", tentativa = "";
        String dicas[] = new String [5];
        int aux = 0;
        
        System.out.println("Ola jogador 1");
        System.out.println("Digite o nome do filme:");
        try{
            dado = new DataInputStream(System.in);
            filme = dado.readLine();
        }catch(Exception error){
            System.out.println("Erro de :"+error);
        }
        for(int i = 0; i<5;i++){
            try{
                System.out.println("\nDigite a "+(i+1)+"° dica : ");
                dado = new DataInputStream(System.in);
                dicas[i] = dado.readLine();
            }catch(Exception error){
                System.out.println("Erro de :"+error);
            }
        }
       System.out.println("Ola jogador 2");
       while(aux < 5){
           System.out.println("Sua "+(aux+1)+"° pista é :");
           System.out.println(dicas[aux]);
           System.out.println("Qual o nome do filme :");
           try{
                dado = new DataInputStream(System.in);
                tentativa = dado.readLine();
            }catch(Exception error){
                System.out.println("Erro de :"+error);
            }
           if(tentativa.equals(filme)){
               System.out.println("Parabens !!!! Voce acertou");
               aux = 5;
           }else{
               System.out.println("Voce errou !!!"); 
               aux ++;
           }
       } 
       
        
    }
}
