import java.util.LinkedList;
import java.util.List;

public class Test {

  public static void main(String[] args) throws InterruptedException {

    List<Shape> shapes = new LinkedList<Shape>();

    shapes.add(new Rectangle(10, 10, 100, 100));
    shapes.add(new Circle(250, 250, 30));
    shapes.add(new Polygon(new int[]{100, 150, 200}, new int[]{150, 200, 150}, 3));
  
    for (Shape s : shapes) {
      s.setDrawingService(new WrapMonitor());
    }
  
    for (Shape s : shapes) {
      s.draw();
    }

    Thread.sleep(2000);

    for (Shape s : shapes) {
      s.setDrawingService(new WrapPrinter());
    }

    Thread.sleep(2000);

    for (Shape s : shapes) {
      s.draw();
    }

    Thread.sleep(2000);

    for (Shape s : shapes) {
      s.setDrawingService(new WrapXMLWriter());
    }

    Thread.sleep(2000);

    for (Shape s : shapes) {
      s.draw();
    }

  }
}
