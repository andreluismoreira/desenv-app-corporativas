package template;

public class Apple extends PhoneTemplate {
    @Override
    public void buildConexao5G() {
        System.out.println("Compativel com conexões 5G");
    }

    @Override
    public void buildPreco() {
        System.out.println("Aparelho por apenas: 10.000");
    }

    @Override
    public void buildModelo() {
        System.out.println("Aparelho Iphone 13 x pro");
    }

    @Override
    public void buildMarca() {
        System.out.println("Aparelho da marca Apple");
    }
}
