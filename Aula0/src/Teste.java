
public class Teste {

	public static void main(String[] args) {
		//Ponto de partida: coloco os objetos em mem�ria
		Cachorro c = new Cachorro();
		c.nome = "BIDU";
		c.raca = "SRD";
		c.latir();
		c.mostrarRaca();
		
		Cachorro d = new Cachorro();
		d.nome = "REX";
		d.raca = "SRD";
		d.latir();
		d.mostrarRaca();
	}

}
