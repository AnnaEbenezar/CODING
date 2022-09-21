/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

import java.util.Comparator;

/**
 *
 * @author HP
 */
public class CreatorComparator implements Comparator<CatalogItem> {

    @Override
    public int compare(CatalogItem o1, CatalogItem o2) {
        return o1.item.getCreator().compareTo(o2.item.getCreator());
    }
    
}
