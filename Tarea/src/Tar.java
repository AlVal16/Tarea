import java.util.Scanner;

public class Tar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner (System.in); 
		System.out.println("INGRESE NOMBRE ");
		String nomcom = scan.next();
		System.out.println("INGRESE PRIMER APELLIDO ");
		String ape = scan.next();
		
		
		System.out.println("CANTIDAD DE DINERO");
		int din= scan.nextInt();
		System.out.println("SU NOMBRE ES: " + nomcom + " \nSU APELLIDO ES  "+ ape + " \nCANTIDAD DE DINERO " + din);
		
		
	}

}
