public class EnemigoNormal implements Enemigo{
    @Override
    public void atacar() {
        System.out.println("El enemigo normal ataca al jugador");

    }

    @Override
    public void recibirDaño() {
        System.out.println("El enemigo normal recibe daño");

    }
}
