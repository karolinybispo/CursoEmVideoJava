
    public class ComparacaoString {
        public static void main(String[] args) {
            //String é uma classe, logo ao criar um componente String nao será uma variavel, mas um objeto.
            String nome1 = "Gustavo";
            String nome2 = "Gustavo";
            String nome3 = new String("Gustavo");
            String res;
            String res2;
            String res3;

            res = (nome1 == nome2) ? "igual" : "diferente";
            System.out.println(res);

            res2 = (nome1 == nome3) ? "igual" : "diferente";
            System.out.println("verificando objeto com objeto instanciado: " + res2);

            //metodo equals verifica se o conteudo de um objeto eh igual ao conteudo de outro objeto
            res3 = (nome1.equals(nome3)) ? "igual" : "diferente";
            System.out.println("usando metodo equals: " + res3);

        }
    }
