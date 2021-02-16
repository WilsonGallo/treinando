package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		/*new Aluno() é uma instancia (Criação de Objeto)*/
		/*aluno1 é uma referência para o objeto*/
		Aluno aluno1 = new Aluno();/*Aqui sera o Joao*/
		aluno1.setNome("João da Silva");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("18/10/1987");
		aluno1.setRegistroGeral("44554.4544.545");
		aluno1.setNumeroCpf("542.458.245.62");
		aluno1.setNomeMae("Shirlei");
		aluno1.setNomePai("Antônio");
		aluno1.setDataMatricula("10/01/2019");
		aluno1.setSerieMatriculado("5");
		aluno1.setNomeEscola("Escola JDev Treinamentos");
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);
		
		System.out.println("Nome é = " + aluno1.getNome());
		System.out.println("Idade = " + aluno1.getIdade());
		System.out.println("Nascimento é = " + aluno1.getDataNascimento());
		System.out.println("Méida de notas é :" + aluno1.getMediaNota());
		/*Utilização de operador ternario (? "Aprovado" : "Reprovado")*/
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado2 = " + aluno1.getAlunoAprovado2());
/*============================================================================*/
		System.out.println("-------------------------------------");
		
		Aluno aluno2 = new Aluno();/*Aqui sera o Pedro*/
		aluno2.setNome("Pedro");
		aluno2.setIdade(40);
		aluno2.setDataNascimento("10/10/1974");
		
		
		System.out.println("Nome é = " + aluno2.getNome());
		System.out.println("Idade = " + aluno2.getIdade());
		System.out.println("Nascimento é = " + aluno2.getDataNascimento());
		
		/*=====================================================================*/
		Aluno aluno3 = new Aluno();/*Aqui sera o Alex*/
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 50);
	}

}