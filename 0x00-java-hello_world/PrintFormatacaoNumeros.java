public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        System.out.printf("Valor: R$ %,1.2f", valor);
        System.out.printf("\nTaxa: %.2f", taxa, "%");
    }
}
