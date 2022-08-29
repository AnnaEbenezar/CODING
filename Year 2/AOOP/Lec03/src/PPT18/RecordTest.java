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

    class Record {

        int num;
        String name;
    }

    public class RecordTest {

        public static void main(String args[]) {
            Record id = new Record();
            id.num = 2;
            id.name = "Barney";
            tryObject(id);
            System.out.println(id.name + "" + id.num);
        }

        public static void tryObject(Record r) {
            r.num = 100;
            r.name = "Fred";
        }
