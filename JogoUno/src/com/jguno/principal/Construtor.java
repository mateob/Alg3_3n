package com.jguno.principal;

import java.util.ArrayList;
import java.util.Collections;

import com.jguno.classes.Baralho;
import com.jguno.classes.baralhoFactory;
import com.jguno.classes.mesa;
import com.jguno.classes.mesaFactory;
import com.jguno.jogadores.jogaUm;
import com.jguno.jogadores.jogaDois;
import com.jguno.jogadores.jogaTres;
import com.jguno.jogadores.jogaQuatro;
import com.jguno.jogo.jogoClasse;
import com.jguno.jogo.menuJogo;

public class Construtor<T> {
	@SuppressWarnings("rawtypes")
	private jogaUm jogUm = new jogaUm();
	@SuppressWarnings("rawtypes")
	private jogaDois jogDois = new jogaDois();
	@SuppressWarnings("rawtypes")
	private jogaTres jogTres = new jogaTres();
	@SuppressWarnings("rawtypes")
	private jogaQuatro jogQua = new jogaQuatro();
	private mesa<T> jmesa = mesaFactory.getInstanciaMesa().criarMes();
	private Baralho<T> baralho = baralhoFactory.getInstanciaBaralho().criarBaralho();
	private jogoClasse jgP = new jogoClasse();
	private menuJogo MenuJ = new menuJogo();
	
	@SuppressWarnings("unchecked")
	public void criarCartas(){
		ArrayList<T> carta = new ArrayList<T>();
		String tmcor = null;
		
		for(int reng = 0; reng <= 1; reng++){
			//monta o rang dos baralhos, sendo 2 repetições.
			for(int cor = 0; cor <= 3; cor++){
				// monta a secuencia de cor para cada baralho
				if(cor == 0){
					tmcor = "Amarelo";
				}else if(cor == 1){
					tmcor = "Vermelho";
				}else if(cor == 2){
					tmcor = "Verde";
				}else if(cor == 3){
					tmcor = "Azul";
				}
				for(int numero = 0; numero <= 8; numero++){
					//monta as cartas do baralho por numeração, sendo 9 cartas por cada cor tendo duas secuencias "dois baralhos"
					int card = numero + 1;
					//Armasena as cartas que contem (numero e cor) como uma string num ArrayList
					carta.add((T)(card+"%"+tmcor));
				}
			}
		}
		//miscura as cartas para serem colocadas no baralho
		Collections.shuffle(carta);
		for(int e = 0; e<=71; e++){
			baralho.insercao(carta.get(e));
		}
	}
	
	@SuppressWarnings("unchecked")
	public void reparteCartas(){
		jogUm.addIni(baralho.obter());
		baralho.remocao();
		jogDois.addIni(baralho.obter());
		baralho.remocao();
		jogTres.addIni(baralho.obter());
		baralho.remocao();
		jogQua.addIni(baralho.obter());
		baralho.remocao();
		
		for(int i = 1; i<=4; i++){
			jogUm.addPos(i, baralho.obter());
			baralho.remocao();
			jogDois.addPos(i, baralho.obter());
			baralho.remocao();
			jogTres.addPos(i, baralho.obter());
			baralho.remocao();
			jogQua.addPos(i, baralho.obter());
			baralho.remocao();
		}
		
		jmesa.insercao(baralho.obter());
		baralho.remocao();
	}
	
	public Boolean testeMesa(){
		Boolean resultadoteste = false;
		int testes = 0;
		
		if(jogUm.obterTamanho() != 5){
			System.out.println("Erro: Jogador Um não tem cartas!");
		}else{
			testes = 1;
		}
		if(jogDois.obterTamanho() != 5){
			System.out.println("Erro: Jogador Dois não tem cartas!");
		}else{
			testes = testes + 1;
		}
		if(jogTres.obterTamanho() != 5){
			System.out.println("Erro: Jogador Três não tem cartas!");
		}else{
			testes = testes +1;
		}
		if(jogQua.obterTamanho() != 5){
			System.out.println("Erro: Jogador Quatro não tem cartas!");
		}else{
			testes = testes +1;
		}
		if(baralho.tamanho() != 51){
			System.out.println("Erro: O Baralho não tem cartas!");
		}else{
			testes = testes +1;
		}
		if(jmesa.tamanho() != 1){
			System.out.println("Erro: A mesa não resebeu a primeira cartas!");
		}else{
			testes = testes + 1;
		}
		
		if(testes == 6){
			resultadoteste = true;
		}else{
			resultadoteste = false;
		}
		
		return resultadoteste;
	}
	
	public void mostraJogadaPC(){
		MenuJ.jogoMaquina();
		int jP = jgP.jogoQuemComeca();
		int var = jP;
		boolean rep = false;
		System.out.println("|"+jmesa.tamanho()+"|"+jogUm.obterTamanho()+"|"+jogDois.obterTamanho()+"|"+jogTres.obterTamanho()+"|"+jogQua.obterTamanho()+"|");
		while(rep != true){
			if(baralho.vazia()==true){
				rep = true;
			}else{
				System.out.println("teste baralho "+baralho.obter());
				jmesa.insercao(baralho.obter());
				baralho.remocao();
				for(int i = var; i <=3; i++){
					if(i==0){
						System.out.println("jogador Um :");
						try {
							Thread.sleep(3*1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("carta na mesa do jogador Um : "+baralho.obter());
						lerMaoJogador(i);
					}else if(i==1){
						System.out.println("jogador Dois :");
						try {
							Thread.sleep(3*1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("carta na mesa do jogador Dois : "+baralho.obter());
						lerMaoJogador(i);
					}else if(i==2){
						System.out.println("jogador Três :");
						try {
							Thread.sleep(3*1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("carta na mesa do jogador Três : "+baralho.obter());
						lerMaoJogador(i);
					}else if(i==3){
						System.out.println("jogador Quatro :");
						try {
							Thread.sleep(3*1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("carta na mesa do jogador Quatro: "+baralho.obter());
						lerMaoJogador(i);
					}
				}
				var = 0;
			}
		}
		System.out.println("Terminou o baralho");
	}
	
	public void converte(){
		
	}
	
	public void testeIgual(){
		for(int i = 0; i<= baralho.tamanho()-1;i++){
			if(jmesa.obter().equals(baralho.obter())==true){
				System.out.println("|................................OK..............................|");
				System.out.println(" ok-> "+jmesa.obter()+" | ok-> "+baralho.obter());
			}else{
				System.out.println("Nada vai para a proxima..");
				System.out.println("| "+jmesa.obter()+" | "+baralho.obter());
			}
			baralho.remocao();
		}
	}
	
	@SuppressWarnings("unchecked")
	public void lerMaoJogador(int jogador){
		int var = 0;
		boolean retorno = false;
		System.out.println("Jog Um: "+jogUm.obterTamanho()+" Jog Dois: "+jogDois.obterTamanho()+" Jog Tres: "+jogTres.obterTamanho()+" Carta mesa: "+jmesa.obter());
		if(jogador == 0){
			for(int i = 0; i <= jogUm.obterTamanho()-1; i++){
				if(jogUm.obterPosicao(i).equals(jmesa.obter())==true){
					System.out.println("Jogador Um......................................OK");	
					System.out.println(jmesa.obter());
					System.out.println(jogUm.obterPosicao(i));
					var = i;
					retorno = true;
				}else{
					System.out.println("Nenhuma carta jogador Um: "+jogUm.obterPosicao(i));
				}
			}
			if(retorno == true){
				System.out.println("Tem a carta e lansa uma");
				jmesa.insercao((T)jogUm.obterPosicao(var));
				jogUm.removerPosicao(var);
			}else{
				System.out.println("Não tem a carta e pega mais uma, total: "+jogUm.obterTamanho());
				jogUm.addFin(baralho.obter());
				baralho.remocao();
			}
		}else if(jogador == 1){
			for(int i = 0; i <= jogDois.obterTamanho()-1; i++){
				if(jogDois.obterPosicao(i).equals(jmesa.obter())==true){
					System.out.println("Jogador Dois......................................OK");
					System.out.println(jmesa.obter());
					System.out.println(jogDois.obterPosicao(i));
					var = i;
					retorno = true;
				}else{
					System.out.println("Nenhuma carta jogador Dois: "+jogDois.obterPosicao(i));
				}
			}
			if(retorno == true){
				System.out.println("Tem a carta e lansa uma");
				jmesa.insercao((T)jogDois.obterPosicao(var));
				jogDois.removerPosicao(var);
			}else{
				System.out.println("Não tem a carta e pega mais uma, total: "+jogDois.obterTamanho());
				jogDois.addFin(baralho.obter());
				baralho.remocao();
			}
		}else if(jogador == 2){
			for(int i = 0; i <= jogTres.obterTamanho()-1; i++){
				if(jogTres.obterPosicao(i).equals(jmesa.obter())==true){
					System.out.println("Jogador Tres......................................OK");	
					System.out.println(jmesa.obter());
					System.out.println(jogTres.obterPosicao(i));
					var = i;
					retorno = true;
				}else{
					System.out.println("Nenhuma carta jogador tres: "+jogTres.obterPosicao(i));
				}
			}
			if(retorno == true){
				System.out.println("Tem a carta e lansa uma");
				jmesa.insercao((T)jogTres.obterPosicao(var));
				jogTres.removerPosicao(var);
			}else{
				System.out.println("Não tem a carta e pega mais uma, total: "+jogTres.obterTamanho());
				jogTres.addFin(baralho.obter());
				baralho.remocao();
			}
		}else if(jogador ==3){
			for(int i = 0; i <= jogQua.obterTamanho()-1; i++){
				if(jogQua.obterPosicao(i).equals(jmesa.obter())==true){
					System.out.println("Jogador Quatro......................................OK");	
					System.out.println(jmesa.obter());
					System.out.println(jogQua.obterPosicao(i));
					var = i;
					retorno = true;
				}else{
					System.out.println("Nenhuma carta jogador Quatro: "+jogQua.obterPosicao(i));
				}
			}
			if(retorno == true){
				System.out.println("Tem a carta e lansa uma");
				jmesa.insercao((T)jogQua.obterPosicao(var));
				jogQua.removerPosicao(var);
			}else{
				System.out.println("Não tem a carta e pega mais uma, total: "+jogQua.obterTamanho());
				jogQua.addFin(baralho.obter());
				baralho.remocao();
			}
		}
	}
	
	public void iniciarJogo(){
		int iniMenu = MenuJ.menuJogador();
		if(iniMenu == 1){
			
		}else if(iniMenu == 2){
			System.out.println("Entrou no iniMenu op 2");
			mostraJogadaPC();
		}else if(iniMenu == 0){
			if(MenuJ.menuSair()==true){
				System.out.println("Segue em frente");
			}else{
				System.out.println("SAIR DE UMA VES");
			}
				
		}
	}
}