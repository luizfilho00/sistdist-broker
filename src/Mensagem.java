public class Mensagem {

	private String codCurso; // Passa o valor do codigo do curso.
	private String rgaRemetente; // Passa o valor do rga de quem está enviando a mensagem.
	private String rgaDestinatario; // Passa o valor do rga de quem receberá a mensagem.
	private String conteudo; // Texto em si que será escrito pelo remetente.

	public String getCodCurso() {
		return this.codCurso;
	}

	public String getRGARemetente() {
		return this.rgaRemetente;
	}

	public String getRGADestinatario() {
		return this.rgaDestinatario;
	}

	public String getConteudo() {
		return this.conteudo;
	}

	public void escreverMesagem(String codCurso, String rgaRemetente, String rgaDestinatario, String conteudo) {
		this.codCurso = codCurso;
		this.rgaRemetente = rgaRemetente;
		this.rgaDestinatario = rgaDestinatario;
		this.conteudo = conteudo;
	}

}