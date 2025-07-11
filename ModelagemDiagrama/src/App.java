public class App {
    public static void main(String[] args) throws Exception {
        Iphone teste1 = new Iphone();

        System.out.println(teste1.tocar());
        System.out.println(teste1.pausar());
        teste1.selecionarMusica("Sorry");

        teste1.ligar("519966307141");
        System.out.println(teste1.atender());
        System.out.println(teste1.iniciarCorreioVoz());

        teste1.exibirPagina("google.com.br");
        System.out.println(teste1.adicionarNovaAba());
        System.out.println(teste1.atualizarPagina());
        

        
    }
}
