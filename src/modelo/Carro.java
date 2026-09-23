
package modelo;

public class Carro {
    private String marca, modelo;
    private double preco;
    private int id;

    public Carro(String marca, String modelo, double preco, int id) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" 
                + modelo + ", preco=" + preco + ", id=" + id + '}';
    }
    
    
    
    
}
