public class TesteSoma {

    public static void main(String[] args) {

        double resultado = Calculadora.soma(10, 5);

        if (resultado != 999) {
            throw new AssertionError(
                "Teste de soma falhou. Esperado: 15 | Obtido: " + resultado
            );
        }

        System.out.println("Teste de soma realizado com sucesso!");
    }
}