package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static List<Sales> miLista = new ArrayList<Sales>();
    static double dato;

    public static void main(String[] args) {

        int tamanno = 20;
        Sales sales;

        for (int i = 0; i < tamanno; i++) {
            int m = NoRandomInt(0, 13);
            sales = new Sales(SWITCH(m), m, NoRandomDouble(0, 1001));//Se crea una nueva venta
            miLista.add(sales);//Se agrega la venta
        }
        System.out.println(miLista.size());
        System.out.println("----------Lista desordenada----------");
        for (Sales sales1 : miLista) {
            System.out.println(sales1);
        }
//        System.out.println(miLista.get(0).getDia());
        System.out.println("----------Lista ordenada----------");
        InsercionPorValor();
        for (Sales sales1 : miLista) {
            System.out.println(sales1);
        }

        System.out.print("\nIntroduce el valor que deseas buscar(double): ");

        dato = sc.nextDouble();

        int resp = binarySearch(0, tamanno);

        if (resp != -1) {
            System.out.println("El valor si se encuentra.");
            System.out.println(miLista.get(resp));
        } else {
            System.out.println("El valor no se encuentra.");
        }
    }

    //  Busqueda binaria
    public static int binarySearch(int L, int R) {
        if (R >= L) {
            int M = L + (R - L) / 2;
            if (miLista.get(M).getValor() == dato) {
                return M;
            }
            if (miLista.get(M).getValor() > dato) {
                return binarySearch(L, --M);
            }
            return binarySearch(++M, R);
        }
        return -1;
    }

    //  Ordena por valor
    public static void InsercionPorValor() {
        int pos;
        Sales temp = new Sales();
        for (int i = 0; i < miLista.size(); i++) {
            pos = i;
            temp = new Sales(miLista.get(i).getDia(), miLista.get(i).getMes(), miLista.get(i).getValor());
            while ((pos > 0) && (miLista.get(pos - 1).getValor() > temp.getValor())) {
                miLista.set(pos, miLista.get(pos - 1));
                pos--;
            }
            miLista.set(pos, temp);
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
