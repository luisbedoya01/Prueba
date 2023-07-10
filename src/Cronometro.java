import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cronometro extends JFrame implements ActionListener {
    private  JLabel tiempoLabel;
    private JButton iniciarBoton, detenerBoton, reiniciarBoton;
    private Timer tiempo;
    private int tiempoTranscurrido;

    public Cronometro(){
        tiempoLabel = new JLabel("00:00:00",JLabel.CENTER);
        tiempoLabel.setFont(new Font("Arial",Font.PLAIN,50));
        tiempoLabel.setForeground(Color.red);

        iniciarBoton = new JButton("Iniciar");
        iniciarBoton.addActionListener(this);
        detenerBoton = new JButton("Detener");
        detenerBoton.addActionListener(this);
        reiniciarBoton = new JButton("Reiniciar");
        reiniciarBoton.addActionListener(this);

        JPanel panelBoton = new JPanel();
        panelBoton.setLayout(new GridLayout(1,3));
        panelBoton.add(iniciarBoton);
        panelBoton.add(detenerBoton);
        panelBoton.add(reiniciarBoton);

        Container contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout());
        contenedor.add(tiempoLabel,BorderLayout.CENTER);
        contenedor.add(panelBoton,BorderLayout.SOUTH);

        tiempo = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tiempoTranscurrido += 1000;
                actualizarTiempo();
            }
        });

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == iniciarBoton){
            tiempo.start();
        } else if (e.getSource() == detenerBoton){
            tiempo.stop();
        } else if (e.getSource() == reiniciarBoton){
            tiempo.stop();
            tiempoTranscurrido = 0;
            actualizarTiempo();
        }
    }

    private void actualizarTiempo(){
        int horas = tiempoTranscurrido / 3600000;
        int minutos = (tiempoTranscurrido % 3600000) / 60000;
        int segundos =  (tiempoTranscurrido % 60000) / 1000;
        String tiempo = String.format("%02d:%02d:%02d",horas,minutos,segundos);
        tiempoLabel.setText(tiempo);
    }

    public static void main(String[] args) {
        Cronometro crono = new Cronometro();
        crono.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        crono.setSize(300,250);
        crono.setVisible(true);
    }
}
