package Inmuebles;
public class InmuebleVivienda extends Inmueble {
protected int númeroHabitaciones;
protected int númeroBaños;
public InmuebleVivienda(int identificadorInmobiliario, int área, String
dirección, int númeroHabitaciones, int númeroBaños) {
super(identificadorInmobiliario, área, dirección); /* Invoca al
constructor de la clase padre */
this.númeroHabitaciones = númeroHabitaciones;
this.númeroBaños = númeroBaños;
}

@Override
void imprimir() {
super.imprimir(); 
System.out.println("Número de habitaciones = " +
númeroHabitaciones);
System.out.println("Número de baños = " + númeroBaños);
}
}