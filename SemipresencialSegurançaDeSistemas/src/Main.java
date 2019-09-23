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
       for(long i=numeroParaTestar-2;i>=1; i=i-2){
           if(numeroParaTestar % i == 0){
               count++;
               if(aux1==0){
                   aux1=i;
               }else if(aux2==0){
                   aux2=i;
               }else{
                   System.out.println(aux1+" e "+aux2+" sao divisores de "+numeroParaTestar);
                   break;
               }
           }
       }
       if(count<=1){
           System.out.println(numeroParaTestar+" e primo");
       }
       long tempoPercorrido=System.currentTimeMillis() - tempoInicial;
        System.out.println("o metodo executou em " + tempoPercorrido);
    }
}
