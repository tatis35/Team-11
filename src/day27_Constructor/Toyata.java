package day27_Constructor;

public class Toyata {
    String marka="Toyata";
    int tekerAdedi=4;
    boolean motorVarMi=true;
    String  model;
    String yakit;
    int yil;

    public void maxHiz(){
        if (yakit.equals("Benzin")) {

            System.out.println("Benzin"+yakit);

        }else if (yakit.equals("Dizel")){
            System.out.println("Dizel "+yakit);
        }

}
    public void renkTercihleri() {

        if (model.equals("Corolla")){
            System.out.println("Corolla");
        }


}
}
