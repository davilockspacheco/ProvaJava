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

        StringBuilder resultado = new StringBuilder();           // Monta a string de resultado

        for (int i = 0; i < quantidade; i++) {                   // Exibe os dados com base na quantidade
            resultado.append("Médico: ").append(medicos[i]).append("\n");
            resultado.append("Especialidade: ").append(especialidades[i]).append("\n\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString()); // Exibe tudo
    }
}