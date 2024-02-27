package Main.seminar5.lsp1.view;

import Main.seminar5.lsp1.shape.Rectangle;
import Main.seminar5.lsp1.shape.Shape;

public class ShapeView {
    private Shape shape;

    public ShapeView(Shape shape) {
        this.shape = shape;
    }

    public void showArea() {
        System.out.print("Area of shape equal: ");
        System.out.println(shape.getArea());
    }
}
