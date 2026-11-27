import java.util.Arrays;

public class Repository<T> {
    private T[] items;

    public Repository(T[] items) {
        this.items = items;
    }

    // Add an item
    public void addItem(T item) {
        items = Arrays.copyOf(items, items.length + 1);
        items[items.length - 1] = item;
    }

    // Remove an item using its index
    public T removeItem(int index) {
        if (index < 0 || index >= items.length) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        T removedItem = items[index];

        T[] newItems = Arrays.copyOf(items, items.length - 1);

        for (int i = index; i < newItems.length; i++) {
            newItems[i] = items[i + 1];
        }

        items = newItems;

        return removedItem;
    }

    // Search for an item
    public boolean searchItem(T item) {
        for (T element : items) {
            if (element.equals(item)) {
                return true;
            }
        }
        return false;
    }

    // Display all items
    public void displayItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }

    // Get the size
    public int getSize() {
        return items.length;
    }
}