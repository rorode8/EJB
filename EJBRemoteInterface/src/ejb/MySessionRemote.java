/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Remote;

/**
 *
 * @author rorod
 */
@Remote
public interface MySessionRemote {

    String getResult();

    int sumaDos(int a, int b);

    
    
}
