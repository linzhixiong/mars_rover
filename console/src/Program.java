import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 9/21/11
 * Time: 9:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class Program {
    public static void main(String[] args) {
        System.out.println("");

        ArrayList<String> names;
        names = new ArrayList<String>();
        names.add("linzhixiong");
        names.add("xuebo");
        names.add("jinming");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
