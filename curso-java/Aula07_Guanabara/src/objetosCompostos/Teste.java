package objetosCompostos;



public class Teste {
	public static void main(String[] args) {
		Lutador l[] = new Lutador[4];
		l[0] = new Lutador("JOEL","BRASIL",1.80,75.0,29,10,2,1);
		l[1] = new Lutador("EDDY","EUA",1.98,100.0,33,12,5,2);
		l[2] = new Lutador("CHAN-LEE","CHINA",200.0,110.0,34,14,7,5);
		l[3] = new Lutador("FREDERICO","ESPANHA",1.73,75.0,24,7,2,1);
		
		/*for (int i = 0; i < 4; i++) {
			l[i].status();
			
		}*/
		
		Luta luta1 = new Luta();
		luta1.marcarLuta(l[0], l[3]);
		luta1.lutar();
		l[0].status();
		l[3].status();
		
		
		
		
	}

}
