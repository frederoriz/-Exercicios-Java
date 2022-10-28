public class Peixe  extends Animal{// chamando a super classe

    private String caracteristicas;// adicionando para Peixe a caract como atributo

    public Peixe() {
        super();//colocando superclasse dentro do Obj Peixe
        this.setAmbiente("mar");
        this.setNumPatas(0);
        this.setCor("cinza");
        this.setCaracteristicas("barbatana, escama, calda...");//ja definindo pois o texto deu este padrao
    }
 
    public String getCaracteristicas() {
        return caracteristicas;
    }
 
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }


}