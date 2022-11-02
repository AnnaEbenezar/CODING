/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PPT27;

/**
 *
 * @author HP
 */
class MySleep implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            System.out.println("run() : " + i);
            if (i == 500) {
                System.out.println("Nap Time");
                try {
                    Thread.currentThread().sleep(5000);//milli seconds
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
