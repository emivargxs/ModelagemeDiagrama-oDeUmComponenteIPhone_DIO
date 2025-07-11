public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {
	public Iphone(){}
	public String tocar() {
		return "Reproduzindo Musica.";
	}

	public String pausar() {
		return "Musica Pausada";
	}
	public void selecionarMusica(String musica) {
		System.out.println("Musica selecionada: " + musica);
	}

	public void ligar(String numero) {
		System.out.println("Ligando para: " + numero);
	}

	public String atender() {
		return "Ligação atendida";
	}

	public String iniciarCorreioVoz() {
		return "Correio de voz iniciado";
	}

	public  void exibirPagina(String url){
		System.out.println("Pagina exibida: " + url);
	}

	public  String adicionarNovaAba(){
		return "Nova aba adicionada";
	}

	public String atualizarPagina(){
		return "Página atualizada";
	}

}
