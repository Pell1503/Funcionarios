package List;


import java.util.ArrayList;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Emploi.Funcionario;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		var sc = new Scanner (System.in);
	System.out.println("quantos funcionarios vão ser registrados :");
	int n = sc .nextInt();
	 	List<Funcionario>list = new ArrayList<>();
	 	for (int i = 0 ; i<n ;i++) {
	 		System.out.println("funcionario # " + (i+1) + ":");
	 		System.out.println("id :");
	 		Integer id = sc.nextInt();
	 		while (hasId(list,id)) {
	 			System.out.println("este id ja existe, tente novamente ");
	 			id = sc.nextInt();
	 		}
	 		
	 		System.out.println("nome :");
	 		sc.nextLine();
	 		String name = sc.nextLine();
	 		System.out.println("salary :");
	 		Double salary = sc.nextDouble();
	 		Funcionario c4 = new Funcionario (salary, name , id);
	 		list.add(c4);
	 			
	 	}
	 	System.out.println("digite o id do funcionario para ver o aumento do salário :");
	 	int idsalario = sc.nextInt();
	 	Integer poss= posição(list , idsalario);
	 	if (poss== null) {
	 		System.out.println("não encontrado =(");
	 	}else {
	 		System.out.println("digite a porcentagem :");
	 		double porcentagem = sc.nextDouble();
	 		list.get(poss).increasySalary(porcentagem); 
	 			
	 		
	 	}
	 	System.out.println();
	 	System.out.println("lista de funcionários :");
	 	for (Funcionario c4 : list ) {
	 		System.out.println(c4);
	 	}
	 	sc.close();	
	 	
	 	 
	}
	public static  Integer posição (List<Funcionario> list,int id ) {
		for (int i =0 ; i<list.size();i++) {
			if (list.get(i).getId()== id) {
				return i ;
			}
		}
		return null ;
	}
	public static boolean hasId (List<Funcionario>list , int id ) {
		Funcionario c4 = list.stream().filter(x->x.getId()==id).findFirst().orElse(null);
		return c4 != null;
	}

}
