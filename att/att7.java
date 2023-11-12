package att;
import javax.swing.JOptionPane;


public class att7 {


	
	    public static void main(String[] args) {
	        int[] vetor = new int[10];

	        for (int i = 0; i < 10; i++) {
	            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor:"));
	        }

	        ordenar(vetor);

	        String saida = "Elementos ordenados: \n";

	        for (int i = 0; i < 10; i++) {
	            saida += vetor[i] + " ";
	        }

	        JOptionPane.showMessageDialog(null, saida);
	    }

	    public static void ordenar(int[] vetor) {
	        for (int i = 0; i < vetor.length; i++) {
	            for (int j = i + 1; j < vetor.length; j++) {
	                if (vetor[i] > vetor[j]) {
	                    int aux = vetor[i];
	                    vetor[i] = vetor[j];
	                    vetor[j] = aux;
	                }
	            }
	        
	        }
	    }
}

	




