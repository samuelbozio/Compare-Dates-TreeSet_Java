import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Set<Tarefas> tarefas = new TreeSet<>();

        tarefas.add(new Tarefas("Estudar", sdf.parse("11/08/2003")));
        tarefas.add(new Tarefas("Comer", sdf.parse("11/06/2003")));
        tarefas.add(new Tarefas("Dormir", sdf.parse("07/02/2003")));
        tarefas.add(new Tarefas("Sonhar", sdf.parse("10/03/2003")));


        for (Tarefas tasks : tarefas) {

            System.out.println(tasks);

        }




    }
}