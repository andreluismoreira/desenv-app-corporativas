package entities;

import java.util.HashSet;
import java.util.Set;

public class Pedido {

    private Set<String> ParteExterna = new HashSet<String>();
    private Set<String> ParteInterna = new HashSet<String>();

    public void adicionarParteInterna(String item) {
        ParteInterna.add(item);
    }

    public void adicionarParteExterna(String item) {
        ParteExterna.add(item);
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Seu pedido:\n");
        buffer.append("Personalizações internas:\n");

        for (String item : ParteInterna)
            buffer.append("\t" + item + "\n");
        buffer.append("Personalizações externas:\n");

        for (String item : ParteExterna)
            buffer.append("\t" + item + "\n");
        buffer.append("\nOtimas escolhas, Parabens!\n\n");

        return buffer.toString();
    }
}
