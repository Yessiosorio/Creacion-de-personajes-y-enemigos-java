public class FabricaGuerrero extends FabricaPersonajes{
    @Override
    Personaje crearPersonajes() {
        return new Jugador();
    }
}
