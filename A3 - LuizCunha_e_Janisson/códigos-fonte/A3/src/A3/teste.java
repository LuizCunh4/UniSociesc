package A3;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class teste {

	private static Scanner input = new Scanner(System.in);
	private static Random numAleatorio = new Random();
	private static List<Aluno> listaAlunos = new ArrayList<>();
	private static List<Professor> listaProfessores = new ArrayList<>();
	private static List<Curso> listaCursos = new ArrayList<>();
	private static List<Salas> listaSalas = new ArrayList<>();
	private static List<Turma> listaTurmas = new ArrayList<>();
	private static List<Aluno> alunosTurma = new ArrayList<>();;
	
	public static void main(String[] args) {
		
		int indexMenu = 0;
		
		lerProfessoresDoArquivo("c:\\dados\\ListaProfessores.txt", listaProfessores);
        lerAlunosDoArquivo("c:\\dados\\ListaAlunosEspera.txt", listaAlunos);
        lerSalasDoArquivo("c:\\dados\\ListaSalas.txt", listaSalas);
        lerCursosDoArquivo("c:\\dados\\ListaCursos.txt", listaCursos);
        lerTurmasDoArquivo("c:\\dados\\ListaTurmas.txt", listaTurmas);
		
		//MenuPrincipal
		while(indexMenu != 3) {
			
            exibirMenuPrincipal();
            
            //TrechoParaEvitarBugsCasoUsuarioDigiteUmCaractere
            while (!input.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                input.next(); 
            }
            
            indexMenu = input.nextInt();
            limparConsole(); //LimparConsole

            switch (indexMenu) {
            
            	//MenuParaCadastroDeDados
                case 1:
                	while(indexMenu != 6) {
	                    exibirMenuCadastro();
	                    
	                    //TrechoParaEvitarBugsCasoUsuarioDigiteUmCaractere
	                    while (!input.hasNextInt()) {
	                        System.out.println("Entrada inválida. Por favor, digite um número.");
	                        input.next(); 
	                    }
	                    
	                    indexMenu = input.nextInt();
	                    limparConsole(); //LimparConsole
	                    
	                    switch (indexMenu) {
	                    	case 1:
	                    		do {
	                    			//CadastroAluno
	                    			cadastrarAluno();
	                    			//TrechoMenu
	                    	        System.out.println("1. Cadastrar novo Aluno");
	                    	        System.out.println("2. Sair");
	                    	        System.out.print("Escolha uma opção: ");
	                    	        //TrechoParaEvitarBugsCasoUsuarioDigiteUmCaractere
	        	                    while (!input.hasNextInt()) {
	        	                        System.out.println("Entrada inválida. Por favor, digite um número.");
	        	                        input.next(); 
	        	                    }
	                    	        indexMenu = input.nextInt();
	                    		}while(indexMenu != 2);
	                    		limparConsole(); //LimparConsole
	                    	break;
	                    		
	                    	case 2:
	                    		do {
		                    		//CadastroProfessor
	                    			cadastrarProfessor();
	                    			//TrechoMenu
	                    	        System.out.println("1. Cadastrar novo Professor");
	                    	        System.out.println("2. Sair");
	                    	        System.out.print("Escolha uma opção: ");
	                    	        //TrechoParaEvitarBugsCasoUsuarioDigiteUmCaractere
	        	                    while (!input.hasNextInt()) {
	        	                        System.out.println("Entrada inválida. Por favor, digite um número.");
	        	                        input.next(); 
	        	                    }
	                    	        indexMenu = input.nextInt();
	                    		}while(indexMenu != 2);
	                    		limparConsole(); //LimparConsole
	                    	break;
	                    		
	                    	case 3:
	                    		do {
		                    		//CadastroCurso
	                    			cadastrarCurso();
	                    			//TrechoMenu
	                    	        System.out.println("1. Cadastrar novo Curso");
	                    	        System.out.println("2. Sair");
	                    	        System.out.print("Escolha uma opção: ");
	                    	        //TrechoParaEvitarBugsCasoUsuarioDigiteUmCaractere
	        	                    while (!input.hasNextInt()) {
	        	                        System.out.println("Entrada inválida. Por favor, digite um número.");
	        	                        input.next(); 
	        	                    }
	                    	        indexMenu = input.nextInt();
	                    		}while(indexMenu != 2);
	                    		limparConsole(); //LimparConsole
	                    	break;
	                    		
	                    	case 4:
	                    		do {
		                    		//CadastroSala
	                    			cadastrarSala();
	                    			//TrechoMenu
	                    	        System.out.println("1. Cadastrar nova Sala");
	                    	        System.out.println("2. Sair");
	                    	        System.out.print("Escolha uma opção: ");
	                    	        //TrechoParaEvitarBugsCasoUsuarioDigiteUmCaractere
	        	                    while (!input.hasNextInt()) {
	        	                        System.out.println("Entrada inválida. Por favor, digite um número.");
	        	                        input.next(); 
	        	                    }
	                    	        indexMenu = input.nextInt();
	                    		}while(indexMenu != 2);
	                    		limparConsole(); //LimparConsole
	                    	break;
	                    		
	                    	case 5:
	                    	    //TrechoMenu
	                    	    System.out.println("Antes de cadastrar uma turma, certifique-se de que você já tenha cadastrado alunos, professores, cursos e salas!!");
	                    	    System.out.println("1. Cadastrar Turma");
	                    	    System.out.println("2. Sair");
	                    	    System.out.print("Escolha uma opção: ");
	                    	    
	                    	    //TrechoParaEvitarBugsCasoUsuarioDigiteUmCaractere
	                    	    while (!input.hasNextInt()) {
	                    	        System.out.println("Entrada inválida. Por favor, digite um número.");
	                    	        input.next(); 
	                    	    }
	                    	    indexMenu = input.nextInt();
	                    	    
	                    	    switch (indexMenu) {
	                    	        case 1:
	                    	            //CadastroTurma
	                    	            cadastrarTurma();
	                    	            //TrechoMenu
	                    	            System.out.println("1. Cadastrar nova Turma");
	                    	            System.out.println("2. Sair");
	                    	            System.out.print("Escolha uma opção: ");
	                    	            
	                    	            //TrechoParaEvitarBugsCasoUsuarioDigiteUmCaractere
	                    	            while (!input.hasNextInt()) {
	                    	                System.out.println("Entrada inválida. Por favor, digite um número.");
	                    	                input.next(); 
	                    	            }
	                    	            indexMenu = input.nextInt();
	                    	            limparConsole(); //LimparConsole
	                    	        break;
	                    	        case 2:
	                    	        	System.out.println("\nRetornando ao menu principal...");
	                    	        break;
	                    	        default:
	                    	        	System.out.println("\nOpção inválida. Por favor, escolha novamente.");
	                    	        break;
	                    	    }
	                    	    break;
	                    		
	                    	case 6:
	                    		System.out.println("\nRetornando ao menu principal...");
	                    	break;
	                    		
	                    	default:
	                            System.out.println("\nOpção inválida. Por favor, escolha novamente.");
	                        break;
	                    }
                	}break;//BreakCase1
                	
                //MenuParaListagemDeDados
                case 2:
                	while(indexMenu != 6) {
	                    exibirMenuListagem();
	                    
	                    //TrechoParaEvitarBugsCasoUsuarioDigiteUmCaractere
	                    while (!input.hasNextInt()) {
	                        System.out.println("Entrada inválida. Por favor, digite um número.");
	                        input.next(); 
	                    }
	                    
	                    indexMenu = input.nextInt();
	                    
	                    switch (indexMenu) {
	                    	case 1:
	                    		limparConsole(); //LimparConsole
	                    		do {
	                    			//ListagemDeAlunos
		                    		exibirListaAlunos();
	                    			//TrechoMenu
	                    	        System.out.println("1. Sair");
	                    	        System.out.print("Escolha uma opção: ");
	                    	        //TrechoParaEvitarBugsCasoUsuarioDigiteUmCaractere
	        	                    while (!input.hasNextInt()) {
	        	                        System.out.println("Entrada inválida. Por favor, digite um número.");
	        	                        input.next(); 
	        	                    }
	                    	        indexMenu = input.nextInt();
	                    		}while(indexMenu != 1); 
	                    		limparConsole(); //LimparConsole
	                    	break;
	                    		
	                    	case 2:
	                    		limparConsole(); //LimparConsole
	                    		do {
	                    			//ListagemDeProfessores
		                    		exibirListaProfessores();
	                    			//TrechoMenu
	                    	        System.out.println("1. Sair");
	                    	        System.out.print("Escolha uma opção: ");
	                    	        //TrechoParaEvitarBugsCasoUsuarioDigiteUmCaractere
	        	                    while (!input.hasNextInt()) {
	        	                        System.out.println("Entrada inválida. Por favor, digite um número.");
	        	                        input.next(); 
	        	                    }
	                    	        indexMenu = input.nextInt();
	                    		}while(indexMenu != 1);
	                    		limparConsole(); //LimparConsole
	                    	break;
	                    		
	                    	case 3:
	                    		limparConsole(); //LimparConsole
	                    		do {
	                    			//ListagemDeCursos
		                    		exibirListaCursos();
	                    			//TrechoMenu
	                    	        System.out.println("1. Sair");
	                    	        System.out.print("Escolha uma opção: ");
	                    	        //TrechoParaEvitarBugsCasoUsuarioDigiteUmCaractere
	        	                    while (!input.hasNextInt()) {
	        	                        System.out.println("Entrada inválida. Por favor, digite um número.");
	        	                        input.next(); 
	        	                    }
	                    	        indexMenu = input.nextInt();
	                    		}while(indexMenu != 1);
	                    		limparConsole(); //LimparConsole
	                    	break;
	                    		
	                    	case 4:
	                    		limparConsole(); //LimparConsole
	                    		do {
	                    			//ListagemDeSalas
		                    		exibirListaSalas();
	                    			//TrechoMenu
	                    	        System.out.println("1. Sair");
	                    	        System.out.print("Escolha uma opção: ");
	                    	        //TrechoParaEvitarBugsCasoUsuarioDigiteUmCaractere
	        	                    while (!input.hasNextInt()) {
	        	                        System.out.println("Entrada inválida. Por favor, digite um número.");
	        	                        input.next(); 
	        	                    }
	                    	        indexMenu = input.nextInt();
	                    		}while(indexMenu != 1);
	                    		limparConsole(); //LimparConsole
	                    	break;
	                    		
	                    	case 5:
	                    		limparConsole(); //LimparConsole
	                    		do {
	                    			//ListagemDeSalas
		                    		exibirListaTurmas();
	                    			//TrechoMenu
	                    	        System.out.println("1. Sair");
	                    	        System.out.print("Escolha uma opção: ");
	                    	        //TrechoParaEvitarBugsCasoUsuarioDigiteUmCaractere
	        	                    while (!input.hasNextInt()) {
	        	                        System.out.println("Entrada inválida. Por favor, digite um número.");
	        	                        input.next(); 
	        	                    }
	                    	        indexMenu = input.nextInt();
	                    		}while(indexMenu != 1);
	                    		limparConsole(); //LimparConsole
	                    	break;
	                    		
	                    	case 6:
	                    		System.out.println("\nRetornando ao menu principal...");
	                    		break;
	                    		
	                    	default:
	                            System.out.println("\nOpção inválida. Por favor, escolha novamente.");
	                            break;
	                    }
	                 limparConsole(); //LimparConsole
                	}break;//BreakCase2MenuListagem     	
                    
                //FinalizandoSistema
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                    
                default:
                    System.out.println("\nOpção inválida. Por favor, escolha novamente.");
                    break;
            }
        }
    }

	//MétodosMenu
    public static void exibirMenuPrincipal() {
    	System.out.println("\nSistema para controle de dados");
    	System.out.println("------------------------------");
        System.out.println(" 	   Menu Principal 	  ");
        System.out.println("1. Cadastrar");
        System.out.println("2. Listar");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
    }
    
    public static void exibirMenuCadastro() {
    	System.out.println("\nSistema para cadastro de dados");
    	System.out.println("------------------------------");
        System.out.println(" 	  Menu Cadastro			  ");
        System.out.println("1. Cadastrar Aluno");
        System.out.println("2. Cadastrar Professor");
        System.out.println("3. Cadastrar Curso");
        System.out.println("4. Cadastrar Sala");
        System.out.println("5. Cadastrar Turma");
        System.out.println("6. Sair");
        System.out.print("Escolha uma opção: ");
    }
    
    public static void exibirMenuListagem() {
    	System.out.println("\nSistema para listagem de dados");
    	System.out.println("------------------------------");
        System.out.println(" 	  Menu Listagem		  ");
        System.out.println("1. Listar Alunos em espera");
        System.out.println("2. Listar Professores");
        System.out.println("3. Listar Cursos");
        System.out.println("4. Listar Salas");
        System.out.println("5. Listar Turmas");
        System.out.println("6. Sair");
        System.out.print("Escolha uma opção: ");
    }
    
    //MétodoLimparConsole
	   public final static void limparConsole(){
	        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	   }
    
    //MétodoParaCadastroDeAlunos
	   public static void cadastrarAluno() {
		    System.out.println("\nCadastrar novo aluno, insira os dados abaixo:");

		    String caminho = "c:\\dados\\ListaAlunosEspera.txt";
		    FileWriter arq;

		    input.nextLine();

		    System.out.print("Nome: ");				String _nome = input.nextLine();
		    System.out.print("Cpf: ");				String _cpf = input.nextLine();
		    System.out.print("Endereço: ");			String _endereco = input.nextLine();
		    System.out.print("Email: ");			String _email = input.nextLine();
		    System.out.print("Telefone: ");			String _telefone = input.nextLine();
		    int _matricula = numAleatorio.nextInt(10000);

		    Aluno novoAluno = new Aluno(_nome, _cpf, _endereco, _email, _telefone, _matricula);

		    //VerificaSeOAlunoJáExisteNaLista
		    boolean alunoExistente = false;
		    for (Aluno aluno : listaAlunos) {
		        if (aluno.getCpf().equals(_cpf)) {
		            alunoExistente = true;
		            break;
		        }
		    }

		    if (!alunoExistente) {
		        listaAlunos.add(novoAluno);

		        try {
		            //LimpaOConteúdoDoArquivoAntesDeAdicionarOsAlunosNovamente
		            arq = new FileWriter(caminho);
		            PrintWriter gravarArq = new PrintWriter(arq);
		            for (Aluno aluno : listaAlunos) {
		                gravarArq.println(aluno);
		            }
		            arq.close();
		        } catch (IOException e) {
		            System.out.printf("Erro na tentativa de escrever no arquivo " + caminho + "\n");
		        }

		        System.out.println("Aluno cadastrado com sucesso!\n");
		    } else {
		        System.out.println("Já existe um aluno com o CPF informado. Cadastro não realizado.\n");
		    }
		}
	
	//MétodoParaListagemDeAlunos
		public static void exibirListaAlunos() {
	        System.out.println("====== Lista de Alunos Em Espera ======");
	        for(Aluno aluno: listaAlunos) {
	        	System.out.println(aluno);
	        }
	        System.out.println("=======================================");
	    }
	
	//MétodoParaCadastroDeProfessor
		public static void cadastrarProfessor() {
		    System.out.println("\nCadastrar novo professor, insira os dados abaixo:");

		    String caminho = "c:\\dados\\ListaProfessores.txt";
		    FileWriter arq;

		    input.nextLine();

		    System.out.print("Nome: ");				String _nome = input.nextLine();
		    System.out.print("Cpf: ");				String _cpf = input.nextLine();
		    System.out.print("Endereço: ");			String _endereco = input.nextLine();
		    System.out.print("Email: ");			String _email = input.nextLine();
		    System.out.print("Telefone: ");			String _telefone = input.nextLine();
		    int _codigoF = numAleatorio.nextInt(10000);
		    String _codigoFString = String.valueOf(_codigoF);

		    Professor novoProfessor = new Professor(_nome, _cpf, _endereco, _email, _telefone, _codigoFString);

		    //VerificaSeOProfessorJáExisteNaLista
		    boolean professorExistente = false;
		    for (Professor professor : listaProfessores) {
		        if (professor.getCpf().equals(_cpf)) {
		            professorExistente = true;
		            break;
		        }
		    }

		    if (!professorExistente) {
		        listaProfessores.add(novoProfessor);

		        try {
		            arq = new FileWriter(caminho);
		            PrintWriter gravarArq = new PrintWriter(arq);
		            for (Professor professor : listaProfessores) {
		                gravarArq.println(professor);
		            }
		            arq.close();
		        } catch (IOException e) {
		            System.out.printf("Erro na tentativa de escrever no arquivo " + caminho + "\n");
		        }

		        System.out.println("Professor cadastrado com sucesso!\n");
		    } else {
		        System.out.println("Já existe um professor com o CPF informado. Cadastro não realizado.\n");
		    }
		}
		
	//MétodoParaListagemDeProfessores
		public static void exibirListaProfessores() {
	        System.out.println("======== Lista de Professores ========");
	        for(Professor professor: listaProfessores) {
	        	System.out.println(professor);
	        }
	        System.out.println("======================================");
	    }
		
	//MétodoParaCadastroDeCursos
		public static void cadastrarCurso() {
		    System.out.println("\nCadastrar novo curso, insira os dados abaixo:");

		    String caminho = "c:\\dados\\ListaCursos.txt";
		    FileWriter arq;

		    input.nextLine();

		    System.out.print("Nome do Curso: ");		String _nomeCurso = input.nextLine();
		    System.out.print("Descrição: ");			String _descCurso = input.nextLine();
		    System.out.print("Carga Horária: ");
		    // TrechoParaEvitarBugsCasoUsuarioDigiteUmCaractere
		    while (!input.hasNextInt()) {
		        System.out.println("Entrada inválida. Por favor, digite um número.");
		        System.out.print("Carga Horária: ");
		        input.next();
		    }
		    int _cargaHoraria = input.nextInt();
		    int _codigoCurso = numAleatorio.nextInt(10000);

		    Curso novoCurso = new Curso(_nomeCurso, _codigoCurso, _cargaHoraria, _descCurso);
		    listaCursos.add(novoCurso);

		    try {
		        arq = new FileWriter(caminho, true);
		        PrintWriter gravarArq = new PrintWriter(arq);

		        gravarArq.println(novoCurso);

		        arq.close();
		    } catch (IOException e) {
		        System.out.printf("Erro na tentativa de escrever no arquivo " + caminho + "\n");
		    }

		    System.out.println("Curso cadastrado com sucesso!\n");
		}
				
	//MétodoParaListagemDeCursos
		public static void exibirListaCursos() {
			System.out.println("=========== Lista de Cursos ==========");
			for(Curso curso: listaCursos) {
	        	System.out.println(curso);
	        }
			System.out.println("=======================================");
		}
		
	//MétodoParaCadastroDeSalas
		public static void cadastrarSala() {
		    System.out.println("\nCadastrar nova Sala, insira os dados abaixo:");

		    String caminho = "c:\\dados\\ListaSalas.txt";
		    FileWriter arq;

		    input.nextLine();

		    System.out.print("Nome da Sala: ");		String _nomeSala = input.nextLine();
		    System.out.print("Local: ");			String _localSala = input.nextLine();

		    Salas novaSala = new Salas(_nomeSala, _localSala);

		    try {
		        arq = new FileWriter(caminho, true);
		        PrintWriter gravarArq = new PrintWriter(arq);

		        gravarArq.println(novaSala);

		        arq.close();
		    } catch (IOException e) {
		        System.out.printf("Erro na tentativa de escrever no arquivo " + caminho + "\n");
		    }

		    listaSalas.add(novaSala);

		    System.out.println("Sala cadastrada com sucesso!\n");
		}
				
	//MétodoParaListagemDeSalas
		public static void exibirListaSalas() {
			System.out.println("=========== Lista de Salas ==========");
			for(Salas sala: listaSalas) {
	        	System.out.println(sala);
	        }
			System.out.println("=======================================");
		}
		
	//MétodoParaCadastroDeTurmas
		public static void cadastrarTurma() {
			 System.out.println("\nCadastrar nova Turma, insira os dados abaixo:");

			String caminho = "c:\\dados\\ListaTurmas.txt";
			FileWriter arq;

			input.nextLine();

			System.out.print("Nome da turma: ");		String nomeTurma = input.nextLine();
			
			//PegandoERemovendoAlunosDaListaDeEsperaAteAtingirACapacidadeMaxima
			final int capacidadeAlunos = 15;
			int alunosAdicionados = 0;
			while (alunosAdicionados < capacidadeAlunos && !listaAlunos.isEmpty()) {
			    Aluno alunoRemovido = listaAlunos.remove(0);
			    alunosTurma.add(alunoRemovido);
			    alunosAdicionados++;
			}
			
			removerAlunosListaEspera(alunosTurma);
			
			//SelecionandoProfessorDaLista
			System.out.println("Escolha um professor para a turma:");
	        for (int i = 0; i < listaProfessores.size(); i++) {
	            System.out.println((i + 1) + ". " + listaProfessores.get(i).getNome());
	        }

	        int escolhaProfessor = obterEscolhaProfessor(input, listaProfessores.size());
	        Professor professorEscolhido = listaProfessores.get(escolhaProfessor - 1);
			
	        //SelecionandoCursoDaLista
			System.out.println("Escolha um curso para a turma:");
	        for (int i = 0; i < listaCursos.size(); i++) {
	            System.out.println((i + 1) + ". " + listaCursos.get(i).getNomeCurso());
	        }

	        int escolhaCurso = obterEscolhaCurso(input, listaCursos.size());
	        Curso cursoEscolhido = listaCursos.get(escolhaCurso - 1);
			
	        //SelecionandoSalaDaLista
			System.out.println("Escolha uma sala para a turma:");
	        for (int i = 0; i < listaSalas.size(); i++) {
	            System.out.println((i + 1) + ". " + listaSalas.get(i).getNome());
	        }

	        int escolhaSala = obterEscolhaSala(input, listaSalas.size());
	        Salas salaEscolhida = listaSalas.get(escolhaSala - 1);
	        
	        //SelecionandoDiaDaSemana
	        String diaSemana = null;
	        
	        System.out.println("Selecione um dia da semana (segunda a sexta-feira):");
	        boolean escolhaValida = false;
	        
	        while (!escolhaValida) {
	            System.out.print("Digite o dia da semana: ");
	            diaSemana = input.nextLine().toLowerCase();

	            switch (diaSemana) {
	                case "segunda":
	                case "terça":
	                case "quarta":
	                case "quinta":
	                case "sexta":
	                    escolhaValida = true;
	                    break;
	                default:
	                    System.out.println("Escolha inválida. Por favor, tente novamente.");
	            }
	        }
	        
	        boolean salaDisponivel = true;
	        for (Turma turma : listaTurmas) {
	            if (turma.getSala().equals(salaEscolhida) && turma.getDiaDaSemana().equals(diaSemana)) {
	                salaDisponivel = false;
	                break;
	            }
	        }

	        if (!salaDisponivel) {
	            System.out.println("Erro: A sala escolhida já está ocupada no dia " + diaSemana);
	            return;
	        }

	        //VerificarSeOProfessorJEstásOcupaNoMesmoDia
	        boolean professorDisponivel = true;
	        for (Turma turma : listaTurmas) {
	            if (turma.getProfessor().equals(professorEscolhido) && turma.getDiaDaSemana().equals(diaSemana)) {
	                professorDisponivel = false;
	                break;
	            }
	        }

	        if (!professorDisponivel) {
	            System.out.println("Erro: O professor já está ocupado no dia " + diaSemana);
	            return;
	        }

	        Turma novaTurma = new Turma(alunosTurma, professorEscolhido, cursoEscolhido, salaEscolhida, diaSemana, nomeTurma);
	        listaTurmas.add(novaTurma);

	        try {
	            arq = new FileWriter(caminho, false); //AbrirArquivoEmModoDeEscritaELimparSeuConteúdo
	            PrintWriter gravarArq = new PrintWriter(arq);
	            for (Turma turma : listaTurmas) {
	                gravarArq.println(turma);
	            }
	            arq.close();
	            System.out.println("Turma cadastrada com sucesso!\n");
	        } catch (IOException e) {
	            System.out.printf("Erro na tentativa de criar ou gravar no arquivo " + caminho + "\n");
	        }

	        //ApósGravarATurmaNoArquivoChamamosOMétodoParaLerNovamenteAsTurmasDoArquivo
	        listaTurmas = lerTurmasDoArquivo(caminho, listaTurmas);
	    }
	        
	//MétodoParaListagemDeSalas
		public static void exibirListaTurmas() {
			System.out.println("=========== Lista de Turmas ==========");
			String caminho = "c:\\dados\\ListaTurmas.txt";

            try {
              FileReader arq = new FileReader(caminho);
              BufferedReader lerArq = new BufferedReader(arq);

              String linha = lerArq.readLine();
              while (linha != null) {
                System.out.printf("%s\n", linha);

                linha = lerArq.readLine();
                  }

              arq.close();
            } catch (IOException e) {
                System.err.printf("Erro na abertura do arquivo: %s.\n",
                e.getMessage());
            }

			System.out.println("=======================================");
		}
		
	//MétodoParaEscolherProfessorDaLista
	    public static int obterEscolhaProfessor(Scanner scanner, int maxEscolhas) {
	        int escolha;

	        do {
	            System.out.print("Escolha um professor (1-" + maxEscolhas + "): ");
	            while (!scanner.hasNextInt()) {
	                System.out.println("Entrada inválida. Digite um número válido.");
	                scanner.next();
	            }
	            escolha = scanner.nextInt();
	        } while (escolha < 1 || escolha > maxEscolhas);

	        return escolha;
	    }
	    
	//MétodoParaEscolherCursoDaLista
	    public static int obterEscolhaCurso(Scanner scanner, int maxEscolhas) {
	        int escolha;

	        do {
	            System.out.print("Escolha um curso (1-" + maxEscolhas + "): ");
	            while (!scanner.hasNextInt()) {
	                System.out.println("Entrada inválida. Digite um número válido.");
	                scanner.next();
	            }
	            escolha = scanner.nextInt();
	        } while (escolha < 1 || escolha > maxEscolhas);

	        return escolha;
	    }
	    
	//MétodoParaEscolherSalaDaLista
	    public static int obterEscolhaSala(Scanner scanner, int maxEscolhas) {
	        int escolha;

	        do {
	            System.out.print("Escolha uma Sala (1-" + maxEscolhas + "): ");
	            while (!scanner.hasNextInt()) {
	                System.out.println("Entrada inválida. Digite um número válido.");
	                scanner.next();
	            }
	            escolha = scanner.nextInt();
	        } while (escolha < 1 || escolha > maxEscolhas);

	        return escolha;
	    }
	    
	  //MétodoParaLerArquivoEAdicionarAListaAlunos
	    public static List<Aluno> lerAlunosDoArquivo(String caminhoArquivo, List<Aluno> listaAlunos) {
	        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
	            String linha;
	            while ((linha = br.readLine()) != null) {
	                if (!linha.trim().isEmpty()) {
	                    String[] partes = linha.split(", ");

	                    if (partes.length >= 6) {
	                        String nome = partes[0].substring(partes[0].indexOf(":") + 2);
	                        String cpf = partes[1].substring(partes[1].indexOf(":") + 2);
	                        String endereco = partes[2].substring(partes[2].indexOf(":") + 2);
	                        String email = partes[3].substring(partes[3].indexOf(":") + 2);
	                        String telefone = partes[4].substring(partes[4].indexOf(":") + 2);
	                        int matricula = Integer.parseInt(partes[5].substring(partes[5].indexOf(":") + 2));

	                        Aluno aluno = new Aluno(nome, cpf, endereco, email, telefone, matricula);
	                        listaAlunos.add(aluno);
	                    } else {
	                        System.out.println("Formato de linha inválido: " + linha);
	                    }
	                }
	            }
	        } catch (IOException e) {
	           
	        }

	        return listaAlunos;
	    }
	    
	//MétodoParaLerArquivoEAdicionarAListaProfessores
	    public static List<Professor> lerProfessoresDoArquivo(String caminhoArquivo, List<Professor> listaProfessores) {

	    	try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
	            String linha;
	            while ((linha = br.readLine()) != null) {
	                String[] partes = linha.split(", ");

	                String nome = partes[0].substring(partes[0].indexOf(":") + 2);
	                String cpf = partes[1].substring(partes[1].indexOf(":") + 2);
	                String endereco = partes[2].substring(partes[2].indexOf(":") + 2);
	                String email = partes[3].substring(partes[3].indexOf(":") + 2);
	                String telefone = partes[4].substring(partes[4].indexOf(":") + 2);
	                String codigoFuncionario = partes[5].substring(partes[5].indexOf(":") + 2);

	                Professor professor = new Professor(nome, cpf, endereco, email, telefone, codigoFuncionario);
	                listaProfessores.add(professor);
	            }
	        } catch (IOException e) {
	            
	        }

	        return listaProfessores;
	    }
	    
	  //MétodoParaLerArquivoEAdicionarAListaCursos
	    public static List<Curso> lerCursosDoArquivo(String caminhoArquivo, List<Curso> listaCursos) {
	        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
	            String linha;
	            while ((linha = br.readLine()) != null) {
	                String[] partes = linha.split(", ");

	                if (partes.length == 4) {
	                    String nomeCurso = partes[0].substring(partes[0].indexOf(":") + 1).trim();
	                    int codigoCurso = Integer.parseInt(partes[1].substring(partes[1].indexOf(":") + 1).trim());
	                    String cargaHorariaStr = partes[2].substring(partes[2].indexOf(":") + 1).trim();
	                    String desc = partes[3].substring(partes[3].indexOf(":") + 1).trim();

	                    cargaHorariaStr = cargaHorariaStr.replaceAll("[a-zA-Z ]", "");
	                    int cargaHoraria = 0;
	                    try {
	                        cargaHoraria = Integer.parseInt(cargaHorariaStr);
	                    } catch (NumberFormatException e) {
	                        System.out.println("Formato inválido para a carga horária: " + cargaHorariaStr);
	                    }

	                    Curso curso = new Curso(nomeCurso, codigoCurso, cargaHoraria, desc);
	                    listaCursos.add(curso);
	                } else {
	                    System.out.println("Formato de linha inválido: " + linha);
	                }
	            }
	        } catch (IOException e) {
	            
	        }

	        return listaCursos;
	    }

	    
	  //MétodoParaLerArquivoEAdicionarAListaSalas
	    public static List<Salas> lerSalasDoArquivo(String caminhoArquivo, List<Salas> listaSalas) {

	    	try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
	            String linha;
	            while ((linha = br.readLine()) != null) {
	                String[] partes = linha.split(", ");

	                String nomeSala = partes[0].substring(partes[0].indexOf(":") + 2);
	                String local = partes[1].substring(partes[1].indexOf(":") + 2);


	                Salas sala = new Salas(nomeSala, local);
	                listaSalas.add(sala);
	            }
	        } catch (IOException e) {
	            
	        }

	        return listaSalas;
	    }
	    
	//ParaLerArquivoEAdicionarAListaTurmas
	    public static List<Turma> lerTurmasDoArquivo(String caminhoArquivo, List<Turma> listaTurmas) {
	    	try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(caminhoArquivo), "UTF-8"))) {
	            String linha;
	            String nomeTurma = null;
	            String professor = null;
	            String curso = null;
	            String sala = null;
	            String diaHorario = null;
	            boolean leuDiaHorario = false;
	            List<Aluno> alunos = new ArrayList<>();

	            while ((linha = br.readLine()) != null) {
	                if (linha.startsWith("Turma: ")) {
	                    if (nomeTurma != null) {
	                        Turma turma = new Turma(alunos, new Professor(professor), new Curso(curso), new Salas(sala),
	                                diaHorario, nomeTurma);
	                        listaTurmas.add(turma);
	                        alunos = new ArrayList<>(); //ReiniciaAListaDeAlunosParaAPróximaTurma
	                    }

	                    nomeTurma = linha.substring(linha.indexOf(":") + 2);
	                } else if (linha.startsWith("Professor: ")) {
	                    professor = linha.substring(linha.indexOf(":") + 2);
	                } else if (linha.startsWith("Curso: ")) {
	                    curso = linha.substring(linha.indexOf(":") + 2);
	                } else if (linha.startsWith("Sala: ")) {
	                    sala = linha.substring(linha.indexOf(":") + 2);
	                } else if (linha.startsWith("Dia e horário: ") && !leuDiaHorario) {
	                    diaHorario = linha.substring(linha.indexOf(":") + 2);
	                    leuDiaHorario = true;
	                } else if (linha.startsWith("Nome: ")) {
	                    String nome = null;
	                    String cpf = null;
	                    String endereco = null;
	                    String email = null;
	                    String telefone = null;
	                    String matriculaStr = null;

	                    //UtilizeExpressõesRegularesParaExtrairAsInformaçõesDaLinha
	                    Pattern pattern = Pattern.compile("Nome: (.*?), Cpf: (.*?), Endereço: (.*?), E-mail: (.*?), Telefone: (.*?), Matrícula: (\\d+)");
	                    Matcher matcher = pattern.matcher(linha);
	                    if (matcher.find()) {
	                        nome = matcher.group(1);
	                        cpf = matcher.group(2);
	                        endereco = matcher.group(3);
	                        email = matcher.group(4);
	                        telefone = matcher.group(5);
	                        matriculaStr = matcher.group(6);
	                    }

	                    if (nome != null && cpf != null && endereco != null && email != null && telefone != null
	                            && matriculaStr != null && isNumeric(matriculaStr.trim())) {
	                        int matricula = Integer.parseInt(matriculaStr.trim());
	                        Aluno aluno = new Aluno(nome, cpf, endereco, email, telefone, matricula);
	                        alunos.add(aluno);
	                    } else {
	                        //System.out.println("Formato inválido na linha: " + linha);
	                    }
	                }
	            }

	            //AdicionaAUltimaTurmaAListaCasoExista
	            if (nomeTurma != null) {
	                Turma turma = new Turma(alunos, new Professor(professor), new Curso(curso), new Salas(sala),
	                        diaHorario, nomeTurma);
	                listaTurmas.add(turma);
	            }
	        } catch (IOException e) {
	            
	        }

	        return listaTurmas;
	    }

	  //MétodoParaValidarString
	    public static boolean isNumeric(String str) {
	        if (str == null || str.length() == 0) {
	            return false;
	        }
	        for (char c : str.toCharArray()) {
	            if (!Character.isDigit(c)) {
	                return false;
	            }
	        }
	        return true;
	    }

	//MétodoParaRemoverAlunosDaListaDeEspera
	    public static void removerAlunosListaEspera(List<Aluno> alunosRemovidos) {
	        String caminho = "c:\\dados\\ListaAlunosEspera.txt";
	        try {
	            FileWriter arq = new FileWriter(caminho);
	            PrintWriter gravarArq = new PrintWriter(arq);

	            for (Aluno aluno : listaAlunos) {
	                gravarArq.println(aluno);
	            }

	            arq.close();
	        } catch (IOException e) {
	            System.out.println("Erro na tentativa de atualizar o arquivo " + caminho);
	        }
	    }
}
