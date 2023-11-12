import javax.swing.JOptionPane;
public class JogoDaVelha {
    static char[][] tabuleiro = new char[3][3];
    static int posicao = 1;
    static char jogadorAtual = 'X';

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = '-';
            }
        }

        while (true) {
            String posicaoStr = JOptionPane.showInputDialog("Jogador " + jogadorAtual + ", insira a posição (1-9):");
            posicao = Integer.parseInt(posicaoStr);
            if (posicao < 1 || posicao > 9 || !posicaoValida(posicao)) {
                JOptionPane.showMessageDialog(null, "Posição inválida. Tente novamente.");
                continue;
            }

            atualizarTabuleiro(posicao, jogadorAtual);
            imprimirTabuleiro();

            if (checarVitoria()) {
                JOptionPane.showMessageDialog(null, "O jogador " + jogadorAtual + " venceu!");
                break;
            } else if (checarEmpate()) {
                JOptionPane.showMessageDialog(null, "Empate!");
                break;
            }

            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
        }
    }

    static boolean posicaoValida(int posicao) {
        int linha = (posicao - 1) / 3;
        int coluna = (posicao - 1) % 3;
        return tabuleiro[linha][coluna] == '-';
    }

    static void atualizarTabuleiro(int posicao, char jogador) {
        int linha = (posicao - 1) / 3;
        int coluna = (posicao - 1) % 3;
        tabuleiro[linha][coluna] = jogador;
    }

    static void imprimirTabuleiro() {
        StringBuilder tabuleiroStr = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiroStr.append(tabuleiro[i][j]).append(" ");
            }
            tabuleiroStr.append("\n");
        }
        JOptionPane.showMessageDialog(null, tabuleiroStr.toString());
    }

    static boolean checarVitoria() {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] != '-' && tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2]) {
                return true;
            }
            if (tabuleiro[0][i] != '-' && tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[1][i] == tabuleiro[2][i]) {
                return true;
            }
        }
        if (tabuleiro[0][0] != '-' && tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]) {
            return true;
        }
        if (tabuleiro[0][2] != '-' && tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0]) {
            return true;
        }
        return false;
    }

    static boolean checarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}