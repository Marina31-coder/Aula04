import java.util.Scanner;

public class LoopWhile2 {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a média de idades dos alunos de uma escola.
		 * Sabendo de antemão que alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual é a melhor forma de calcular essa média?*/
		
		int idade;
		double media=0;
		int quantidadeAlunos = 0;
		int totalAlunos = 0;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Por favor, informe a quantidade de alunos que você pretende inserir: ");
		totalAlunos = leitor.nextInt();
		
		while(quantidadeAlunos < totalAlunos) {
		System.out.println("Informe a idade do " + (quantidadeAlunos + 1) + " aluno");
		idade = leitor.nextInt();
		media = media + idade;
		quantidadeAlunos = quantidadeAlunos + 1;
		//quantidadeAlunos += 1
		//quantidadeAlunos++;
		}
		
		media = media/(double) totalAlunos;
		
		System.out.println("A média das idades é: " + media);
		
		leitor.close();
		

	}

}
