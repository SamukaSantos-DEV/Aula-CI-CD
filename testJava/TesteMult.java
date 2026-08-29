public class TesteMult {

    public static void main(String[] args) {

        double resultado = Calculadora.multiplicacao(10, 5);

        if (resultado != 50) {
            throw new AssertionError(
                "Teste de multiplicação falhou. Esperado: 50 | Obtido: " + resultado
            );
        }

        System.out.println("Teste de multiplicação realizado com sucesso!");
    }
}