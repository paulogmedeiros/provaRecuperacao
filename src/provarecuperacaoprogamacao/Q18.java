package provarecuperacaoprogamacao;

import java.io.DataInputStream;
import java.io.IOException;


public class Q18 {
    public static void main(String[] args) throws IOException {
        DataInputStream dado;
        float valorHora = 0, salarioTotal = 0,impostoRenda = 0, INSS = 0, sindicato = 0,salarioLiquido;
        int horas = 0;
        String s = "";
        
        System.out.println("Digite quanto voce ganha por hora:");
        try{
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            valorHora = Float.parseFloat(s);
        }catch(Exception error){
            System.out.println("Erro de :"+error);   
        }
        
        System.out.println("Digite o numero de horas trabalhadas:");
        try{
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            horas = Integer.parseInt(s);
        }catch(Exception error){
            System.out.println("Erro de :"+error);   
        }
        salarioTotal = valorHora * horas;
        impostoRenda = salarioTotal * 11 / 100;
        INSS = salarioTotal * 8 / 100;
        sindicato = salarioTotal * 5 / 100;
        salarioLiquido = salarioTotal - (impostoRenda + INSS + sindicato);
        
        System.out.printf("Seu salario total do mês foi : %.2f\n",salarioTotal);
        System.out.printf("Desconto do Imposto de Renda :%.2f\n",impostoRenda);
        System.out.printf("Desconto do INSS : %.2f\n",INSS);
        System.out.printf("Desconto do Sindicato : %.2f\n",sindicato);
        System.out.printf("Seu salario liquido : %.2f\n",salarioLiquido);
    }
}
