import java.util.Scanner;

public class Cafetera {
    private int capMax;
    private int cantdActual;

    public Cafetera(int capMax, int cantdActual) {
        this.capMax = capMax;
        this.cantdActual = cantdActual;
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public int getCantdActual() {
        return cantdActual;
    }

    public void setCantdActual(int cantdActual) {
        this.cantdActual = cantdActual;
    }

    public static void cafeteraVacia(int capMax, int cantdActual) {
        capMax = 1000;
        cantdActual = 0;
        return;
    }

    public static void agregarCafe(int cantdActual) {
        Scanner sc = new Scanner(System.in);
        cantdActual = sc.nextInt();
    }

    public static void servirTaza() {

    }

    public static int vaciarCafetera(int cantdActual) {
        cantdActual = 0;
        return cantdActual;
    }

    public static void imprimir(int cantdActual, int capMax) {

    }

    @Override
    public String toString() {
        return "Cafetera{" +
                "capMax=" + capMax +
                ", cantdActual=" + cantdActual +
                '}';
    }
}
