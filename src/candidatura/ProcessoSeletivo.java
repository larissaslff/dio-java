package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        imprimirSelecionados();

    }

    static void selecaoCandidatos() {
        String[] candidatos = { "Ana", "Bruno", "Cátia", "Damião", "Erica", "Fernando", "Gabriel", "Hana", "Icaro",
                "Julia" };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println(String.format("O candidato %s solicitou R$ %.2f", candidato, salarioPretendido));

            if (salarioBase >= salarioPretendido) {
                candidatosSelecionados++;
                System.out.println(String.format("O candidato %s foi selecionado!", candidato));

            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "Ana", "Bruno", "Cátia", "Damião", "Erica" };
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println(String.format("Cadidato de nº %d é o %s", (i + 1), candidatos[i]));
        }

    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para candidato com contraproposta");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }

    }
}