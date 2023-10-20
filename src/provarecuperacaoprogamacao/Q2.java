package provarecuperacaoprogamacao;

import java.io.DataInputStream;

public class Q2 {
    
    public static void main(String[] args) {
        DataInputStream dado;
        String s = "";
        int aux = 1, quantCafeExp = 0,quantCafeCap = 0,quantLeite = 0,quantTotal = 0,escolha = 0;
        float valorCafeExp = 0,valorCafeCap = 0,valorLeite = 0, valorTotal = 0;
        
        while(aux == 1){
            System.out.println("\n\n1 - cafe expresso -  R$ 0,75");
            System.out.println("2 - cafe capuccino - R$ 1,00");
            System.out.println("3 - leite com cafe - R$ 1,25");
            System.out.println("4 - totalizar vendas");
            
            try{
                System.out.println("Digite sua escolha: ");
                dado = new DataInputStream(System.in);
                s = dado.readLine();
                escolha = Integer.parseInt(s);
                
            }catch(Exception error){
                System.out.println("Erro de :"+ error);
            }
            
            switch (escolha) {
                case 1:
                    quantCafeExp += 1;
                    valorCafeExp += 0.75;
                    break;
                case 2:
                    quantCafeCap += 1;
                    valorCafeCap += 1;
                    break;
                case 3:
                    quantLeite += 1;
                    valorLeite += 1.25;
                    break;
                default:
                    aux = 0;
                    break;
            }
        }
        quantTotal = quantCafeExp + quantCafeCap + quantLeite;
        valorTotal = valorCafeExp + valorCafeCap + valorLeite;
        
        System.out.printf("\n\nForam vendidos %d cafe expresso, o valor total foi de : %f\n",quantCafeExp,valorCafeExp );
        System.out.printf("Foram vendidos %d cafe capuccino, o valor total foi de : %f\n",quantCafeCap,valorCafeCap );
        System.out.printf("Foram vendidos %d leite com cafe, o valor total foi de : %f\n",quantLeite,valorLeite );
        System.out.printf("O total de todos os cafes vendidos : %d , o valor total foi de : %f\n",quantTotal,valorTotal );
        
        
    }
}
