
package Controller;

import Model.IMC_DAO;
import View.JFIMC;


public class controladorIMC {
    
    private JFIMC jfimc;
    private IMC_DAO imcDAO;

    public controladorIMC(JFIMC jfimc, IMC_DAO imcDAO) {
        this.jfimc = jfimc;
        this.imcDAO = imcDAO;
    }
    
}
