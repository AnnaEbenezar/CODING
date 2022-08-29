package multiplicationtable;

public class MultiplicationTable 

{

    public static void main(String[] args) 
    {
        int MulTable[][]=new int[10][10];
        int row=1, column=1;
        for (int[] MulTable1 : MulTable) {
            for (int j = 0; j < MulTable1.length; j++) {
                MulTable1[j] = row*column;
                column=column+1;
            }
            row=row+1;
            column=1;
        }
        for (int[] MulTable1 : MulTable) {
            for (int j = 0; j<MulTable.length; j++) {
                System.out.print(" " + MulTable1[j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
