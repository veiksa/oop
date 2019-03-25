public class JuhuslikudNumbrid {
    private int juhuslikNumber;
    private Parameetrid piirarv;

    public JuhuslikudNumbrid(Parameetrid piirarv) {
        this.juhuslikNumber = (int) (Math.random() * piirarv.getPiirArv());
    }

    @Override
    public String toString() {
        return "" + juhuslikNumber;
    }
}
