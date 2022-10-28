

public class Principal {
	 
    public static void main(String[] args) {
        Principal pr = new Principal();

        Animal a = new Animal();
        Mamifero m = new Mamifero();
        Urso u = new Urso();
        Peixe p = new Peixe();

        //animal
        a.setNome("Urubu");
        a.setAmbiente("ar");
        a.setComprimento(1.3);
        a.setCor("preto");
        a.setNumPatas(2);

        //mamifero
        m.setNome("Capivara");
        m.setComprimento(1.0);
        m.setCor("marrom");

        u.setNome("Urso pardo");
        u.setComprimento(2.2);
        u.getAlimento();


        //peixe
        p.setNome("Pirarucu");
        p.setComprimento(1.1);
        p.getCaracteristicas();






    }
 
}