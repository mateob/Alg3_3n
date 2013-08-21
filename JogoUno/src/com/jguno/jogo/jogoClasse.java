package com.jguno.jogo;

import java.util.Random;

public class jogoClasse {

	private String separador = "+-----------------------------------------------+";
	private int jogaP = 0;
	
	public void jogoSomentePC(int jogaPrimeiro){
		jogaP = jogaPrimeiro;
		boolean repete = false;
		int var = jogaP;
		while(repete != true){
			for(int i = var; i <=3;i++){
				if(i == 0){
					System.out.println("Jogador Um: ");
					try {
						Thread.sleep(2*1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}else if(i == 1){
					System.out.println("Jogador Dois: ");
					try {
						Thread.sleep(2*1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}else if(i == 2){
					System.out.println("Jogador Três: ");
					try {
						Thread.sleep(2*1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}else if(i == 3){
					System.out.println("Jogador Quatro: ");
					try {
						Thread.sleep(2*1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}else{
					System.out.println("Erro no processamento do jogo!");
					repete = true;
				}
			}
			var = 0;
		}
	}
	
	public void jogoComJogador(){
		
	}
	
	public void jogoQuemComeca(){
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
		jogoSomentePC(numeroJoga);
	}
}
