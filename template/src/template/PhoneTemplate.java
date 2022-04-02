package template;

public abstract class PhoneTemplate {

    public abstract void buildConexao5G();
    public abstract void buildPreco();
    public abstract void buildModelo();
    public abstract void buildMarca();

    public final void buildCelular(){
        System.out.println("Seu smartphone foi construido...");
        buildConexao5G();
        buildPreco();
        buildModelo();
        buildMarca();
    }

}
