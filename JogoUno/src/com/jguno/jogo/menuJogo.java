package com.jguno.jogo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class menuJogo {
	
	private jogoClasse jogada = new jogoClasse();
	
	private String separador = "+-----------------------------------------------+";
	private String separa = "| ";
	private String erroDigito = "|      Você digitou uma opção não valida!       |";
	private String erroDigito1 ="|               Tente novamente...              |";
	private String submenu = "| Digite a carta que usara ou [0] para sair.    |";
	private String msjSaida= "|       Obrigado por Jogar o Uno Alg3_3N!       |";
	private String subMenuSair="|     Novo jogo? De enter ou [0] para sair      |";
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private int textoEntra = 0;
	@SuppressWarnings("unused")
	private String nomeJogador = null;
	
	public void menuJogador(){
		System.out.println(separador);
		System.out.println(separa+"[Opção 1] - Unico Jogador vs 3 jogadores PC   "+separa);
		System.out.println(separa+"[Opção 2] - Ver relatorio de jogo, somente PC."+separa);
		System.out.println(separador);
		System.out.println(submenu);
		System.out.println(separador);
		try{
			textoEntra = Integer.parseInt(br.readLine());
			while(textoEntra != 100){
				if(textoEntra == 1){
					jogoUsuario();
				}else if(textoEntra == 2){
					jogoMaquina();
				}else if(textoEntra == 0){
					menuSair();
					break;
				}else{
					System.out.println(separador);
					System.out.println(erroDigito);
					System.out.println(erroDigito1);
					System.out.println(separador);
				}
				textoEntra = Integer.parseInt(br.readLine());
			}
		}catch(Exception ex){}
	}
	
	public void menuSair(){
		System.out.println(separador);
		System.out.println(msjSaida);
		System.out.println(subMenuSair);
		System.out.println(separador);
		try{
			textoEntra = Integer.parseInt(br.readLine());
			while(textoEntra != 0){
				if(textoEntra == 1){
					menuJogador();
				}else if((textoEntra != 0) && (textoEntra != 1)){
					System.out.println(separador);
					System.out.println(erroDigito);
					System.out.println(erroDigito1);
					System.out.println(separador);
				}
				textoEntra = Integer.parseInt(br.readLine());
			}
		}catch(Exception ex){}
	}
	
	public void jogaCarta(){
		System.out.println(separador);
		System.out.println(separa+"Escolha uma opção");
		System.out.println(submenu);
		
	}
	
	public void jogaCartaMaquina(){
		jogada.jogoQuemComeca();
	}
	
	private void jogoMaquina() {
		System.out.println(separa+"  Jogo somente PC. Comensara em 3 segundo...  "+separa);
		try{	
			Thread.sleep(3*1000);
			System.out.println(separador);
			System.out.println("|   Todos os jogadores são controlados pelo PC  |");
			System.out.println(separador);
			jogaCartaMaquina();
		}catch(Exception ex){}
	}

	public void jogoUsuario(){
		System.out.println(separa+"Digite o nome que devera aparecer:            "+separa);
		try{
			nomeJogador = br.readLine();
			
		}catch(Exception ex){}
		
	}
}
