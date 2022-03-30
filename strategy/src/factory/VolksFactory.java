package factory;

import strategy.OpcionalEnum;

public class VolksFactory extends FactoryMethod {

   public VolksFactory() {}

   @Override
   public Volks getModelVolks(OpcionalEnum opcoes) {
       return opcoes.createVolks();
   }
}


