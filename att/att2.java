package att;
import javax.swing.JOptionPane;

public class att2 
	{
	public static void main(String[] args) {
        // Vetor A
        int[] vetor_A = {5, 7, 2, 9, 4, 1, 8, 6, 3, 10};

        // Vetor B
        int[] vetor_B = {10, 15, 20, 25, 30, 35, 40, 45, 50, 55};

        // Vetor C
        int[] vetor_C = new int[vetor_A.length];

        // Preencher o vetor C
        for (int i = 0; i < vetor_A.length; i++) {
            vetor_C[i] = vetor_A[i] + vetor_B[i];
        }

        // Imprimir vetores
        String vetorA = "";
        String vetorB = "";
        String vetorC = "";
        for (int i = 0; i < vetor_A.length; i++) {
            vetorA += vetor_A[i] + " ";
            vetorB += vetor_B[i] + " ";
            vetorC += vetor_C[i] + " ";
        }
        JOptionPane.showMessageDialog(null, "Vetor A: " + vetorA + "\nVetor B: " + vetorB + "\nVetor C: " + vetorC);
    }
}



