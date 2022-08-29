/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec01;

/**
 *
 * @author ICKMITL-Student
 */
public class Foo 
{    
  int i = 4;
  int getI() {
    return i;
  }
  static int k = 2;
  static int getK() {
    return k;
  }
  public static void main(String[] args){
    System.out.println(Foo.getK());
    Foo f = new Foo();
    System.out.println(f.getI());
  }
}

