import java.util.*;

public class Util {

    public static void algorithmsDemo() {
        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(10);
        numbers1.add(60);
        numbers1.add(30);
        numbers1.add(80);
        numbers1.add(50);

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(11);
        numbers2.add(61);
        numbers2.add(31);
        numbers2.add(81);
        numbers2.add(51);

        System.out.println("Disjoint: " + Collections.disjoint(numbers1, numbers2) );
        System.out.println("max: " + Collections.max(numbers1) + " min " + Collections.min(numbers1));

        TreeSet<Product> products = new TreeSet<Product>();
        products.add(new Product(404, "DD", 1234));
        products.add(new Product(5689, "ZZ", 4569));
        products.add(new Product(1234, "GG", 9000));
        products.add(new Product(5321, "CC", 2000));
        products.add(new Product(890, "YY", 5500));
        products.add(new Product(755, "BB", 3400));
        products.add(new Product(149, "FF", 3200));
        products.add(new Product(345, "MM", 1290));
        products.add(new Product(234, "EE", 900));
        products.add(new Product(1200, "XX", 1234));

        //Product maxProduct = Collections.max(products);
        //Product maxProduct = Collections.max(products, new ProductComparator());
        Product maxProduct = Collections.max(
                products,
                new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        return o1.getPrice() - o2.getPrice();
                    }
                }
        );
        System.out.println(maxProduct);

        List<String> cities = Collections.nCopies(10, "Pune");
        for(String val : cities) {
            System.out.println(val);
        }

        List<Integer> uNumbers1 = Collections.unmodifiableList(numbers1);
    }

    public static void mapDemo() {
        TreeMap<Integer, Product> products = new TreeMap<>();
        products.put(101, new Product(101, "XX", 1100));
        products.put(555, new Product(555, "BB", 1500));
        products.put(321, new Product(321, "ZZ", 1900));
        products.put(123, new Product(123, "DD", 900));
        products.put(89, new Product(89, "RR", 1400));
        products.put(489, new Product(489, "NN", 600));

        //products.put(101, new Product(101, "AAA", 1111));
        products.putIfAbsent(101, new Product(101, "AAA", 1111));
        System.out.println(products.get(101));
        products.remove(101);

        Set<Integer> keys = products.keySet();
        for(Integer key : keys) {
            System.out.println(key + " --> " + products.get(key));
        }
        System.out.println("--------------------------------");

        Set<Map.Entry<Integer, Product>> entries = products.entrySet();
        for(Map.Entry<Integer, Product> entry : entries) {
            System.out.println(entry.getKey() + " --> " + entry.getValue()) ;
        }

        System.out.println();

        products.headMap(301);
        products.tailMap(301);

        HashMap<Integer, Product> hProducts = new HashMap<>();
        //LinkedHashMap



    }


    public static void hashSetDemo() {
        HashSet<Product> products = new HashSet<>();
        LinkedHashSet<Product> newProducts = new LinkedHashSet<>();

        products.add(new Product(404, "DD", 1234));
        products.add(new Product(5689, "ZZ", 4569));
        products.add(new Product(1234, "GG", 9000));
        products.add(new Product(5321, "CC", 2000));
        products.add(new Product(890, "YY", 5500));
        products.add(new Product(755, "BB", 3400));
        products.add(new Product(149, "FF", 3200));
        products.add(new Product(345, "MM", 1290));
        products.add(new Product(234, "EE", 900));
        products.add(new Product(1200, "XX", 1234));

        for(Product product : products) {
            System.out.println(product);
        }
        System.out.println();
    }

    public static void treeSetDemo() {

        TreeSet<Product> products = new TreeSet<Product>(
                new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        if(o1.getPrice() > o2.getPrice()) {
                            return 1;
                        }
                        if(o1.getPrice() < o2.getPrice()) {
                            return -1;
                        }
                        return 0;
                    }
                }
        );

        products.add(new Product(404, "DD", 1234));
        products.add(new Product(5689, "ZZ", 4569));
        products.add(new Product(1234, "GG", 9000));
        products.add(new Product(5321, "CC", 2000));
        products.add(new Product(890, "YY", 5500));
        products.add(new Product(755, "BB", 3400));
        products.add(new Product(149, "FF", 3200));
        products.add(new Product(345, "MM", 1290));
        products.add(new Product(234, "EE", 900));
        products.add(new Product(1200, "XX", 1234));

        for(Product product : products) {
            System.out.println(product);
        }
        System.out.println();

        TreeSet<Stock> ts = new TreeSet<Stock>(new MyStockComparator());

        ts.add(new Stock(7890, "Rel", 4));
        ts.add(new Stock(4560, "Tata", 5));
        ts.add(new Stock(3290, "BitCode", 4));
        ts.add(new Stock(5432, "XYZ", 1));

        for(Stock s : ts) {
            System.out.println(s);
        }
        System.out.println();

       /* TreeSet<Product> products = new TreeSet<Product>();
        products.add(new Product(404, "DD", 1234));
        products.add(new Product(5689, "ZZ", 4569));
        products.add(new Product(1234, "GG", 9000));
        products.add(new Product(5321, "CC", 2000));
        products.add(new Product(890, "YY", 5500));
        products.add(new Product(755, "BB", 3400));
        products.add(new Product(149, "FF", 3200));
        products.add(new Product(345, "MM", 1290));
        products.add(new Product(234, "EE", 900));
        products.add(new Product(1200, "XX", 1234));

        for(Product product : products) {
            System.out.println(product);
        }
        System.out.println();*/


        /*TreeSet<Integer> ti = new TreeSet<>();
        ti.add(50);
        ti.add(90);
        ti.add(20);
        ti.add(10);
        ti.add(30);
        ti.add(100);
        ti.add(25);
        ti.add(15);
        ti.add(60);
        ti.add(80);
        ti.add(100);

        for(Integer val : ti) {
            System.out.print(val + " ");
        }
        System.out.println();*/


    }

    public static void linkedListDemo() {
        LinkedList<String> names = new LinkedList<String>();
        ListIterator<String> it = names.listIterator();

        Stack<Integer> si = new Stack<>();
    }

    public static void arrayListDemo() {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Size: " + numbers.size());

       // numbers.add( new Integer(100));
        numbers.add(300);
        numbers.add(200);

        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));

        System.out.println("Size: " + numbers.size());

        for(int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println();
        for(Integer val : numbers) {
            System.out.println(val);
        }

        ArrayList<Integer> newNumbers = new ArrayList<Integer>(numbers);
        newNumbers.add(0, 50);
        System.out.println();
        for(Integer val : newNumbers) {
            System.out.print(val + " ");
        }
        System.out.println();

        newNumbers.remove(1);
       // newNumbers.remove(new Integer(300));
        newNumbers.set(1, 2000);

        System.out.println();
        for(Integer val : newNumbers) {
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.println("using iterator");
        newNumbers.add(0, 55);
        newNumbers.add(90);

        //Iterator<Integer> it = newNumbers.iterator();
        ListIterator<Integer> it = newNumbers.listIterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        it = newNumbers.listIterator();
        it.next(); //points to 0th element
        //it.remove();
        it.set(33);
        it.add(88);

        it = newNumbers.listIterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();


    }
}
