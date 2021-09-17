package suscripciones;

public class ClasePadre {
    // Atributos Clase Padre
    private int codigo;
    private String estado;
    private int periodicidad;
    private int valorPeriodico;
    
    // Constructor
    
    public ClasePadre(int codigo, String estado, int periodicidad, int valorPeriodico) {
        this.codigo = codigo;
        this.estado = estado;
        this.periodicidad = periodicidad;
        this.valorPeriodico= valorPeriodico;
        
    }
    
    // Getters and Setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPeriocidad() {
        return periodicidad;
    }

    public void setPeriocidad(int periocidad) {
        this.periodicidad = periodicidad;
    }

    public int getValorPeriodico() {
        return valorPeriodico;
    }

    public void setValorPeriodico(int valorPeriodico) {
        this.valorPeriodico = valorPeriodico;
    }

      

}
