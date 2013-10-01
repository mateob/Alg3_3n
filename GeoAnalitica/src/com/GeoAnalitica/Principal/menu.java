package com.GeoAnalitica.Principal;

import java.util.Scanner;
import java.util.StringTokenizer;
import org.apache.commons.*;

public class menu {
	public Scanner sc = new Scanner(System.in);
	public String circulo, reta, quadrado, numero, codigo;
	public int i;
	public int[] valores;
	public String Indicador = "> ";
	public String[] sequencia;
	public String[][] matriz;
	
	public menu(){
		
	}
	
	public void ScannerMenu(){
		codigo = null;
		sequencia = new String[10];
		valores = new int[10];
		i = 0;
		System.out.print(Indicador);
		codigo = sc.nextLine();
		StringTokenizer token = new StringTokenizer(codigo, " ");
		
		while(token.hasMoreTokens()){
			sequencia[i] = token.nextToken();
			i++;
		}
		
		for (int i=0; i == sequencia.length; i++){
			for(int z=1; z == sequencia.length; z++){
				if (sequencia[i].equalsIgnoreCase("circulo")){
					System.out.println(Indicador+"Circulo selecionado");
					if(sequencia[i+z].equalsIgnoreCase("--Help")){
						System.out.println(Indicador+"Circulo sequencia de ajuda");
					}else{ 
						if(sequencia[i+2].equalsIgnoreCase("-x")){
							int x = Integer.parseInt(sequencia[i+3]);
						}
						if(sequencia[i+3].equalsIgnoreCase("-y")){
						
						}
					}
					int y = Integer.parseInt(sequencia[4]);
					//int R = Integer.parseInt(sequencia[3]);
					//if(sequencia[1].equalsIgnoreCase("-x")){
					//System.out.println("teste "+x);//+"|"+y+"|"+R);
					//}else{}
					System.out.println("deu merda");
				}else if(sequencia[0].equalsIgnoreCase("quadrado")){
					System.out.println(Indicador+"Quadrado selecionado");
					if(sequencia[1].equalsIgnoreCase("--Help")){
						System.out.println(Indicador+"Quadrado sequencia de ajuda");
					}else{ 
					
					}
				}else if(sequencia[0].equalsIgnoreCase("reta")){
					System.out.println(Indicador+"reta selecionada");
					if(sequencia[1].equalsIgnoreCase("--Help")){
						System.out.println(Indicador+"Reta sequencia de ajuda");
					}else{
					
					}
				}else if(sequencia[0].equalsIgnoreCase("triangulo")){
					System.out.println(Indicador+"Triangulo selecionado");	
					if(sequencia[1].equalsIgnoreCase("--Help")){
						System.out.println(Indicador+"Triangulo sequencia de ajuda");
					}else{
					
					}
				}
			}
		}
	}
}