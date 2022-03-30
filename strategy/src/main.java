import factory.VolksFactory;
import strategy.OpcionalEnum;
import factory.Volks;

import java.util.Scanner;

public class main {

    public static void main(String args[]){

        System.out.println("Ola qual volks vc deseja ?");
        Scanner sc = new Scanner(System.in);
        OpcionalEnum opcao = OpcionalEnum.valueOf(sc.nextLine().toUpperCase());

        VolksFactory volksFactory = new VolksFactory();
        Volks vlk = volksFactory.getModelVolks(opcao);

        System.out.println(vlk);
    }

}
