import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tarefas implements Comparable<Tarefas> {

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private String nome;
    private Date data;

    public Tarefas(String nome, Date data) {
        this.nome = nome;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public int compareTo(Tarefas o) {

        return data.compareTo(o.getData());
    }

    @Override
    public String toString() {
        return "Tarefas{" +
                "nome='" + nome + '\'' +
                ", data=" + data +
                '}';
    }
}
