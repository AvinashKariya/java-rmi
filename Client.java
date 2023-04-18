import java.rmi.Naming;

public class Client {
    public static void main(String[] args) throws Exception {
        AddI obj = (AddI) Naming.lookup("ADD");
        int n = obj.add(5, 4);
        System.out.println("addition" + n);
    }
}
