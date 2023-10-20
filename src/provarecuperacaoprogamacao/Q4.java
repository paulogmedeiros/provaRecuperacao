package provarecuperacaoprogamacao;

import java.io.DataInputStream;

public class Q4 {
    public static void main(String[] args) {
        DataInputStream dado;
        String s = "";
        int cod = 0,senha = 0;
        try{
            System.out.println("Digite seu codigo de usuario: ");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            cod = Integer.parseInt(s);     
        }catch(Exception error){
            System.out.println("Erro de :"+ error);
        }
        if(cod == 1234 ){
            try{
                System.out.println("Digite sua senha: ");
                dado = new DataInputStream(System.in);
                s = dado.readLine();
                senha = Integer.parseInt(s);     
            }catch(Exception error){
                System.out.println("Erro de :"+ error);
            }
            if(senha == 9999){
                System.out.println("Acesso permitido");
            }else{
                System.out.println("Senha incorreta");
            }
        }else{
            System.out.println("Usuario invalido!");
        }
    }
}
