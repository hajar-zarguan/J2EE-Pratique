package metier;
import Dao.IDao;

public class MetieImp implements IMetier {
    public IDao getDao() {
        return dao;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    IDao dao ;
    public  double calcule(){
        double nb=dao.getValue();
        return 2*nb;
    };
}
