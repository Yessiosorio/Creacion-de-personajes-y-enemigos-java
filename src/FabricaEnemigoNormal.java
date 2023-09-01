public class FabricaEnemigoNormal extends FabricaEnemigos{
    @Override
    Enemigo crearEnemigo() {
        return new EnemigoNormal();
    }
}
