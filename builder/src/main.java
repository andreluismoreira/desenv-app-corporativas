import entities.Atendente;
import entities.Funcionario;
import entities.Pedido;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        Atendente atendente = new Atendente(new Funcionario());

        System.out.println("Bem vindo ao portal de opcionais do seu carro: ");
        System.out.println("Qual opção de bancos [Couro,Tecido]: ");
        String bancos = sc.nextLine();
        System.out.println("Qual a centralMultimidia [10',8']: ");
        String centralMultimidia = sc.nextLine();
        System.out.println("Qual opção de arCondicionado [Digital,Manual]: ");
        String arCondicionado = sc.nextLine();
        System.out.println("Qual opção de rodas [Ligaleve,Comum]: ");
        String rodas = sc.nextLine();
        System.out.println("Qual opção de pintura [Metalica,Perolizada]: ");
        String pintura = sc.nextLine();


        atendente.montarPedido(bancos,centralMultimidia,arCondicionado,rodas, pintura);

        Pedido pedido = atendente.getPedido();
        System.out.println("-----------------------------------------------");
        System.out.println(pedido.toString());
        }

}
