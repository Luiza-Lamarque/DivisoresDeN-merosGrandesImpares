import java.util.Scanner;

//Autores:Felipe Klatte e Luiza Lamarque
public class Main {
    public static void main(String[] args){
        int count=0;
        long aux1=0,aux2=0;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Digite o numero a ser testado:\n");
        long numeroParaTestar=teclado.nextLong();
        long tempoInicial = System.currentTimeMillis();
       for(long i=2;i<=numeroParaTestar; i++){
           if(numeroParaTestar % i == 0){
               count++;
               if(aux1==0){
                   aux1=numeroParaTestar/i;
               }else if(aux2==0){
                   aux2=numeroParaTestar/i;
                   break;
               }
           }
       }
       if(count==1){
           System.out.println(numeroParaTestar+" e primo");
       }else{
           System.out.println(aux1+" e "+aux2+" sao divisores de "+numeroParaTestar);
       }
       long tempoPercorrido=System.currentTimeMillis() - tempoInicial;
        System.out.println("o metodo executou em " + tempoPercorrido);
    }
}

