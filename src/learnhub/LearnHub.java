/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnhub;

/**
 *
 * @author luthfisiregar5
 */
public class LearnHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login lg =  new Login();
        TableDriven td = new TableDriven();
        lg.setVisible(true);
        lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
        td.login();
    }
    
}
