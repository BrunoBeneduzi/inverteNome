package recebeNome;

public class RecebeNome {
	String nome;
	
	public RecebeNome(String nome){
		this.nome = nome;
	}
	
	public void inverteNome() {//inverte o nome
		for(int i = 0; i < this.nome.length(); i++) {
			System.out.print(this.nome.charAt(this.nome.length() - i - 1));
		}
	}
}