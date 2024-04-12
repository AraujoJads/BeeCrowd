import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        int numeroAlunos = Integer.parseInt(entrada.nextLine());
		do {
		    Turma turma = new Turma();
		            
		    for(int i = 0; i < numeroAlunos; i++) {
		        String nome = entrada.nextLine();
		        String [] segunda = entrada.nextLine().split(" ");
		        String cor = segunda[0];
		        String tamanho = segunda[1];
		        turma.addAluno(nome, cor, tamanho); 
		    }
		            
		    // impressão da lista
		    for(int i = 0; i < numeroAlunos; i++) {  
		        System.out.println(turma.alunos.get(i).paraString());    	  
		    }    
		    numeroAlunos = Integer.parseInt(entrada.nextLine());
		    if(numeroAlunos > 0) {
		        System.out.println("");	
		    }
		        
		} while(numeroAlunos != 0);
        entrada.close();
	}

}

class Turma {

	ArrayList<Aluno> alunos = new ArrayList<>();
	
	public void addAluno(String n, String c, String t) {
		
		Aluno a = new Aluno();
		a.setCor(c);
		a.setNome(n);
		a.setTamanho(t);
		alunos.add(a);
		
		listaOrdenada();
	}
	
	public void listaOrdenada() {
		Collections.sort(alunos, new Comparador());
	}
	
	
}


class Comparador implements Comparator<Aluno> {
	@Override
	public int compare(Aluno a1, Aluno a2) {
			
		if(a1.getCor().equals("branco") && a2.getCor().equals("vermelho")) {
			return -1;
		} else if(a1.getCor().equals("vermelho") && a2.getCor().equals("branco")) {
			return 1;
		}
		
		if(a1.getTamanho().compareTo(a2.getTamanho()) < 0) {
			return 1;
		}else if(a1.getTamanho().compareTo(a2.getTamanho()) > 0) {
			return -1;
		}
		
		if(a1.getNome().compareTo(a2.getNome())< 0) {
			return -1;
		} else if(a1.getNome().compareTo(a2.getNome())> 0) {
			return 1;
		} 
		
		return 0;
	}
}

class Aluno {

	public String cor;
	public String tamanho;
	public String nome;
	
	public void setNome(String n) {
		nome = n;
	}
	public void setCor(String c) {
		cor = c;
	}
	public void setTamanho(String t) {
		tamanho = t;
	}
	public String getNome() {
		return nome;
	}
	public String getCor() {
		return cor;
	}
	public String getTamanho() {
		return tamanho;
	}

	
	public String paraString() {
		return cor + " " + tamanho + " " + nome;
 	}
	
	
	
}