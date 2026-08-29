public class TesteDiv {

    public static void main(String[] args) {

        double resultado = Calculadora.divisao(10, 5);

        if (resultado != 2) {
            throw new AssertionError(
                "Teste de divisão falhou. Esperado: 2 | Obtido: " + resultado
            );
        }

        try {
            Calculadora.divisao(10, 0);
            throw new AssertionError("Teste de divisão por zero falhou.");
        } catch (ArithmeticException e) {
            // Sucesso na captura da exceção de divisão por zero
        }

        System.out.println("Teste de divisão realizado com sucesso!");
    }
}