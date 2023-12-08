/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloodbank;



/**
 *
 * @author SHIVA KRISHNA
 */
public class BloodBank {
    public void getGreeting() {
       LoginPage obj = new LoginPage();
       obj.setVisible(true);
    }

    public static void main(String[] args) {
        new BloodBank().getGreeting();
    }
}
