package _1_Lab;

public class Box <T>{

    private T items;

public Box(T items) {
    this.items = items;
}

    public T getItems() {
        return items;
    }

    public void setItems(T items) {
        this.items = items;
      //  Box boxWithoutRestrictions = new Box();
      //  Box<Integer> = boxForIntegersOnly = new Box<>()
    }
}
