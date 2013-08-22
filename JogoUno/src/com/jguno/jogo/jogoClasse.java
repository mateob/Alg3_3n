package com.jguno.jogo;

import java.util.Random;

public class jogoClasse{
	
	private String separador = "+-----------------------------------------------+";
	
	public void jogoComJogador(){
		
	}
	
	public int jogoQuemComeca(){
		Random rod = new Random();
		int numeroJoga = rod.nextInt(3);
		if(numeroJoga == 0){
			System.out.println("| Ordem na cual os jogadores começaram:         |\n" +
					"| Primeiro a jogar : JogadorUm                  |\n" +
					"| Segundo a jogar  : JogadorDois                |\n" +
					"| Terceiro a jogar : JogadorTrês                |\n" +
					"| Quarto a jogar   : JogadorQuatro              |");
			System.out.println(separador);
		}else if(numeroJoga == 1){
			System.out.println("| Ordem na cual os jogadores começaram:         |\n" +
					"| Primeiro a jogar : JogadorDois                |\n" +
					"| Segundo a jogar  : JogadorTrês                |\n" +
					"| Terceiro a jogar : JogadorQuatro              |\n" +
					"| Quarto a jogar   : JogadorUm                  |");
			System.out.println(separador);
		}else if(numeroJoga == 2){
			System.out.println("| Ordem na cual os jogadores começaram:         |\n" +
					"| Primeiro a jogar : JogadorTrês                |\n" +
					"| Segundo a jogar  : JogadorQuatro              |\n" +
					"| Terceiro a jogar : JogadorUm                  |\n" +
					"| Quarto a jogar   : JogadorDois                |");
			System.out.println(separador);
		}else if(numeroJoga == 3){
			System.out.println("| Ordem na cual os jogadores começaram:         |\n" +
					"| Primeiro a jogar : JogadorQuatro              |\n" +
					"| Segundo a jogar  : JogadorUm                  |\n" +
					"| Terceiro a jogar : JogadorDois                |\n" +
					"| Quarto a jogar   : JogadorTrês                |");
			System.out.println(separador);
		}else{
			System.out.println("Erro na hordem de jogadores");
		}
		return numeroJoga;
	}
}
