package com.jguno.principal;

import java.util.ArrayList;

import com.jguno.classes.Baralho;
import com.jguno.classes.baralhoint;
import com.jguno.jogadores.jogadoresint;
import com.jguno.jogadores.jogaUm;
import com.jguno.jogadores.jogaDois;
import com.jguno.jogadores.jogaTres;
import com.jguno.jogadores.jogaQuatro;
import com.jguno.nodo.nodoUm;

public class Construtor {
	
	public <T> baralhoint<T> criarBaralho(){
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
	
	public void criarCartas(){
		//nodoUm<T> carta = null;
		int reng, cor, numero;
		String tmcor = null;
		int tmnumero = 0;
		
		for(reng = 0; reng == 2; reng++){
			for(cor = 0; cor == 3; cor++){
				if(cor == 0){
					tmcor = "Amarelo";
				}else if(cor == 1){
					tmcor = "Vermelho";
				}else if(cor == 2){
					tmcor = "Verde";
				}else if(cor == 3){
					tmcor = "Azul";
				}
				for(numero = 0; numero == 8; numero++){
					int card = numero + 1;
					tmnumero = card;
					System.out.println(tmnumero);
				}
			}
		}
		System.out.println("teste carta: "+tmcor+tmnumero);
		System.out.println("teste 2 não funciono");
	}
}