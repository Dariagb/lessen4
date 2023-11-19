public class Box<T> {
    private T ding;
    private String material;

    Box(T ding, String material) {
        this.ding = ding;
        this.material = material;
    }

    public T getDing() {
        return ding;
    }


    public void setDing(T ding) {
        this.ding = ding;
    }
    public static <T> void printBoxContents(Box<T> box) {
        T ding = box.getDing();
        System.out.println("Коробка содержит "+ ding.toString());
    }
}

