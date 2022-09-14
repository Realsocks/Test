public class Professionals implements People{
    private String name = "Professionals";

    @Override
    public void talk() {
        System.out.println(name);
    }
}
