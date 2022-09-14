public class UsualPeople implements People{
    private String name = "юселесс";


    @Override
    public void talk() {
        System.out.println(name);
    }
}
