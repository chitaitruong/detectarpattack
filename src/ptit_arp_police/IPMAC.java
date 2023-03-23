/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ptit_arp_police;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author ASUS
 */
public class IPMAC {
    String IP;
    String MAC;
    boolean KT;
    String TIME;
    ImageIcon iAttacked = new ImageIcon("D:\\Java\\PTIT_ARP_POLICE\\src\\ptit_arp_police\\no.png");
    IPMAC(String ip,String mac,boolean kt,String time)
    {
        IP=ip;
        MAC=mac;   
        KT=kt;
        TIME=time;
    } 

    public String getTime() {
        return TIME;
    }

    public void setTime(String time) {
        this.TIME = time;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }
    public String getMAC() {
        return MAC;
    }

    public void setMAC(String MAC) {
        this.MAC = MAC;
    }

    public boolean isKT() {
        return KT;
    }

    public void setKT(boolean KT) {
        this.KT = KT;
    }

    @Override
    public String toString() {
        return "IPMAC{" + "IP=" + IP + ", MAC=" + MAC + ", KT=" + KT + ", time=" + TIME + '}';
    }
    public Object[] toObjects(){
        return new Object[]{
            new ImageIcon("D:\\Java\\PTIT_ARP_POLICE\\src\\ptit_arp_police\\no.png").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH),IP,MAC,TIME
        };
    }
}
