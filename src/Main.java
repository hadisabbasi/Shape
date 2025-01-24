import com.github.hadisabbasi.shape.Circle;
import com.github.hadisabbasi.shape.Rectangle;
import com.github.hadisabbasi.shape.Shape;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        try {
            System.out.println(shape.area());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Circle customCircle = new Circle();
        System.out.println(customCircle.getColor());
        System.out.println(customCircle.getRadius());
        customCircle.printInfo();

        Rectangle customRectangle = new Rectangle(4, 2, "blue", "one dimension");
        System.out.println(customRectangle.getColor());
        System.out.println(customRectangle.getDimension());
        System.out.println(customRectangle.area());
        customRectangle.printInfo();

    }
}