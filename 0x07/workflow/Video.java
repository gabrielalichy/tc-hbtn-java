public class Video {

	public String arquivo;
	public FormatoVideo formato;
	
	public Video(String video, FormatoVideo mpeg) {
		this.arquivo = video;
		this.formato = mpeg;
	}

	public String getArquivo() {
		return arquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}

	public FormatoVideo getFormato() {
		return formato;
	}

	public void setFormato(FormatoVideo formato) {
		this.formato = formato;
	}
	
	

}
