package com.jguno.jogo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class menuJogo{
	
	private String separador = "+-----------------------------------------------+";
	private String separa = "| ";
	private String erroDigito = "|      Você digitou uma opção não valida!       |";
	private String erroDigito1 ="|               Tente novamente...              |";
	private String submenu = "| Digite a carta que usara ou [0] para sair.    |";
	private String msjSaida= "|       Obrigado por Jogar o Uno Alg3_3N!       |";
	private String subMenuSair="|     Novo jogo? De enter ou [0] para sair      |";
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private int textoEntra = 0;
	private String nomeJogador = null;
	
	public int menuJogador(){
		int resultado = 0;
		System.out.println(separador);
		System.out.println(separa+"[Opção 1] - Unico Jogador vs 3 jogadores PC   "+separa);
		System.out.println(separa+"[Opção 2] - Ver relatorio de jogo, somente PC."+separa);
		System.out.println(separador);
		System.out.println(submenu);
		System.out.println(separador);
		try{
			while(textoEntra != 100){
				System.out.print("| ");
				textoEntra = Integer.parseInt(br.readLine());
				if(textoEntra == 1){
					resultado = 1;
					break;
				}else if(textoEntra == 2){
					resultado = 2;
					break;
				}else if(textoEntra == 0){
					resultado = 0;
					System.out.println("ESTEVE AKI");
					break;
				}else{
					System.out.println(separador);
					System.out.println(erroDigito);
					System.out.println(erroDigito1);
					System.out.println(separador);
				}
			}
			br.close();
		}catch(Exception ex){}
		return resultado;
	}
	
	public boolean menuSair(){
		boolean resultado = false;
		System.out.println(separador);
		System.out.println(msjSaida);
		System.out.println(subMenuSair);
		System.out.println(separador);
		try{
			while(textoEntra != 100){
				textoEntra = Integer.parseInt(br.readLine());
				if(textoEntra == 1){
					resultado = true;
					break;
				}else if(textoEntra == 0){
					resultado = false;
					System.out.println("Pasou batido");
					break;
				}else if((textoEntra != 0) && (textoEntra != 1)){
					System.out.println(separador);
					System.out.println(erroDigito);
					System.out.println(erroDigito1);
					System.out.println(separador);
				}
			}
			br.close();
		}catch(Exception ex){}
		return resultado;
	}
	
	public void jogaCarta(){
		System.out.println(separador);
		System.out.println(separa+"Escolha uma opção");
		System.out.println(submenu);
	}
	
	public void jogoMaquina() {
		System.out.println(separa+"  Jogo somente PC. Começara em 3 segundo...  "+separa);
		try{	
			Thread.sleep(3*1000);
			System.out.println(separador);
			System.out.println("|   Todos os jogadores são controlados pelo PC  |");
			System.out.println(separador);
		}catch(Exception ex){}
	}

	public String jogoUsuario(){
		System.out.println(separa+"Digite o nome que devera aparecer:            "+separa);
		try{
			nomeJogador = br.readLine();
			br.close();
		}catch(Exception ex){}
		return nomeJogador;
	}
}
