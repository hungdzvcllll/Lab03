package hust.soict.globalict.garbage;

public class GarbageCreator {
    public static void main(String[] args) {
        for (long i = 0; (long) i < 111111111*2; i++) {
            createGarbage();
        }
    }

    // This method generates a lot of garbage
    public static void createGarbage() {
        // Creating many temporary objects (StringBuilder in this case)
        for (int i = 0; i < 22; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("Garbage creation: ").append(i);
            // The object `sb` is discarded immediately, causing garbage collection.
        }
    }
}