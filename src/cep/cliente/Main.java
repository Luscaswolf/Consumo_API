package cep.cliente;

import java.util.Scanner;

import cep.viacep.ServicoDeCep;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Informe seu CEP: ");
		String cepString = new Scanner(System.in).nextLine();
		Endereco endereco = ServicoDeCep.buscaEnderecoPelo(cep);
		

        System.out.println("Logradouro: " + endereco.getLogradouro());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Localidade: " + endereco.getLocalidade());
	}

}
