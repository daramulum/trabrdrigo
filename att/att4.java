package att;
import javax.swing.JOptionPane;

public class att4 
{
	
	 public static void main(String[] args) {
	        int[] vetor_A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        int pares = 0;
	        int impares = 0;

	        for (int i = 0; i < vetor_A.length; i++) {
	            if (vetor_A[i] % 2 == 0) {
	                pares++;
	            } else {
	                impares++;
	            }
	        }

	        float porcentagemPares = (pares * 100) / vetor_A.length;
	        float porcentagemImpares = (impares * 100) / vetor_A.length;

	     
	        
	        JOptionPane.showMessageDialog(null, "Porcentagem de pares: " + porcentagemPares + "%" +
	                                            "\nPorcentagem de ímpares: " + porcentagemImpares + "%");
	    }

}




   

