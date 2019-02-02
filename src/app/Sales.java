package app;

public class Sales {
    
    private int dia;
    private int mes;
    private double valor;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Sales(int dia, int mes, double valor) {
        this.dia = dia;
        this.mes = mes;
        this.valor = valor;
    }
    
    public Sales(){
    
    }

    @Override
    public String toString() {
        return "Sales{" + "dia=" + dia + ", mes=" + mes + ", valor=" + valor + '}';
    }
}