/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4Task1;

import java.util.Arrays;

/**
 *
 * @author HP
 */
class SortedIntList extends IntList {

    public SortedIntList(int size) {
        super(size);
    }

    @Override
    public void add(int value) {
        super.add(value); 
        Arrays.sort(super.list, 0, super.numElements);
    }
    
}
