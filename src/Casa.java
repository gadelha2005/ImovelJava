public class Casa extends Imovel {
   
    private boolean temQuintal;

    public double valorCompra(){
        if(quantidadeQuartos > 4 || temQuintal){
            return precoCompra *= 1.30;
        }
        else{
            return precoCompra *= 1.15;
        }   
    }
}
