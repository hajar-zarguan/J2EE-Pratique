package metier;
import Dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetieImp implements IMetier {

    @Autowired
    private  IDao dao ;

    public IDao getDao() {
        return dao;
    }
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public  double calcule(){
        double nb=dao.getValue();
        return 2*nb;
    };

}
