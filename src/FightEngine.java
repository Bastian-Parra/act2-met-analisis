import java.util.Scanner;

public class FightEngine {
	public FightEngine(){
		String luchadorPlayer1;
		String accionLuchadorIn;
		int accionLuchador;
		String opcionChoroPortenho = new String("1");
		String opcionMineroWarrior = new String("2");
		
	    System.out.println("Empieza el juego!!!");
		System.out.println("Selecciona tu luchador (1 o 2): 1-Choro Portenho 2-Minero Warrior ");
		
		Scanner seleccion = new Scanner(System.in);
		
		luchadorPlayer1 = seleccion.nextLine();
	
		System.out.println(luchadorPlayer1);
		
		if (luchadorPlayer1.equals(opcionChoroPortenho)){
				System.out.println("Choro Portenho inicia a batalla!");
				ChoroPortenho player1CP = new ChoroPortenho();
				
				System.out.println("Ingresa tu accion! :1-Golpe 2-Patada 3-Salto 4-LANZAR PODER");
				accionLuchadorIn = seleccion.nextLine();
				accionLuchador = Integer.parseInt(accionLuchadorIn);
				
				switch(accionLuchador) {
					case 1: System.out.println(player1CP.golpear());
							break;
					case 2: System.out.println(player1CP.patear());
							break;
					case 3: System.out.println(player1CP.saltar());
							break;
					case 4: System.out.println(player1CP.LanzarPoder());
							break;
				}
		}
		
		if (luchadorPlayer1.equals(opcionMineroWarrior)){
			System.out.println("Minero Warrior inicia a batalla!");
			
			MineroWarrior player1MW = new MineroWarrior();
			
			System.out.println("Ingresa tu accion! :1-Golpe 2-Patada 3-Salto 4-LANZAR PODER");
			accionLuchadorIn =seleccion.nextLine();
			accionLuchador = Integer.parseInt(accionLuchadorIn);
			
			switch(accionLuchador) {
				case 1: System.out.println(player1MW.golpear());
						break;
				case 2: System.out.println(player1MW.patear());
						break;
				case 3: System.out.println(player1MW.saltar());
						break;
				case 4: System.out.println(player1MW.LanzarPoder());
						break;
			}		
		
		}
		
		System.out.println("FIN DEL JUEGO. 2...");
	}

}
