   //vamos fazer calculos com o numero inserido usando a classe math

    public class CalculadoraComMath {
        public static void main(String[] args) {

            int numero = 30;
            System.out.println("Numero usado para fazer as contas: " + numero);

            //resto da divisao
            int restoDivisao = numero % 2;
            System.out.println( "resto da divisao por 2" + restoDivisao);

            //elevado ao cubo (numero multiplicado por ele mesmo 3 vezes)
            double elevadoAoCubo = Math.pow(numero,3);
            System.out.println( "numero elevado ao cubo " + elevadoAoCubo);

            //raiz quadrada
            int raizQuadrada = (int) Math.sqrt(numero); //exemplo de casting explicito, o valor retornado seria double, mas a variavel é int, ent precisa converter os valores.
            System.out.println("raiz quadrada " + raizQuadrada);

            //raiz cubica
            int raizCubica = (int) Math.cbrt(numero);
            System.out.println("raiz cubica " + raizCubica);

            //divisao normal
            int divisaoNormal = numero / 2;
            System.out.println("divisao normal " + divisaoNormal);
        }
}
