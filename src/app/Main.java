package app;

public class Main {

    public static void main(String[] args) {

        Sales dia = new Sales();

        for (int i = 0; i < 1_000; i++) {
            int m = NoRandomInt(1, 12);
            dia.setMes(m);
            dia.setDia(SWITCH(m));
            dia.setValor(NoRandomDouble(1, 1000));
            System.out.println(dia.toString());
        }
    }

    public static int NoRandomInt(int x, int y) {
        return (int) (Math.abs(Math.floor(Math.random() * (x - y + 1) + y)));
    }

    public static double NoRandomDouble(int x, int y) {
        return (double) (Math.abs(Math.floor(Math.random() * (x - y + 1) + y)));
    }

    public static int SWITCH(int mes) {
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return NoRandomInt(1, 31);
            case 4:
            case 6:
            case 9:
            case 11:
                return NoRandomInt(1, 30);
            case 2:
                return NoRandomInt(1, 28);
            default:
                return -1;
        }
    }
}
