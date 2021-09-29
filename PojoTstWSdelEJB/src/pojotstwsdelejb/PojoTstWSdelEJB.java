/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojotstwsdelejb;
import java.util.Random;
/**
 *
 * @author rorod
 */
public class PojoTstWSdelEJB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("cancer: "+getResultEjb());
        wsejb.WSejb_Service service = new wsejb.WSejb_Service();
        wsejb.WSejb port = service.getWSejbPort();
        Random r = new Random();
        int a,b,c;
        int n = 100;
        for(int i=0;i<n;i++){
            a = r.nextInt(101)-50;
            b = r.nextInt(101)-50;
            System.out.println("suma de  "+a+" y "+b+" ="+port.sumaDos(a, b));
            
        }
                
        
        
    }

    private static String getResultEjb() {
        wsejb.WSejb_Service service = new wsejb.WSejb_Service();
        wsejb.WSejb port = service.getWSejbPort();
        return port.getResultEjb();
    }

    private static int sumaDos(int a, int b) {
        wsejb.WSejb_Service service = new wsejb.WSejb_Service();
        wsejb.WSejb port = service.getWSejbPort();
        return port.sumaDos(a, b);
    }
    
}
