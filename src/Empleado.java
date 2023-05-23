import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Empleado {
    public enum empleadoTipo {Trabajador,Supervisor, Manager}

    //Remuneracion mensual unificada
    private final float rmu = 386;

    private float salario;

    private float porcentajeBonus;

    private empleadoTipo empleadoTipo;

    public Empleado(float salario, float porcentajeBonus, empleadoTipo empleadoTipo) {
        this.salario = salario;
        this.porcentajeBonus = porcentajeBonus;
        this.empleadoTipo = empleadoTipo;
    }

    //Calcular el salario dependiendo del tipo de trabajador
    //y entrega el decimo correspondiente cada 2 meses
    public float cs() {
        Date date = new Date();
        //Obtiene la hora local
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        //Obtiene el mes en forma de entero
        int month = localDate.getMonthValue();
        switch (empleadoTipo) {
            case Trabajador:
                //Si el mes es impar entonces le entrega
                //el decimo junto a su salario
                return month % 2 == 0 ? salario : salario + rmu/12 *2 ;
            case Supervisor:
                float valorS = salario + (porcentajeBonus * 0.35F);
                //Si el mes es impar entonces le entrega
                //el decimo junto a su salario y un bono
                return month % 2 == 0 ? valorS : valorS + rmu/12*2;
            case Manager:
                float valorM = salario + (porcentajeBonus * 0.7F);
                //Si el mes es impar entonces le entrega
                //el decimo junto a su salario y un bono
                return month % 2 == 0 ? valorM: valorM + rmu/12*2;
        }
        return 0.0F;
    }

    public float calcularBonoAnual() {
        switch (empleadoTipo) {
            case Trabajador:
                return rmu;
            case Supervisor:
                return salario + rmu * 0.5F;
            case Manager:
                return salario + rmu * 1.0F;
        }
        return 0.0F;
    }

}
