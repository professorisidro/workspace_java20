
public class Concessionaria {
	public static void main(String[] args) {
		Veiculo v1, v2;
		
        v1 = new Carro();
        v2 = new Moto();
        
        v1.marca = "Vokis";
        v1.modelo = "Fusco";
        
        v2.marca = "Kavasáque";
        v2.modelo = "Noja";
        
        v1.acelerar();
        v1.frear();
        v2.acelerar();
        v2.frear();
        
        
	}

}
