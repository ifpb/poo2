package br.edu.ifpb.poo2.exemplos_mapas;

import java.util.HashMap;
import java.util.Map;

public class DDDPorMunicipio {
	
	public static void main(String[] args) {
		
		Map<String, String> dddsPorMunicipio = new HashMap<String, String>();
		dddsPorMunicipio.put("João Pessoa", "83");
		dddsPorMunicipio.put("Recife", "81");
		dddsPorMunicipio.put("Pombal", "83");
		dddsPorMunicipio.put("Duas Estradas", "83");
		dddsPorMunicipio.put("Juazeiro do Norte", "88");
		dddsPorMunicipio.put("Fortaleza", "85");
		
		System.out.println("O código de área de João Pessoa é: "+ dddsPorMunicipio.get("João Pessoa"));
		System.out.println("O código de área de Fortaleza é: "+ dddsPorMunicipio.get("Fortaleza"));
		
		
	}

}
