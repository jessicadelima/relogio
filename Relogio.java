import java.util.Calendar;

/**
 * Relogio
 */
public class Relogio {

    private int hora;
    private int minuto;
    private int segundo;

    //método construtor: iniciliza os atributos do objeto, tem o mesmo nome da classe
    public Relogio(){
        Calendar data = Calendar.getInstance();
        this.hora = data.get(Calendar.HOUR_OF_DAY);
        this.minuto = data.get(Calendar.MINUTE);
        this.segundo = data.get(Calendar.SECOND);
        
    }

    //métodos do livro: ações ou comportamentos do livro
    public String exibirHora(){
        return (hora+":"+minuto+":"+segundo);
    } 
}