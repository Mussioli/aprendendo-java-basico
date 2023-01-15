public class operadores {
    public static void main(String[] args) {
    String nomeUm = "GABRIEL";
    String nomeDois = new String("GABRIEL");

    System.out.println(nomeUm.equals (nomeDois ));


    int numero1 = 1;
    int numero2 = 2;

    boolean simNao = numero1 == numero2;    
    if (numero1 == numero2){//true
    System.out.println(" a nossa condição é verdadeira");
    }

    System.out.println("numeroUm é igual numedoDois?" + simNao);

    simNao = numero1 != numero2;

    System.out.println("numeroUm é diferente a numeroDois?" + simNao);

    simNao = numero1 > numero2; 

    System.out.println("numeroUm é maior que numeroDois?"  + simNao ); 

    }
}