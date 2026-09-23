package lista;

import modelo.Carro;

public class Lista<T>{

    private No<T> inicio, fim, aux;

    public boolean vazia(){
     return inicio == null;
    }
    
    public void inserir(T item) {
        if (vazia()) {
            inicio = new No(item);
            aux=inicio;
            fim=inicio;
        }else{
           fim=new No(item);
           aux.setProx(fim);
           aux=fim;
        }
    }
    
    public void exibir(){
     No<T> ref=inicio;
     while(ref!=null){
         System.out.println(ref.getItem());
         ref=ref.getProx();
     }
    }
    
    public Carro pesquisar(int id){
      No<T> ref=inicio;
      Carro c;
      while(ref!=null){
        c=(Carro)ref.getItem();//Cast
        if(id==c.getId()){
          return c;
        }
        ref=ref.getProx();
      }
      return null;
    }

    public boolean remover(int id){
        pesquisar(id);
        No<T> remove = inicio;
        No<T> auxRemove = null;
        Carro c;
        while(remove != null ){
            c=(Carro)remove.getItem();
           if (id == c.getId()){

           }
        }
        return false;
    }
}
