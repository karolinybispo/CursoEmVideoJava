
    public class GeradorNumeros {
        public static void main(String[] args) {
            double aleatorio = Math.random();
            System.out.println(aleatorio);

            /*Macete para o intervalo de numeros aleatorios que eu quero:
            primeiro, o menor numero do intervalor + Math.random() * o intervalo
            Quero entre 2 e 90: 2 + Math.random() * (2 - 90)
            */

            double numero = Math.random();
            int numeroNoIntervalo = (int) (2 + numero * (90-2)); //quero o numero entre 2 e 90
            System.out.println(numeroNoIntervalo);
        }
}
