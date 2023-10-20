package provarecuperacaoprogamacao;

import javax.swing.JOptionPane;

public class Q3 {
    public static void main(String[] args) {
        String s = "";
        int numb = 0;
        
        try{           
            s = JOptionPane.showInputDialog(null,"Digite um numero inteiro: ");
            numb = Integer.parseInt(s);         
        }catch(Exception error){
            System.out.println("Erro de : "+error);
        }
       JOptionPane.showMessageDialog(null, "Numero antecessor :"+(numb - 1));
       JOptionPane.showMessageDialog(null, "Numero sucessor :"+(numb + 1));       
    }
}
