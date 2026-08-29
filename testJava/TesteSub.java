public class TesteSub {

    public static void main(String[] args) {

        double resultado = Calculadora.subtracao(10, 5);

        if (resultado != 5) {
            throw new AssertionError(
                "Teste de subtração falhou. Esperado: 5 | Obtido: " + resultado
            );
        }

        System.out.println("Teste de subtração realizado com sucesso!");
    }
}