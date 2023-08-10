package Programacao_Software_Aplicado.Apresentacao_Padroes_Projeto;

public class ShapeFactory implements AbstractFactory{
      public ShapeFactory() {}

      @Override
      public Shape getShape(String shapeType) {
            if (shapeType.equals("Square")) {
                  return new Square();
            }
            else if (shapeType.equals("Rectangle")) {
                  return new Rectangle();
            }
            else {
                  return null;
            }
      }
}
