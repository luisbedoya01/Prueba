import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class RelojDigital extends JFrame {

    private JLabel horaLabel;
    private JLabel fechaLabel;

    public RelojDigital(){
        setTitle("Reloj Digital");
        setSize(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        //Crear un panel para guardar los labels de fecha y hora
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        panel.setLayout(new BorderLayout());

        Color color = new Color(6, 252, 22);

        //Crear un label para mostrar la hora
        horaLabel = new JLabel();
        horaLabel.setFont(new Font("DS-Digital",Font.PLAIN,60));
        horaLabel.setHorizontalAlignment(SwingConstants.CENTER);
        horaLabel.setVerticalAlignment(SwingConstants.CENTER);
        horaLabel.setForeground(color);

        //Crear un label para mostrar la fecha
        fechaLabel = new JLabel();
        fechaLabel.setFont(new Font("DS-Digital",Font.PLAIN,20));
        fechaLabel.setHorizontalAlignment(SwingConstants.CENTER);
        fechaLabel.setVerticalAlignment(SwingConstants.CENTER);
        fechaLabel.setForeground(color);

        panel.add(fechaLabel,BorderLayout.CENTER);
        panel.add(horaLabel,BorderLayout.SOUTH);


        //Establecer el color de fondo del panel
        panel.setBackground(Color.black);

        //Agregar el panel al frame
        add(panel);

        /*Uso de un Timer para actualizar los labels de hora y fecha
        cada segundo*/
        Timer tiempo = new Timer(1000, e -> actualizarHoraYFecha());
        tiempo.start();
    }

    private void actualizarHoraYFecha(){
        //Obtener la hora actual y darle formato
        Calendar calendario = Calendar.getInstance();
        SimpleDateFormat formatearHora = new SimpleDateFormat("HH:mm:ss");
        String hora = formatearHora.format(calendario.getTime());

        //Obtener la fecha actual y darle formato
        SimpleDateFormat formatearFecha = new SimpleDateFormat("EEEE, dd 'de' MMMM 'del' yyy");
        String fecha = formatearFecha.format(calendario.getTime());

        //Actualizar los label de fecha y hora
        horaLabel.setText(hora);
        fechaLabel.setText(fecha);
    }

    public static void main(String[] args) {
        RelojDigital reloj = new RelojDigital();
        reloj.setVisible(true);
    }
}
