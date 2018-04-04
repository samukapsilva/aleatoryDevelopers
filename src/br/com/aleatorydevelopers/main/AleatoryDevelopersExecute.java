package br.com.aleatorydevelopers.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class AleatoryDevelopersExecute {

	public static void main(String[] args) {
		List<String> nomesFixos = new ArrayList<String>();
		nomesFixos.add("Andre");
		nomesFixos.add("Joao");
		nomesFixos.add("Pedro");
		nomesFixos.add("Judas");
		
		String listaMudou = JOptionPane.showInputDialog("A lista mudou ? (Responda S ou N)");
		if("Sim".equals(listaMudou)){
			
			Integer quantidadeDesenvolvedores = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de desenvolvedores: "));
			
			List<String> nomesDevelopers = new ArrayList<String>(quantidadeDesenvolvedores);	
		
			String nomeDeveloper = "";
			
			for(int i=0;i<=nomesDevelopers.size();i++){
				nomeDeveloper = JOptionPane.showInputDialog("Insira o nome do desenvolvedor");
				if("".equals(nomeDeveloper)){
					break;				
				} else {
					nomesDevelopers.add(nomeDeveloper);
				}
			}
			
			Collections.shuffle(nomesDevelopers);
		} else if("Nao".equals(listaMudou)) {
			Collections.shuffle(nomesFixos);
			int i = nomesFixos.size();
			
			for(;i==1;i--){
				nomesFixos.remove(i);
			}
			
			JOptionPane.showMessageDialog(null, "O escolhido do dia para fazer deploy é o : " + nomesFixos.get(0));
		}
		
		
		
		
		
		
		
		
			
	}
}