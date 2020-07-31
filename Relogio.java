
/**
 * Relogio
 */
public class Relogio {

    private int hora;
    private int minuto;
    private int segundo;

    //método construtor: iniciliza os atributos do objeto, tem o mesmo nome da classe
    public Relogio(int hora,int minuto, int segundo){
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
        
        /*
        Calendar data = Calendar.getInstance();
        this.hora = data.get(Calendar.HOUR_OF_DAY);
        this.minuto = data.get(Calendar.MINUTE);
        this.segundo = data.get(Calendar.SECOND);
        */

    }

    //métodos do livro: ações ou comportamentos do livro
    public String exibirHora(){
        return (hora+":"+minuto+":"+segundo);
    } 

    public int getHora(){
        return hora;
    }

    public int getMinuto(){
        return minuto;
    }

    public int getSegundo(){
        return segundo;
    }

    public void setHora(int hora){
        if (hora > -1 && hora < 23){
            this.hora = hora;
        }
    }

    public void setMinuto(int minuto){
        if (minuto > -1 && minuto < 60) {
            this.minuto = minuto;
        }
    }

    public void setSegundo(int segundo){
        if (segundo > -1 && segundo < 60){
            this.segundo = segundo;
        }
    }

}