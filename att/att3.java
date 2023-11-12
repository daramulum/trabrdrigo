package att;

import javax.swing.JOptionPane;

public class att3 {
	public static void main(String[] args) {
        // Vetor A
        int[] vetor_A = {5, 7, 2, 9, 4, 1, 8, 6, 3, 10};

        // Variável para armazenar a soma
        int soma = 0;

        // Loop para somar os elementos do vetor A
        for (int i = 0; i < vetor_A.length; i++) {
            soma += vetor_A[i];
        }

        // Imprimir a soma de todos os elementos do vetor A
       
        JOptionPane.showMessageDialog(null, "A soma de todos os elementos do vetor A é: " + soma);
}
}

