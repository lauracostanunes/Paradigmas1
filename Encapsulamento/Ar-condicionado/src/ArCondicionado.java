public class ArCondicionado {
    private String marca, modelo;
    private int temperatura;
    private boolean ligado;

    public ArCondicionado(){}

    // Construtor com parâmetros usando setters
    public ArCondicionado(String marca, String modelo, int temperatura, boolean ligado){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setTemperatura(temperatura);
        this.ligado = ligado;
    }

    // Setter temperatura (16 a 30)
    public void setTemperatura(int t){
        if (t >= 16 && t <= 30){
            this.temperatura = t;
        }
        else System.out.println("Temperatura fora da faixa.");
    }

    public int getTemperatura(){
        return this.temperatura;
    }

    // Setter marca (mínimo 3 caracteres)
    public void setMarca(String m){
        if (m.length() >= 3){
            this.marca = m;
        }
        else System.out.println("Marca inválida.");
    }

    public String getMarca(){
        return this.marca;
    }

    public void setModelo(String modelo){
        if (!modelo.isEmpty()){
            this.modelo = modelo;
        }
        else System.out.println("Modelo inválido.");
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    public boolean isLigado(){
        return this.ligado;
    }

    // Método público que usa verificação interna
    public void ativarModoTurbo(){
        if (this.verificarCompressor()){
            System.out.println("Compressor OK. Ativando modo Turbo.");
            this.setTemperatura(16);
        }
        else{
            System.out.println("Falha no compressor. Modo Turbo indisponível.");
        }
    }

    // Método privado que simula verificação
    private boolean verificarCompressor(){
        System.out.println("Verificando compressor...");
        int randomico = (int) (Math.random() * 5);

        if (randomico > 2){
            System.out.println("Compressor funcionando.");
            return true;
        }
        else{
            System.out.println("Falha técnica no compressor.");
            return false;
        }
    }

    public String toString(){
        return "Marca: " + this.marca +
                " Modelo: " + this.modelo +
                " Temperatura: " + this.temperatura +
                " Ligado: " + this.ligado;
    }
}