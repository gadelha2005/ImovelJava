import java.util.ArrayList;
import java.util.List;

public class Imobiliaria extends Imovel {
   
    Imovel [] imovel;

    public double mediaPreco(){
        double soma = 0;
        for(Imovel imovel : imovel){
            soma += imovel.precoCompra;
        }
        double media = soma / imovel.length;
        return media;
    }

    public int quantidadeCasas(){
        int quantidaDeCasas = 0;
        for(Imovel imovel : imovel){
           if(imovel instanceof Casa){
                quantidaDeCasas += 1;
           }
        }
        return quantidaDeCasas;
    }

    public int quantidadeApartamentos(){
        int quantidadeApartamentos = 0;
        for(Imovel imovel : imovel){
           if(imovel instanceof Apartamento){
                quantidadeApartamentos += 1;
           }
        }
        return quantidadeApartamentos;
    }

    public Imovel maiorPrecoVenda(){
        Imovel maisCaro = imovel[0];
        for(Imovel imovel : imovel){
            if(imovel.valorCompra() > maisCaro.valorCompra()){
                maisCaro = imovel; 
            }
        }
        return maisCaro;
    }
        



    @Override
    public double valorCompra() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'valorCompra'");
    }

   

    


}
