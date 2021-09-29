/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojotstejb;
import java.util.Random;
import javax.naming.*;
//import EJRRemoteInterface.*;
/**
 *
 * @author rorod
 */
public class PojoTstEJB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        Context ctx = new InitialContext();
        Object obj = ctx.lookup("java:global/EntAppEJB/EntAppEJB-ejb/MySession");
        
        ejb.MySessionRemote miEjb = (ejb.MySessionRemote) javax.rmi.PortableRemoteObject.narrow(obj, ejb.MySessionRemote.class);
        Random r = new Random();
        int a,b,c;
        int n = 100;
        for(int i=0;i<n;i++){
            a = r.nextInt(101)-50;
            b = r.nextInt(101)-50;
            System.out.println("suma de  "+a+" y "+b+" ="+miEjb.sumaDos(a, b));
            
        }
        
        
        
    }
    
}
