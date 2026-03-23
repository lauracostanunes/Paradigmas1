package EdificiosApartamentos;

import java.util.ArrayList;

public class Edificio {
    private int id;
    private String endereco;
    private ArrayList<Apartamento> listaApartamentos;

    public Edificio(){
        this.listaApartamentos = new ArrayList<>();
    }

    public Edificio(int id, String endereco){
        this.id = id;
        this.endereco = endereco;
        this.listaApartamentos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Apartamento> getListaApartamentos() {
        return listaApartamentos;
    }

    public void setListaApartamentos(ArrayList<Apartamento> listaApartamentos) {
        this.listaApartamentos = listaApartamentos;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void construirApartamento(int numero, int andar){
        this.listaApartamentos.add(new Apartamento(numero, andar));
    }

    public void listarApartamentos(){
        if(!this.listaApartamentos.isEmpty()){
            for(Apartamento apartamento : this.listaApartamentos){
                System.out.printf("""
                        Andar: %x\tNumero: %x
                        """, apartamento.getAndar(), apartamento.getNumero());
            }
        }
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "id=" + id +
                ", endereco='" + endereco + '\'' +
                ", listaApartamentos=" + listaApartamentos +
                '}';
    }
}