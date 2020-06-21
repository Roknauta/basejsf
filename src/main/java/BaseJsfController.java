import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ResourceBundle;

@Named
@ViewScoped
public class BaseJsfController implements Serializable {

    private String nome;

    @PostConstruct
    public void init(){
        this.nome = obterChave("teste");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String obterChave(String key){
        ResourceBundle rb = ResourceBundle.getBundle("messages");
        return rb.getString(key);
    }
}
