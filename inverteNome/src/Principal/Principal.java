package Principal;
import recebeNome.*;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite qualquer nome e ele será imprimido ao contrario -> ");
		RecebeNome nome = new RecebeNome(sc.nextLine());
		
		nome.inverteNome();
	}

}
