package com.jguno.jogo;

import java.util.Scanner;

public class Jogada {
	
	private String separador = "+-----------------------------------------------+";
	private String separa = "| ";
	private String erroDigito = "|      Você digitou uma opção não valida!       |";
	private String erroDigito1 ="|               Tente novamente...              |";
	private String submenu = "| Digite a carta que usara ou [0] para sair.    |";
	private String msjSaida= "|       Obrigado por Jogar o Uno Alg3_3N!       |";
	private String subMenuSair="|     Novo jogo? De enter ou [0] para sair      |";
	private Scanner br = new Scanner(System.in);
	private String textoEntra = null;
	
	public void menuJogador(){
		System.out.println(separador);
		System.out.println(separa+"[Opção 1] - Unico Jogador vs 3 jogadores PC   "+separa);
		System.out.println(separa+"[Opção 2] - Ver relatorio de jogo, somente PC."+separa);
		System.out.println(separador);
		System.out.println(submenu);
		System.out.println(separador);
		try{
			textoEntra = br.next();
			while(textoEntra != "exit"){
				System.out.println("inicio "+textoEntra);
				if(textoEntra == "1"){
					System.out.println("Passou 1");
					jogoUsuario();
				}else if(textoEntra == "2"){
					System.out.println("Passou 2");
					jogoMaquina();
				}else if(textoEntra == "0"){
					System.out.println(separador);
					System.out.println(msjSaida);
					System.out.println(subMenuSair);
					System.out.println(separador);
					textoEntra = br.next();
					if(textoEntra == "0"){
						break;
					}else{
						System.out.println(separador);
						System.out.println(erroDigito);
						System.out.println(erroDigito1);
						System.out.println(separador);
					}
				}else{
					System.out.println(separador);
					System.out.println(erroDigito);
					System.out.println(erroDigito1);
					System.out.println(separador);
				}
				textoEntra = br.next();
			}
		}catch(Exception ex){}
	}
	
	
	/*public void jogaCarta(){
		//int jogo = 0;
		String texto = null;
		System.out.println(separador);
		System.out.println(separa+"Escolha uma opção");
		System.out.println(submenu);
		
		try{
			texto = br.readLine();
				
		}catch (Exception ex){}
			
		if(texto == "exit"){
			jogo = 01;
		}
	}*/
	
	private void jogoMaquina() {
				
	}


	public void jogoUsuario(){
		
	}
}
