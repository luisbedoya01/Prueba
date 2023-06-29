import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AhorcadoGame extends JFrame implements ActionListener {
    private String[] palabras = {"Ahorcado", "Java", "Swing", "Programacion", "OpenAI"};
    private String palabraAdivinar;
    private int intentosRestantes = 6;

    private StringBuilder palabraEscondida;

    private JLabel palabraEscondidaLabel;
    private JLabel intentosRestantesLabel;
    private JTextField adivinarTextField;
    private JButton adivinarButton;

    public AhorcadoGame() {
        setTitle("El Ahorcado");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        palabraEscondidaLabel = new JLabel();
        intentosRestantesLabel = new JLabel("Intentos restantes: " + intentosRestantes);
        adivinarTextField = new JTextField(10);
        adivinarButton = new JButton("Adivinar");

        adivinarButton.addActionListener(this);
        adivinarTextField.addActionListener(this);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new FlowLayout());
        panelPrincipal.add(palabraEscondidaLabel);
        panelPrincipal.add(intentosRestantesLabel);
        panelPrincipal.add(adivinarTextField);
        panelPrincipal.add(adivinarButton);

        getContentPane().add(panelPrincipal);
        iniciarJuego();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }

    private void iniciarJuego() {
        palabraAdivinar = palabras[(int) (Math.random() * palabras.length)];
        palabraEscondida = new StringBuilder();
        for (int i = 0; i < palabraAdivinar.length(); i++) {
            palabraEscondida.append("_");
        }
        palabraEscondidaLabel.setText(palabraEscondida.toString());
        intentosRestantes = 6;
        intentosRestantesLabel.setText("Intentos restantes: " + intentosRestantes);
    }

    private void actualizarPalabraEscondida(char adivinar) {
        boolean encontrado = false;
        for (int i=0; i < palabraAdivinar.length(); i++) {
            if (palabraAdivinar.charAt(i) == adivinar){
                palabraEscondida.setCharAt(i,adivinar);
                encontrado = true;
            }
        }
        palabraEscondidaLabel.setText(palabraEscondida.toString());
        if (!encontrado) {
            intentosRestantes--;
            intentosRestantesLabel.setText("Intentos restantes: " + intentosRestantes);
            if (intentosRestantes == 0) {
                finJuego("¡Has perdido! La palabra era: " + palabraAdivinar);
            } else if (palabraEscondida.toString().equals(palabraAdivinar)) {
                finJuego("¡Felicitaciones, has ganado!");
            }
        }
    }

    private void finJuego(String mensaje){
        adivinarTextField.setEnabled(false);
        adivinarButton.setEnabled(false);
        JOptionPane.showMessageDialog(this,mensaje,"Fin del juego",JOptionPane.INFORMATION_MESSAGE);
        iniciarJuego();
        adivinarTextField.setEnabled(true);
        adivinarButton.setEnabled(true);
        adivinarTextField.requestFocus();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == adivinarButton || e.getSource() == adivinarTextField) {
            String adivinarTexto = adivinarTextField.getText();
            if (adivinarTexto.length() > 0) {
                char adivinar = adivinarTexto.charAt(0);
                actualizarPalabraEscondida(adivinar);
                adivinarTextField.setText("");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AhorcadoGame::new);
    }


}
