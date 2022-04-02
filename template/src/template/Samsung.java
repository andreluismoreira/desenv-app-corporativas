package template;

public class Samsung extends PhoneTemplate {
    @Override
    public void buildConexao5G() {
        System.out.println("Compativel com conexões 5G");
    }

    @Override
    public void buildPreco() {
        System.out.println("Aparelho por apenas: 9.500");
    }

    @Override
    public void buildModelo() {
        System.out.println("Aparelho Galaxy Note s22");
    }

    @Override
    public void buildMarca() {
        System.out.println("Aparelho da marca Samsung");
    }
}
