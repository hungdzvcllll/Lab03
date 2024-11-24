import java.util.*;

public class Store {
    private ArrayList<DigitalVideoDisc> list = new ArrayList<DigitalVideoDisc>();

    public void setList(ArrayList<DigitalVideoDisc> list) {
        this.list = list;
    }

    public ArrayList<DigitalVideoDisc> getList() {
        return list;
    }

    public void addDVD(DigitalVideoDisc d) {
        list.add(d);
    }

    public void removeDVD(DigitalVideoDisc d) {
        list.remove(d);
    }
}