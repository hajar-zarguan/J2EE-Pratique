import metier.calcule;
import org.junit.Assert;

public class calcule_test {
    private metier.calcule calcule;
    public void somme_test(){
        calcule=new calcule();
        double a=5,b=14;
        double expected=14;
        double res= calcule.somme(a,b);
        Assert.assertTrue(res==expected);
    }
}