package com.jguno.principal;

import java.util.ArrayList;
import java.util.Collections;

import com.jguno.classes.Baralho;
import com.jguno.classes.mesa;
import com.jguno.jogadores.jogaUm;
import com.jguno.jogadores.jogaDois;
import com.jguno.jogadores.jogaTres;
import com.jguno.jogadores.jogaQuatro;

public class Construtor {
	@SuppressWarnings("rawtypes")
	private Baralho baralho = new Baralho();
	@SuppressWarnings("rawtypes")
	private jogaUm jogUm = new jogaUm();
	@SuppressWarnings("rawtypes")
	private jogaDois jogDois = new jogaDois();
	@SuppressWarnings("rawtypes")
	private jogaTres jogTres = new jogaTres();
	@SuppressWarnings("rawtypes")
	private jogaQuatro jogQua = new jogaQuatro();
	@SuppressWarnings("rawtypes")
	private mesa jmesa = new mesa();
	
	private int testeJogaUm, testeJogaDois, testeJogaTres, testeJogaQua, testePopBaralho, testePopMesa;
	
	/*public <T> baralhoint<T> criarBaralho(){
		baralhoint<T> baralho = null;
		baralho = new Baralho<T>();
		return baralho;
	}
	
	public <T> jogadoresint<T> criarMaoJUm(){
		jogadoresint<T> jogUm = null;
		jogUm = new jogaUm<T>();
		return jogUm;
	}
	
	public <T> jogadoresint<T> criarMaoJDois(){
		jogadoresint<T> jogDois = null;
		jogDois = new jogaDois<T>();
		return jogDois;
	}
	
	public <T> jogadoresint<T> criarMaoJTres(){
		jogadoresint<T> jogTres = null;
		jogTres = new jogaTres<T>();
		return jogTres;
	}
	
	public <T> jogadoresint<T> criarMaoJQuatro(){
		jogadoresint<T> jogQua = null;
		jogQua = new jogaQuatro<T>();
		return jogQua;
	}
	*/
	
	@SuppressWarnings("unchecked")
	public <T> void criarCartas(){
		ArrayList<T> carta = new ArrayList<T>();
		String tmcor = null;
		
		for(int reng = 0; reng <= 1; reng++){
			//monta o rang dos baralhos, sendo 2 repeti��es.
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
					//monta as cartas do baralho por numera��o, sendo 9 cartas por cada cor tendo duas secuencias "dois baralhos"
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
		System.out.println("tes 1 "+baralho.obter());
		baralho.remocao();
		jogDois.addIni(baralho.obter());
		System.out.println("tes 2 "+baralho.obter());
		baralho.remocao();
		jogTres.addIni(baralho.obter());
		System.out.println("tes 3 "+baralho.obter());
		baralho.remocao();
		jogQua.addIni(baralho.obter());
		System.out.println("tes 4 "+baralho.obter());
		baralho.remocao();
		
		System.out.println(jogUm.obterPrimeiro());
		
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
		
		for(int e = 0; e <= 3; e++){
			for(int y = 0; y <=4; y++){
				if(e == 0){
					System.out.println("Carta jogador 1, carata: "+y+" | "+jogUm.obterPosicao(y));
				}else if(e ==1){
					System.out.println("Carta jogador 2, carata: "+y+" | "+jogDois.obterPosicao(y));
				}else if(e==2){
					System.out.println("Carta jogador 3, carata: "+y+" | "+jogTres.obterPosicao(y));
				}else if(e ==3){
					System.out.println("Carta jogador 4, carata: "+y+" | "+jogQua.obterPosicao(y));
				}
			}
		}
		
		jmesa.insercao(baralho.obter());
		baralho.remocao();
	}
	
	public Boolean testeMesa(){
		Boolean resultadoteste = false;
		int testes = 0;
		
		System.out.println(baralho.tamanho());
		System.out.println("Joga Um "+jogUm.obterTamanho());
		System.out.println("Joga Dois "+jogDois.obterTamanho());
		System.out.println("Joga Tres "+jogTres.obterTamanho());
		System.out.println("Joga Quatro "+jogQua.obterTamanho());
		System.out.println("Mesa "+jmesa.tamanho());
		if(jogUm.obterTamanho() != 5){
			System.out.println("Erro: Jogador Um n�o tem cartas!");
		}else{
			testes = 1;
		}
		if(jogDois.obterTamanho() != 5){
			System.out.println("Erro: Jogador Dois n�o tem cartas!");
		}else{
			testes = testes + 1;
		}
		if(jogTres.obterTamanho() != 5){
			System.out.println("Erro: Jogador Tr�s n�o tem cartas!");
		}else{
			testes = testes +1;
		}
		if(jogQua.obterTamanho() != 5){
			System.out.println("Erro: Jogador Quatro n�o tem cartas!");
		}else{
			testes = testes +1;
		}
		if(baralho.tamanho() != 51){
			System.out.println("Erro: O Baralho n�o tem cartas!");
		}else{
			testes = testes +1;
		}
		if(jmesa.tamanho() != 1){
			System.out.println("Erro: A mesa n�o resebeu a primeira cartas!");
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
}