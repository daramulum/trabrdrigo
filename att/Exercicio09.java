import java.util.Random;

import javax.swing.JOptionPane;

public class Exercicio09 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Random rand = new Random();
        int maiorNumero = Integer.MIN_VALUE;
        int linhaMaiorNumero = 0;
        int colunaMaiorNumero = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = rand.nextInt(10);
                if (matriz[i][j] > maiorNumero) {
                    maiorNumero = matriz[i][j];
                    linhaMaiorNumero = i;
                    colunaMaiorNumero = j;
                }
            }
        }

        StringBuilder matrizString = new StringBuilder("Matriz 4x4:\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizString.append(matriz[i][j]).append(" ");
            }
            matrizString.append("\n");
        }

        matrizString.append("Maior número: ").append(maiorNumero).append("\n");
        matrizString.append("Posição (linha, coluna): (").append(linhaMaiorNumero).append(", ").append(colunaMaiorNumero).append(")");

        JOptionPane.showMessageDialog(null, matrizString.toString());
    }
}