import java.util.Scanner;

public class TiposPrimitivos {

        public static void main(String[] args) {

            float nota = 4.5f;
            System.out.println("minha nota: " + nota);

            System.out.printf("sua nota é %.2f", nota); // essa eh uma impressao formata

            System.out.printf("\n minha nota ê %f. Agora pulei linha \n", nota);

            //Dispositivo de entrada
            Scanner entrada = new Scanner(System.in);// passo o que ele vai escanear, System.out eh a saida, ent coloco que eel vai monitorar a entrada: System.in
            System.out.println("Digite um nome");
            String nome = entrada.nextLine();

            //Deixando um valor int ser passado para um tipo String
            int num = 34;
            String valor = Integer.toString(num); // agora o valor do int pode ser passado a String
        }
}
