public class FabricaEnemigoJefe extends FabricaEnemigos {
    @Override
    Enemigo crearEnemigo() {
        return new EnemigoNormal();
    }
}
