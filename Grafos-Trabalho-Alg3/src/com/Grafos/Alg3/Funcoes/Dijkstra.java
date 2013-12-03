package com.Grafos.Alg3.Funcoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.Grafos.Alg3.Nodo.Grafo;
import com.Grafos.Alg3.Nodo.Vertice;

public class Dijkstra {
	public List<Vertice> menorCaminho = new ArrayList<Vertice>();
	public Vertice verticeCaminho = new Vertice();
	public Vertice atual = new Vertice();
	public Vertice vizinho = new Vertice();
	public List<Vertice> naoVisitados = new ArrayList<Vertice>();

	public List<Vertice> encontrarMenorCaminhoDijkstra(Grafo grafo, Vertice v1, Vertice v2) {
		menorCaminho.add(v1);
		for (int i = 0; i < grafo.getVertices().size(); i++) {
			if (grafo.getVertices().get(i).getDescricao()
					.equals(v1.getDescricao())) {
				grafo.getVertices().get(i).setDistancia(0);
			} else {
				grafo.getVertices().get(i).setDistancia(9999);
			}
			this.naoVisitados.add(grafo.getVertices().get(i));
		}

		Collections.sort(naoVisitados);

		while (!this.naoVisitados.isEmpty()) {
			atual = this.naoVisitados.get(0);
			System.out.println("Pegou esse vertice:  " + atual);
			for (int i = 0; i < atual.getArestas().size(); i++) {
				vizinho = atual.getArestas().get(i).getDestino();
				System.out.println("Olhando o vizinho de "+atual+": "+ vizinho);
				if (!vizinho.verificarVisita()) {
					if (vizinho.getDistancia()>(atual.getDistancia()+atual.getArestas().get(i).getPeso())) {
						vizinho.setDistancia(atual.getDistancia()+atual.getArestas().get(i).getPeso());
						vizinho.setPai(atual);
						if (vizinho == v2) {
							menorCaminho.clear();
							verticeCaminho = vizinho;
							menorCaminho.add(vizinho);
							while (verticeCaminho.getPai() != null) {
								menorCaminho.add(verticeCaminho.getPai());
								verticeCaminho = verticeCaminho.getPai();
							}
							Collections.sort(menorCaminho);
						}
					}
				}
			}
			atual.visitar();
			this.naoVisitados.remove(atual);
			Collections.sort(naoVisitados);
			System.out.println(naoVisitados);
		}
		return menorCaminho;
	}
}