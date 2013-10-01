package com.GeoAnalitica.Funcoes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CriarIMG {
	
	public static void saveToFile(int[][] mat, String filename) throws IOException{
		BufferedWriter out = new BufferedWriter(new FileWriter(filename+".pnm"));
		out.write(String.format("P2\n%d %d\n255\n",mat[0].length, mat.length));
		
		for(int[] linha:mat){
			for(int v:linha){
				out.write(String.format("%d ", v));
			}
		}
		out.close();
	}
	
	public static void main(String args[]){
		int[][] img = new int[255][255];
		
		for(int x=0; x<255;x++){
			for(int y=0; y<255; y++){
				img[x][y] = (x+y*255)%255;
			}
		}
		try {
			CriarIMG.saveToFile(img,"teste");
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace(System.err);
		}
	}

}
