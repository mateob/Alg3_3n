package com.GeoAnalitica.Funcoes;

public class tratardados {
	private CriarIMG criarImagem = new CriarIMG();
	private int[][] imagen = new int[255][255];
	
	public void getDadosFiguras(){
		for(int x=0; x<255;x++){
			for(int y=0; y<255; y++){
				imagen[x][y] = (x+y*255)%255;
			}
		}
	}
	
	public Boolean tratamentoDeDados(){
		Boolean resultado = false;
		
		//função de tratamento.
		
		return resultado;
	}
}
