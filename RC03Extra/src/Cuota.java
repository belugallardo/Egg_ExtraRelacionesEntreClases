
import java.time.LocalDate;

public class Cuota {

    private int numCouta;

    private double montoTotalCuota;

    private boolean estaPaga;

    private LocalDate fechaVencimiento;

    private LocalDate fechaPago;

    public Cuota() {
    }

    public Cuota(int numCouta, double montoTotalCuota, boolean estaPaga, LocalDate fechaVencimiento, LocalDate fechaPago) {
        this.numCouta = numCouta;
        this.montoTotalCuota = montoTotalCuota;
        this.estaPaga = estaPaga;
        this.fechaVencimiento = fechaVencimiento;
        this.fechaPago = fechaPago;
    }

    public int getNumCouta() {
        return numCouta;
    }

    public void setNumCouta(int numCouta) {
        this.numCouta = numCouta;
    }

    public double getMontoTotalCuota() {
        return montoTotalCuota;
    }

    public void setMontoTotalCuota(double montoTotalCuota) {
        this.montoTotalCuota = montoTotalCuota;
    }

    public boolean isEstaPaga() {
        return estaPaga;
    }

    public void setEstaPaga(boolean estaPaga) {
        this.estaPaga = estaPaga;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }
    
}
