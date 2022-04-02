import template.Apple;
import template.PhoneTemplate;
import template.Samsung;
import template.Xiaomi;

public class main {

    public static void main(String[] args) {

        PhoneTemplate samsung = new Samsung();
        PhoneTemplate apple = new Apple();
        PhoneTemplate xiaomi = new Xiaomi();

        samsung.buildCelular();
        System.out.println("----------------------------------");
        apple.buildCelular();
        System.out.println("----------------------------------");
        xiaomi.buildCelular();

    }
}
