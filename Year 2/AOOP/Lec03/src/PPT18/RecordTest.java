/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PPT18;

/**
 *
 * @author HP
 */
public class RecordTest {

    public static void main(String[] args) {
        // TODO code application logic here
        Record id = createRecord(2, "Barney");

        tryObject(id);
        System.out.println(id);

    }

    public static void tryObject(Record r) {
        r.num = 100;
        r.name = "Fred";
    }

    public static Record createRecord(int num, String name) {
        Record t = new Record();
        t.num = num;
        t.name = "Barney";
        return t;
    }
}
