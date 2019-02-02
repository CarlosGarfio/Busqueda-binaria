package app;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {

        List<Sales> miLista = new ArrayList<Sales>();
        Sales sales;
        
        for (int i = 0; i < 100; i++) {
            int m = NoRandomInt(0, 13);
            sales= new Sales(m,SWITCH(m), NoRandomDouble(0, 1001));//Se crea una nueva venta
            miLista.add(sales);//Se agrega la venta
        }
        for (Sales sales1 : miLista) {
            System.out.println(sales1);
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
                return NoRandomInt(0, 32);
            case 4:
            case 6:
            case 9:
            case 11:
                return NoRandomInt(0, 31);
            case 2:
                return NoRandomInt(0, 29);
            default:
                return -1;
        }
    }
}
