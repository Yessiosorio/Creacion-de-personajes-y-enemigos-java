public class Main {
    public static void main(String[] args) {

        FabricaPersonajes FabricaGuerrero = new FabricaGuerrero();
        Personaje JugadorGuerrero = FabricaGuerrero.crearPersonajes();

        FabricaEnemigos FabricaEnemigoNormal = new FabricaEnemigoNormal();
        Enemigo EnemigoNormal = FabricaEnemigoNormal.crearEnemigo();
        JugadorGuerrero.atacar();
        EnemigoNormal.recibirDaño();

    }
}