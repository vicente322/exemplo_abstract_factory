package Programacao_Software_Aplicado.Apresentacao_Padroes_Projeto;

import java.util.Scanner;

public class AbstractFactoryDemo {
      public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            String response, type;
            boolean rounded;

            System.out.println("Square or Rectangle? (S or R)");
            response = sc.next();
            if (response.equalsIgnoreCase("S")){
                  type = "Square";
            } else if (response.equalsIgnoreCase("R")) {
                  type = "Rectangle";
            } else {
                  type = "";
            }

            System.out.println("Rounded? (Y or N)");
            response = sc.next();
            if (response.equalsIgnoreCase("Y")) {
                  rounded = true;
            } else {
                  rounded = false;
            }
            
            sc.close();

            AbstractFactory factory = FactoryProducer.getFactory(rounded);
            Shape shape = factory.getShape(type);

            System.out.println(shape.getNome());

      }
}
