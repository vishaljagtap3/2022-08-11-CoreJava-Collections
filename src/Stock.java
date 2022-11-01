import java.util.Comparator;

public class Stock {

    private int id;
    private String name;
    private int rating;

    public Stock(int id, String name, int rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}

class MyStockComparator implements Comparator<Stock> {
    @Override
    public int compare(Stock o1, Stock o2) {
        if(o1.getRating() > o2.getRating()) {
            return 1;
        }
        if(o1.getRating() < o2.getRating()) {
            return -1;
        }
        return 0;
    }
}
