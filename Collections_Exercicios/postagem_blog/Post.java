public class Post implements Comparable<Post>{

	public Autor autor;
	public String titulo;
	public String corpo;
	public Categorias categoria;

	public Post(Autor autor1, String titulo, String corpo, Categorias devops) {
		super();
		this.autor = autor1;
		this.titulo = titulo;
		this.corpo = corpo;
		this.categoria = devops;
	}

	@Override
	public String toString() {
		return  this.titulo ;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCorpo() {
		return corpo;
	}

	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}

	/**
	 * @return the autor
	 */
	public Autor getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	/**
	 * @return the categoria
	 */
	public Categorias getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}

	@Override
	 public int compareTo(Post post) {
       return this.titulo.compareTo(post.getTitulo());
   }

}