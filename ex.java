import javax.swing.JOptionPane;
public class ex {
    public static void main(String[] args) {
        String[] nome = new String[3];
        String[] salario = new String[3];
        String[] cargo = new String[3];

        for (int i = 0; i < 3; i++) {
            String nomeTemp = JOptionPane.showInputDialog("Digite o nome:");
            String salarioTemp = JOptionPane.showInputDialog("Digite o salário:");
            String cargoTemp = JOptionPane.showInputDialog("Digite o cargo:");
            nome[i] = nomeTemp;
            salario[i] = salarioTemp;
            cargo[i] = cargoTemp;
        }
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            resultado.append("Nome: ").append(nome[i]).append("\n");
            resultado.append("Salário: ").append(salario[i]).append("\n\n");
            resultado.append("Cargo: ").append(cargo[i]).append("\n\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}