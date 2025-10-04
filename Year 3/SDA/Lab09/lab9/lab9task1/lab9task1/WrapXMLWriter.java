public class WrapXMLWriter extends DrawingService{

    private XMLWriter writer;

    public WrapXMLWriter(){
      writer =  XMLWriter.getWriter();
    }
  
    public void drawLine(int x1, int y1, int x2, int y2) {
        writer.writeLine(x1, x2, y1, y2);
    }
  
    public void drawCircle(int x, int y, int r) {
        writer.writeCircle(x, y, r);
    }

    public void drawPolygon(int[] x, int[] y, int z){
        writer.writePolygon(x, y, z);
    }
    
}
