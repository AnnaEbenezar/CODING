
public class Registrar {

    public static void add(String string, Movie movie) {
    }

    public static Movie get(String string, String name) {
        return null;
    }

    public static void add(String string, Customer customer) {
    }

    public static Customer get(String name) {
    	return (Customer) get("Customers", name);
    }

}
