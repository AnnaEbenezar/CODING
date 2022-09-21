/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

/**
 *
 * @author HP
 */
public class CatalogItem <S extends Media> implements Comparable<CatalogItem<S>> {
    
    S item;

    public CatalogItem(S item) {
        this.item = item;
    }
    
    @Override
    public int compareTo(CatalogItem<S> o) {
        return item.getId().compareTo(o.item.getId());
    }

    @Override
    public String toString() {
        return "\n" + item.getId() + ": " + item.getCreator() + ": " + item.getTitle() + ": " + item.getYear() ;
    }
    
}
