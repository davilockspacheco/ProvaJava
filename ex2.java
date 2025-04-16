import javax.swing.JOptionPane;

public class ex2 {
    public static void main(String[] args) {
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos médicos deseja cadastrar?")); // Lê a quantidade

        String[] medicos = new String[quantidade];               // Array para nomes dos médicos
        String[] especialidades = new String[quantidade];        // Array para especialidades

        for (int i = 0; i < quantidade; i++) {                   // Laço baseado na quantidade
            String nomeMedico = JOptionPane.showInputDialog("Digite o nome do médico:");
            String especialidade = JOptionPane.showInputDialog("Digite a especialidade:");
            medicos[i] = nomeMedico;                             // Armazena nome no array
            especialidades[i] = especialidade;                   // Armazena especialidade no array
        }

        String resultado = "";                                   // String para armazenar o resultado

        for (int i = 0; i < quantidade; i++) {                   // Monta o texto com concatenação
            resultado += "Médico: " + medicos[i] + "\n";
            resultado += "Especialidade: " + especialidades[i] + "\n\n";
        }

        JOptionPane.showMessageDialog(null, resultado);          // Exibe tudo
    }
}