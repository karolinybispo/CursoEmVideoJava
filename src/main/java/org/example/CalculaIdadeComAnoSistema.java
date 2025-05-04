import java.time.LocalDate;
import java.util.Scanner;

public class CalculaIdadeComAnoSistema {
        public static void main(String[] args) {

            int anoAtual = LocalDate.now().getYear();
            System.out.println(anoAtual);

            System.out.println("informa sua data de nascimento");
            Scanner entrada = new Scanner(System.in);
            int anoNascimento = entrada.nextInt();

            int suaIdade = anoAtual - anoNascimento;
            System.out.println("sua idade é: " + suaIdade);

        }
}
