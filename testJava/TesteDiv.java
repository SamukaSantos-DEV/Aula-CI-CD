public class TesteDiv {

    public static void main(String[] args) {

        double resultado = Calculadora.divisao(10, 5);

        if (resultado != 2) {
            throw new AssertionError(
                "Teste de divisão falhou. Esperado: 2 | Obtido: " + resultado
            );
        }

        System.out.println("Teste de divisão realizado com sucesso!");
    }
}