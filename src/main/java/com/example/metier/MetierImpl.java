package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier") //kan declari had l classe comme bean spring bl identifiant metier
//hna 5dmna bl injection par champ
public class MetierImpl implements IMetier {
    @Autowired private IDao dao;
    @Override
    public double calcul(){
        return dao.getValue()*2;
    }
    //hna alternative n9do ndiro injection par setter
    public void setDao(IDao dao) {
        this.dao = dao;
    }

}
