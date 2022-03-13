package test;

@Component
public class Person {
    @Autowired
    public AD A;

    public Person(AD a) {
        A=a;
    }

    public Person() {
    }

    public void show(){
        System.out.println("show from person");
        A.show();
    }

    public AD getA() {
        return A;
    }

    public void setA(AD a) {
        A =  a;
    }
}
