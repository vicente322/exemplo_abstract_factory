package Programacao_Software_Aplicado.Apresentacao_Padroes_Projeto;


public class RoundedShapeFactory implements AbstractFactory {
      public RoundedShapeFactory() {}

      @Override
      public Shape getShape(String shapeType) {
            if (shapeType.equals("Square")) {
                  return new RoundedSquare();
            }
            else if (shapeType.equals("Rectangle")) {
                  return new RoundedRectangle();
            }
            else {
                  return null;
            }
      }
}