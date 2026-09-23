package principal;

import lista.Lista;
import modelo.Carro;

public class UsaLista {

    public static void main(String[] args) {
       Lista<Carro> lista=new Lista<>();
       
       lista.inserir(new Carro("Fiat","Marea",12033.45,1));
       lista.inserir(new Carro("VW","Fox",120000.45,11));
       lista.inserir(new Carro("VW","Virtus",30000.54,5));
       lista.inserir(new Carro("BYD","Song",25000.32,21));
       
       // lista.exibir();
       
       Carro c=lista.pesquisar(11);
       if(c==null){
           System.out.println("Não tem!");
       }else{
           System.out.println(c);
       }
    }
    
}
