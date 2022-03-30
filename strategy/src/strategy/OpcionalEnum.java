package strategy;

import factory.Volks;
import factory.VolksJetta;
import factory.VolksPolo;
import factory.VolksUp;
import strategy.Opcionais;

public enum OpcionalEnum implements Opcionais {

    UP {
        @Override
        public Volks createVolks() {
        return new VolksUp();
    }},
    JETTA {
        @Override
        public Volks createVolks() {
        return new VolksJetta();
    }},
    POLO {
        @Override
        public Volks createVolks() {
        return new VolksPolo();
    }};
}
