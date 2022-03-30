package facade;

public class MaquinaLavar {

    private Lavar lavar;
    private Enxaguar enxaguar;
    private Centrifigar centrifugar;
    private Secar secar;

    public MaquinaLavar(Lavar lavar, Enxaguar enxaguar, Centrifigar centrifigar, Secar secar) {
        this.lavar = lavar;
        this.enxaguar = enxaguar;
        this.centrifugar = centrifigar;
        this.secar = secar;
    }

    public void ligarMaquina(){
        lavar.lavar();
        enxaguar.enxaguar();
        centrifugar.centrifugar();
        secar.secar();
    }
}
