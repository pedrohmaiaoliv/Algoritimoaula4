public class App {
    public static void main(String[] args) throws Exception {

        System.out.print("Digite o valor do raio: ");
            int raio = 2;

        System.out.println(raio);
            
            final double pi = 3.14;
            double area = 3.14 * raio * raio;

        System.out.printf("area = %f", area);
    }
}
// na declaração de variável voce pode ter 2 tipos: variável e constante, quando ela é constante voce digita na frente dela, o tipo "final"