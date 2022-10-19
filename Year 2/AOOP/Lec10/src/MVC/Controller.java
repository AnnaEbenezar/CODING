/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC;

/**
 *
 * @author HP
 */
class Controller implements java.awt.event.ActionListener {

    Model model;
    javax.swing.JFrame view; //JFrame is a super type of both View1 and View2

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        model.incrementValue();
    } //actionPerformed()

    public void addModel(Model m) {
        this.model = m;
    } //addModel()

    public void addView(javax.swing.JFrame v) {
        this.view = v;
    } //addView()

    public void initModel(int x) {
        model.setValue(x);
    } //initModel()
} //Controller

