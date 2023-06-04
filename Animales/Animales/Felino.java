package Animales;

class Felino extends Animal {
    public Felino(String sonidos, String alimentos, String hábitat, String nombreCientífico) {
        super(sonidos, alimentos, hábitat, nombreCientífico);
    }

    @Override
    public String getNombreCientífico() {
        return super.nombreCientífico;
    }

    @Override
    public String getSonido() {
        return super.sonidos;
    }

    @Override
    public String getAlimentos() {
        return super.alimentos;
    }

    @Override
    public String getHábitat() {
        return super.hábitat;
    }
}