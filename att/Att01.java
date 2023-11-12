package att;
import javax.swing.JOptionPane;

public class Att01
	{
	    public static void main(String[] args) {
	        // Vetor A
	        int[] vetor_A = {5, 7, 2, 9, 4, 1, 8, 6, 3, 10};

	        // Vetor B
	        int[] vetor_B = new int[vetor_A.length];

	        // Preencher o vetor B
	        for (int i = 0; i < vetor_A.length; i++) {
	            vetor_B[i] = vetor_A[i] * i;
	        }

	        // Imprimir vetores
	        String vetorA = "";
	        String vetorB = "";
	        for (int i = 0; i < vetor_A.length; i++) {
	            vetorA += vetor_A[i] + " ";
	            vetorB += vetor_B[i] + " ";
	        }
	        JOptionPane.showMessageDialog(null, "Vetor A: " + vetorA + "\nVetor B: " + vetorB);
	    }
	}

