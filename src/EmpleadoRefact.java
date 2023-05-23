import java.time.LocalDate;

public class EmpleadoRefact {
    public enum EmpleadoTipo { TRABAJADOR, SUPERVISOR, MANAGER }

    private static final float RMU = 386;
    private static final float BONUS_SUPERVISOR = 0.35F;
    private static final float BONUS_MANAGER = 0.7F;

    private float salario;
    private float porcentajeBonus;
    private EmpleadoTipo empleadoTipo;

    public EmpleadoRefact (float salario, float porcentajeBonus, EmpleadoTipo empleadoTipo) {
        this.salario = salario;
        this.porcentajeBonus = porcentajeBonus;
        this.empleadoTipo = empleadoTipo;
    }

    public float calcularSalario() {
        LocalDate localDate = LocalDate.now();
        int month = localDate.getMonthValue();

        switch (empleadoTipo) {
            case TRABAJADOR:
                return calcularSalarioTrabajador(month);
            case SUPERVISOR:
                return calcularSalarioSupervisor(month);
            case MANAGER:
                return calcularSalarioManager(month);
        }

        return 0.0F;
    }

    private float calcularSalarioTrabajador(int month) {
        if (month % 2 == 0) {
            return salario;
        } else {
            return salario + calcularDecimo();
        }
    }

    private float calcularSalarioSupervisor(int month) {
        float valorS = salario + (porcentajeBonus * BONUS_SUPERVISOR);
        if (month % 2 == 0) {
            return valorS;
        } else {
            return valorS + calcularDecimo();
        }
    }

    private float calcularSalarioManager(int month) {
        float valorM = salario + (porcentajeBonus * BONUS_MANAGER);
        if (month % 2 == 0) {
            return valorM;
        } else {
            return valorM + calcularDecimo();
        }
    }

    private float calcularDecimo() {
        return RMU / 6;
    }

    public float calcularBonoAnual() {
        switch (empleadoTipo) {
            case TRABAJADOR:
                return RMU;
            case SUPERVISOR:
                return salario + (RMU * 0.5F);
            case MANAGER:
                return salario + RMU;
        }

        return 0.0F;
    }
}
