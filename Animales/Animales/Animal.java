package Animales;

abstract class Animal {
    protected String sonidos;
    protected String alimentos;
    protected String hábitat;
    protected String nombreCientífico;

    public Animal(String sonidos, String alimentos, String hábitat, String nombreCientífico) {
        this.sonidos = sonidos;
        this.alimentos = alimentos;
        this.hábitat = hábitat;
        this.nombreCientífico = nombreCientífico;
    }

    public abstract String getNombreCientífico();

    public abstract String getSonido();

    public abstract String getAlimentos();

    public abstract String getHábitat();
}
