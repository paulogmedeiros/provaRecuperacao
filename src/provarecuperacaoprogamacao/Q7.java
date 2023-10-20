
package provarecuperacaoprogamacao;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Q7 {
    public static void main(String[] args) throws IOException {
        DataInputStream dado;
        String nome = "", s = "";
        float peso = 0;
        
        
        System.out.println("Digite seu nome:");
        try{
            dado = new DataInputStream(System.in);
            nome = dado.readLine();
        }catch(Exception error){
            System.out.println("Erro de :"+error);
        }
        
        System.out.println("Digite seu peso:");
        try{
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            peso = Float.parseFloat(s);
        }catch(Exception error){
            System.out.println("Erro de :"+error);
        }
        
        FileWriter arq = new FileWriter("C:\\Users\\pmedeiros\\Desktop\\Q7\\atletas.txt");
        PrintWriter gravar = new PrintWriter(arq);
        
        if(peso<65){
            gravar.printf("O lutador %s pesa %.2f e se enquadra na categoria Pena",nome,peso);
        }else if(peso>=65 && peso<72){
            gravar.printf("O lutador %s pesa %.2f e se enquadra na categoria Leve",nome,peso);
        }else if(peso>=72 && peso<79){
            gravar.printf("O lutador %s pesa %.2f e se enquadra na categoria Ligeiro",nome,peso);
        }else if(peso>=79 && peso<86){
            gravar.printf("O lutador %s pesa %.2f e se enquadra na categoria Meio médio",nome,peso);
        }else if(peso>=86 && peso<93){
            gravar.printf("O lutador %s pesa %.2f e se enquadra na categoria Médio",nome,peso);
        }else if(peso>=93 && peso<100){
            gravar.printf("O lutador %s pesa %.2f e se enquadra na categoria Meio pesado",nome,peso);
        }else{
            gravar.printf("O lutador %s pesa %.2f e se enquadra na categoria Pesado",nome,peso);
        }
        arq.close();
    }
}
