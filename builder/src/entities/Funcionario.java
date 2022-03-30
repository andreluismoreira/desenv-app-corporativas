package entities;

public class Funcionario {

    private Pedido pedido;

    public Funcionario() {
        pedido = new Pedido();
    }

    public void buildBancos(String bancos) {
        pedido.adicionarParteInterna(bancos);
    }

    public void buildSom(String centralMultimidia) {
        pedido.adicionarParteInterna(centralMultimidia);
    }

    public void buildAr(String arCondicionado) {
        pedido.adicionarParteInterna(arCondicionado);
    }

    public void buildRodas(String rodas) {
        pedido.adicionarParteExterna(rodas);
    }

    public void buildPintura(String pintura) {
        pedido.adicionarParteExterna(pintura);
    }

    public Pedido getPedido() {
        return pedido;
    }
}
