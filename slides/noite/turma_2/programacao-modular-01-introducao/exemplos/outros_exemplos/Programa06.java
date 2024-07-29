
public class Programa06 {
	
	public static void main(String[] args) {
		int n = 5;
		double soma = 0;
		Aluno[] alunos = new Aluno[n];
		
		Aluno aluno0 = new Aluno();
		aluno0.nome = "Pedro";
		aluno0.matricula = "577028";
		aluno0.idade = 25;
		alunos[0] = aluno0;
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Aninha";
		aluno1.matricula = "922955";
		aluno1.idade = 28;
		alunos[1] = aluno1;
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Banana";
		aluno2.matricula = "579855";
		aluno2.idade = 26;
		alunos[2] = aluno2;
		
		Aluno aluno3 = new Aluno();
		aluno3.nome = "Bernado";
		aluno3.matricula = "398855";
		aluno3.idade = 31;
		alunos[3] = aluno3;
		
		Aluno aluno4 = new Aluno();
		aluno4.nome = "Shulambs";
		aluno4.matricula = "000001";
		aluno4.idade = 46;
		alunos[4] = aluno4;
		
		System.out.println("Alunos registrados: \n");
		for (Aluno aluno : alunos) {
			System.out.println("""
					---------------------
					
					Nome: %s
					Matricula: %s
					Idade: %d
					""".formatted(aluno.nome, aluno.matricula, aluno.idade));
			soma += aluno.idade;
		}
		System.out.println("---------------------");
		
		double media = soma / n;
		System.out.println("A média de idade dos alunos é de " + media + " anos");
		
	}
	
}
