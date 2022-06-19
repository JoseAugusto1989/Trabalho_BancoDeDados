package main;

import java.util.Scanner;

import entities.ContaBancaria;
import view.View;

public class StartAppTest {

	static View view = new View();
	static Scanner scan = new Scanner(System.in);
	static ContaBancaria conta;
	
	public static void main(String[] args) {
		
		int i = 0;
		do {
			//view.menuCadastro();
			view.menuInicial();
				i = scan.nextInt();
				scan.nextLine();
				opcaoMenu(i);
			
		} while(i != 9);
			view.menuFim();
			scan.close();
		
	}
	
	public static void cadastroInicial() {
		System.out.print("Digite seu Nome: ");
			String nome = scan.nextLine();
		System.out.print("Digite seu CPF: ");
			String cpf = scan.nextLine();
		System.out.print("Digite um valor a ser depositado (COM virgula): ");
			Double saldo = scan.nextDouble();   scan.nextLine();
		System.out.print("Digite um número para se identificar: ");
			int id = scan.nextInt();   scan.nextLine();
			conta  = new ContaBancaria();
		System.out.println(conta);
	}
	
	public static void opcaoMenu(int i) {
		if(i == 1) {
			cadastroInicial();
			
		} else if(i == 2) {
			System.out.println(conta);
			
		} else if(i == 3) {
			
			
		} else if(i == 4) {
			
			
		} else if(i == 9) {
			
			
		} else {
			view.menuErrado();
		}
	}
	
	public static void menuAtualizar(int atualizar) {
		if(atualizar == 1) {
			cadastroInicial();
		} else if(atualizar == 2) {
			
		} else if(atualizar == 3) {
			
		} else {
			System.out.println("\n");
			
		}
	}

}
