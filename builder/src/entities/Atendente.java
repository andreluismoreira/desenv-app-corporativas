package entities;

public class Atendente {

    //diretor
    private Funcionario funcionario;

    public Atendente(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void montarPedido(String bancos, String centralMultimidia, String arCondicionado, String rodas,
                             String pintura) {
        funcionario.buildBancos(bancos);
        funcionario.buildSom(centralMultimidia);
        funcionario.buildAr(arCondicionado);
        funcionario.buildRodas(rodas);
        funcionario.buildPintura(pintura);
    }

    public Pedido getPedido() {
        return funcionario.getPedido();
    }
}
