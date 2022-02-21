package presentation;

import Dao.DaoImpl;
import metier.MetieImp;
// presentqtion stqtique
public class Presentation {
    public static void main(String[] args) {
        DaoImpl dao=new DaoImpl();
        MetieImp metier=new MetieImp();
        metier.setDao(dao);
        System.out.println(metier.calcule());


    }
}
