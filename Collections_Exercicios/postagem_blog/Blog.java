import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Blog {

	private List<Post> postagem = new ArrayList<>();
	Integer contagemDevops = 0;
	Integer contagemDesenvolvimento = 0;
	Integer data = 1;
	boolean jaExiste = false;
	boolean hadoop = false;

	public void adicionarPostagem(Post post1) {
		if (postagem.size() > 0) {
			for (int i = 0; i < postagem.size(); i++) {
				
			if (postagem.get(i).getTitulo().equals(post1.getTitulo())) {
			if (!jaExiste) {
						try {
							jaExiste = true;
							throw new Exception();
						} catch (Exception e) {
							System.out.println("Postagem jah existente");
							
						}			
			}
		 }
			
		}
			if (jaExiste == false) {
				postagem.add(post1);
			}
		} else {
			postagem.add(post1);
		}
	}

	public Set<Autor> obterTodosAutores() {

		Set<Autor> autores = new LinkedHashSet<Autor>();


		for (Post post : postagem) {
			autores.add(post.getAutor());
		}
		return autores;

	}

	public Set<Post> obterPostsPorAutor(Autor autor) {
		Set<Post> autor1 = new HashSet<Post>();
		for (Post post2 : postagem) {
			if(post2.getAutor().getNome().equals(autor.getNome())) {
				autor1.add(post2);
			}
		}
		return autor1;
	}
	
	public Set<Post> obterPostsPorCategoria(Categorias devops){
		Set<Post> autor1 = new HashSet<Post>();
		for (Post post2 : postagem) {
			if(post2.getCategoria().equals(devops)) {
				autor1.add(post2);
			}
		}
		return autor1;
		
	}
	
	public Map<Autor, Set<Post>> obterTodosPostsPorAutor(){
		

		Map<Autor, Set<Post>> masp = new HashMap<Autor, Set<Post>>();
		for (int i = 0; i < postagem.size(); i++) {
			
				masp.put(postagem.get(i).getAutor(), obterPostsPorAutor(postagem.get(i).getAutor()));
		}
		return masp;
		
		
	}
	
	public Map<Categorias, Integer> obterContagemPorCategoria() {
		Map<Categorias, Integer> contagemCategoria = new HashMap<Categorias, Integer>();
		for (Post post : postagem) {
			if (post.getCategoria().equals(Categorias.DESENVOLVIMENTO)) {
				contagemDesenvolvimento = contagemDesenvolvimento + 1;
				contagemCategoria.put(post.getCategoria(), contagemDesenvolvimento);
			}else if (post.getCategoria().equals(Categorias.DEVOPS)) {
				contagemDevops =contagemDevops + 1;
				contagemCategoria.put(post.getCategoria(), contagemDevops);
			}else {
				contagemCategoria.put(post.getCategoria(), data);
			}				
		}
		
		
		return contagemCategoria;	
	}

	public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
		Map<Categorias, Set<Post>> contagemCategoria = new HashMap<Categorias, Set<Post>>();
		for (Post post : postagem) {
			if (post.getCategoria().equals(Categorias.DESENVOLVIMENTO)) {
				obterPostsPorCategoria(Categorias.DESENVOLVIMENTO);
				contagemCategoria.put(post.getCategoria(), obterPostsPorCategoria(Categorias.DESENVOLVIMENTO));
			}else if (post.getCategoria().equals(Categorias.DEVOPS)) {
				contagemCategoria.put(post.getCategoria(), obterPostsPorCategoria(Categorias.DEVOPS));
			}else {
				contagemCategoria.put(post.getCategoria(), obterPostsPorCategoria(Categorias.DATA_SCIENCE));
			}			
		}
		return contagemCategoria;
	}
}