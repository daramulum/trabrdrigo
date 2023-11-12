package att;
import javax.swing.JOptionPane;

public class att5
{
	
	 public static void main(String[] args) {
	        double[] Nota1 = new double[10];
	        double[] Nota2 = new double[10];
	        double[] Result = new double[10];
	        String[] Situacao = new String[10];

	        for (int i = 0; i < 10; i++) {
	            Nota1[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1 do aluno " + (i + 1)));
	            Nota2[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2 do aluno " + (i + 1)));

	            Result[i] = (Nota1[i] + Nota2[i]) / 2;

	            if (Result[i] >= 7) {
	                Situacao[i] = "Aprovado";
	            } else {
	                Situacao[i] = "Reprovado";
	            }
	        }

	        JOptionPane.showMessageDialog(null, "Resultado:");

	        for (int i = 0; i < 10; i++) {
	            JOptionPane.showMessageDialog(null, "Aluno " + (i + 1) + " - Nota 1: " + Nota1[i] + " - Nota 2: " + Nota2[i] + " - Média: " + Result[i] + " - Situação: " + Situacao[i]);
	        }
	    }
	}


