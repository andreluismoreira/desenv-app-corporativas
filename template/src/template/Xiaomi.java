package template;

public class Xiaomi extends PhoneTemplate {
    @Override
    public void buildConexao5G() {
        System.out.println("Apenas com conexão 4G");
    }

    @Override
    public void buildPreco() {
        System.out.println("Aparelho por apenas: 5.000");
    }

    @Override
    public void buildModelo() {
        System.out.println("Aparelho Xiaomi Mi 11 pro");
    }

    @Override
    public void buildMarca() {
        System.out.println("Aparelho da marca Xiaomi ");
    }
}
