/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ptit_arp_police;

import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import static ptit_arp_police.ArpDetectForm.scanARPTable;

/**
 *
 * @author ASUS
 */
public class PTIT_ARP_POLICE {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        System.out.print(InetAddress.getLocalHost().getHostAddress());
    }
    
}
