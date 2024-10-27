public class Apartamento extends Imovel{
   
    private boolean temPiscina;

    
    public double valorCompra(){
        if(area > 300 && temPiscina){
            return precoCompra *= 1.50;
        }
        else{
            return precoCompra *= 1.10;
        }
    }
}
