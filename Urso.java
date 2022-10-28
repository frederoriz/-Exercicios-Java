public class Urso extends Mamifero {

    private String alimento;

    public Urso() {
        super();
        this.setCor("castanho");
        this.setAlimento("mel");
    }

    public String getAlimento() {
        return alimento;
    }
 
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public void setCor(String cor) {
        if(!cor.equals("branco") || 
            !cor.equals("castanho") ||
            !cor.equals("preto")) {

            super.setCor("castanho");//organizando padroes
        }

    }
 
    
}