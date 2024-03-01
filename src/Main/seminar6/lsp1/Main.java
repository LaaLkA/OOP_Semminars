package Main.seminar6.lsp1;

import Main.seminar6.lsp1.shape.Rectangle;
import Main.seminar6.lsp1.shape.Square;
import Main.seminar6.lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
//        square.setSide(4);
        System.out.printf("In a shape area = %d, \n", square.getArea());
        ShapeView view = new ShapeView(new Rectangle(3, 4));
        view.showArea();
    }
}
