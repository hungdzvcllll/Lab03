public class Aims {
    public static void main(String[] args) {

        DigitalVideoDisc d1 = new DigitalVideoDisc("abc", "hsdh", "gsdgx", 17, 3.95f);
        DigitalVideoDisc d2 = new DigitalVideoDisc("gsgd", "gsdg", "tjedasu", 25, 4.5f);
        DigitalVideoDisc d3 = new DigitalVideoDisc("adll", "ewrads", "rdwrasr", 14, 9f);
        Cart c = new Cart();
        DigitalVideoDisc list[] = { d1, d2, d3 };
        c.addDigitalVideoDisc(d1);
        // c.addDigitalVideoDisc(d2);
        // c.addDigitalVideoDisc(d3);
        c.addDigitalVideoDisc(d2, d3);
        c.searchByID(3);
        c.searchByTitle("shdggdg");
    }
}