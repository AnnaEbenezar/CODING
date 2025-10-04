
public class XMLWriter{
    private static XMLWriter writer;

    public static XMLWriter getWriter() {
        if (writer == null) {
            writer = new XMLWriter();
        }
        return writer;
    }


    public void writeLine(int x1, int y1, int x2, int y2) {
        String line = String.format("<line x1=\"%d\" y1=\"%d\" x2=\"%d\" y2=\"%d\"/>\n", x1, y1, x2, y2);
        System.out.println(line);
    }
    

    public void writeCircle(int cx, int cy, int r) {
        System.out.printf("<circle cx=\"%d\" cy=\"%d\" r=\"%d\"/>\n\n", cx, cy, r);
    }

    public void writePolygon(int[] x, int[] y, int n) {
        StringBuilder points = new StringBuilder();
        for (int i = 0; i < n; i++) {
            points.append(String.format("(%d,%d)", x[i], y[i]));
        }
        // Remove the trailing space
        points.deleteCharAt(points.length() - 1);
    
        String polygon = String.format("<polygon points=\"%s\"/>\n\n", points.toString());
        System.out.println(polygon);
    }
    
    
}
