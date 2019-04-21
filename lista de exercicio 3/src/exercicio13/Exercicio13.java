package exercicio13;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Exercicio13 a = new Exercicio13();
        a.rotas();
    }

    private static final int[][] ROTAS = {
        {-1, 63, 210, 190, 0, 190},
        {63, -1, 160, 150, 95, 0},
        {210, 160, -1, 10, 0, 0},
        {190, 150, 10, -1, 0, 0},
        {0, 95, 0, 0, -1, 80},
        {190, 0, 0, 0, 80, -1}};
    private final String[] CIDADES = {"Cáceres", "BBurgres", "Cuiabá", "VGrande", "Tangará", "PLacerda"};

    public void rotas() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero da cidade atual");
        int cidadeO = scan.nextInt() - 1;
        System.out.println("Digite o numero da cidade Destino");
        int cidadeD = scan.nextInt() - 1;

        if (ROTAS[cidadeO][cidadeD] > 0) {
            System.out.println("A distância entre a cidades de " + CIDADES[cidadeO] + " e " + CIDADES[cidadeD] + " é: " + ROTAS[cidadeO][cidadeD]);
        } else if (ROTAS[cidadeO][cidadeD] == 0) {
            rotaAlternativa(cidadeO, cidadeD);
        } else if (cidadeD == cidadeO) {
            System.out.println("Não é possivel calcular a rota para a mesma cidade");
        }
    }

    public void rotaAlternativa(int cidadeD, int cidadeO) {
        for (int i = 0; i < 6; i++) {
            if (ROTAS[cidadeD][i] > 0) {
                if (ROTAS[i][cidadeO] > 0) {
                    int rotaAlternativa = ROTAS[cidadeD][i] + ROTAS[i][cidadeO];
                    System.out.println("Tivemos que faver uma rota alternativa, a distância entre a cidades de " +
                    CIDADES[cidadeO] + " e " + CIDADES[cidadeD] + " é: " + rotaAlternativa);
                    break;
                }
            }
        }
    }
}