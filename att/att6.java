package att;
import javax.swing.JOptionPane;

public class att6 {
	
	    public static void main(String[] args) {
	        int[] A = new int[6];
	        int[] B = new int[6];

	
	        for (int i = 0; i < A.length; i++) {
	            A[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor de A:"));
	        }

	      
	        for (int i = 0; i < A.length; i++) {
	            if (A[i] % 2 == 0) {
	                B[i] = 1;
	            } else {
	                B[i] = 0;
	            }
	        }

	    
	        String resposta = "B: ";
	        for (int i = 0; i < B.length; i++) {
	            resposta += B[i] + " ";
	        }
	        JOptionPane.showMessageDialog(null, resposta);
	    }
	}
