package Programacao_Software_Aplicado.Apresentacao_Padroes_Projeto;

public class FactoryProducer {
      public static AbstractFactory getFactory(boolean rounded) {
            if (rounded) {
                  return new RoundedShapeFactory();
            }
            else {
                  return new ShapeFactory(); 
            }
      }
}
