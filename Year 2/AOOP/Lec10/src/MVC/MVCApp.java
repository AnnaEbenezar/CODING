/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MVC;

/**
 *
 * @author HP
 */
public class MVCApp {

    static private int start_value = 10;	//initialise model, which in turn initialises view

    public static void main(String[] args) {
        Model myModel = new Model();
        View1 myView1 = new View1();
        View2 myView2 = new View2();
        //tell Model about View. 
        
        myModel.addObserver(myView1);
        myModel.addObserver(myView2);
        //View1: create Controller. tell it about Model and View, initialise model
        
        Controller myController = new Controller();
        myController.addModel(myModel);
        myController.addView(myView1);
        myController.initModel(start_value);
        //View1:tell View about Controller 
        
        myView1.addController(myController);
        //View2
        
        Controller myController2 = new Controller();
        myController2.addModel(myModel);
        myController2.addView(myView2);
        myController2.initModel(start_value);
        myView2.addController(myController2);
    } //main()
} //RunMVC

