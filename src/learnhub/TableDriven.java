/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnhub;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class TableDriven {
    enum State {LOGIN,EXIT};
    
    public void login(){
        State state = State.LOGIN; 
        String username[] = {"rian","luthfi","angga","fairuz","boma","tara"};
        String password[] = {"rian123","luthfi123","angga123","fairuz123","boma123","tara123"};
        
        Scanner sc = new Scanner(System.in);
        
        int pil;
        String user,pass;
        String tampilan[] ={"LOGIN","EXIT"};
        while(state!=State.EXIT){
            System.out.println("1. LOGIN 2. EXIT");
            System.out.print("Masukkan Pilihan: ");
            pil = sc.nextInt();
            sc.nextLine();
            switch(pil){
                case 1:
                    state = State.LOGIN;
                    
                    System.out.println("Kamu saat ini berada pada state "+tampilan[pil-1]);
                   
                    System.out.print("Masukkan Username: ");
                    user = sc.nextLine();
                    System.out.print("Masukkan Password: ");
                    pass = sc.nextLine();
                    
                    System.out.print("1. Logout\n2. Exit\nSilahkan Pilih: ");
                    pil = sc.nextInt();
                    sc.nextLine();
                    switch(pil){
                        case 1:
                            System.out.println("Berhasil Logout");
                            break;
                        case 2:
                            state = State.EXIT;
                            break;
                    }
                case 2:
                    state = State.EXIT;
            break;
            }
        }
    }
}
