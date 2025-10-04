public class WrapPrinter extends DrawingService {

  private Printer printer;

  public WrapPrinter() {
    printer = Printer.getPrinter();
  }

  public void drawLine(int x1, int y1, int x2, int y2) {
    printer.drawLine(x1, x2, y1, y2);
  }

  public void drawCircle(int x, int y, int r) {
    printer.drawCircle(x, y, r);
  }

  public void drawPolygon(int[] x, int[] y, int z){
    printer.drawPolygon(x, y, z);
  }

}
