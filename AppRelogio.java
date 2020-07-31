public class AppRelogio {
    public static void main(String[] args) {
        
        Relogio relogio1 = new Relogio(5,57,12);

        System.out.println(relogio1.exibirHora());

        System.out.println("Hora atual: "+ relogio1.getHora());

        
        
    }
}