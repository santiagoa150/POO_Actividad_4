package Inmuebles;
public class Casa extends InmuebleVivienda {
protected int númeroPisos; 
public Casa(int identificadorInmobiliario, int área, String dirección,
int númeroHabitaciones, int númeroBaños, int númeroPisos) {
super(identificadorInmobiliario, área, dirección,
númeroHabitaciones, númeroBaños);
this.númeroPisos = númeroPisos;
}

@Override
void imprimir() {
super.imprimir(); 
System.out.println("Número de pisos = " + númeroPisos);
}
}