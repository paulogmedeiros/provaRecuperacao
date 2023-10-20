package provarecuperacaoprogamacao;

import java.io.DataInputStream;

public class Q5 {
    public static void main(String[] args) {
        DataInputStream dado;
        String s = "";
        int aux = 0, numb = 0,quant = 0,soma = 0,media = 0;
        
        while(aux == 0){
            try{
                System.out.println("\n\nDigite um numero:");
                System.out.println("Se desejar encerra digite '0'");
                dado = new DataInputStream(System.in);
                s = dado.readLine();
                numb = Integer.parseInt(s);     
            }catch(Exception error){
                System.out.println("Erro de :"+ error);
            }
            if(numb == 0){
                aux = 1;
            }else{
                quant += 1;
                soma =+ numb;
            }
        }
        
        media = soma/quant;
        
        System.out.println("\n\nQuantidade dos valores digitados: "+quant);
        System.out.println("Soma de todos os valores: "+soma);
        System.out.println("Media total: "+media);
    }
  
}
