package Inmuebles;
public class CasaIndependiente extends CasaUrbana {
protected static double valorArea = 3000000;
public CasaIndependiente(int identificadorInmobiliario, int área,
String dirección, int númeroHabitaciones, int númeroBaños, int
númeroPisos) {
super(identificadorInmobiliario, área, dirección,
númeroHabitaciones, númeroBaños, númeroPisos);
}
@Override
void imprimir() {
super.imprimir(); // Invoca al método imprimir de la clase padre
System.out.println();
}
}