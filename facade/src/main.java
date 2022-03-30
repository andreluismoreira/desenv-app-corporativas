import facade.*;

public class main {

    public static void main(String[] args) {

         Lavar lavar = new Lavar();
         Enxaguar enxaguar = new Enxaguar();
         Centrifigar centrifugar = new Centrifigar();
         Secar secar = new Secar();

        MaquinaLavar mq = new MaquinaLavar(lavar, enxaguar, centrifugar, secar);

        mq.ligarMaquina();

    }
}
