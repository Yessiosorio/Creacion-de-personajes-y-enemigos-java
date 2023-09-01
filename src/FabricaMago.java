public class FabricaMago extends FabricaPersonajes{
    @Override
    Personaje crearPersonajes() {
        return new Jugador();
    }
}
