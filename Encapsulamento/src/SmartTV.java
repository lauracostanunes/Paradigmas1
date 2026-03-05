public class SmartTV{
    private String marca, modelo;
    private int volume;
    private boolean conectadaInternet;

    public SmartTV(){}

    // Se o método usa this ou acessa atributos como volume, marca, etc.,
    //  ele quase sempre é método de instância.
    public SmartTV(String marca, String modelo, int volume){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVolume(volume);
        this.conectadaInternet = false;
    }

    // Set atribui valor a variável privada.
    // Recebe um valor como parâmetro e não retorna nada
    public void setVolume(int volume){
        if (volume >= 0 && volume <= 100){
            this.volume = volume;
        }
        else System.out.println("Volume inválido.");
    }

    // Get resgata o valor da variável.
    // O método deve possuir um tipo e um return para o respectivo valor
    public int getVolume(){
        return this.volume;
    }

    public void setMarca(String marca){
        if (!marca.isEmpty()){
            this.marca = marca;
        }
        else System.out.println("Insira uma marca");

        if (marca.length() <= 30) {// Método de instância
            this.marca = marca;
        }
        else System.out.println("Marca inválida");
    }

    public void setModelo(String modelo){
        if (!modelo.isEmpty()){
            this.modelo = modelo;
        }
        else System.out.println("Insira um modelo");

        // Todo modelo tem que iniciar com a letra maiúscula
        char primeiro = modelo.charAt(0);
        boolean resp = Character.isUpperCase(primeiro); // Letra maiúscula, como String, normalmente é classe
        if (resp) {
            this.modelo = modelo;
        }
        else System.out.println("Modelo inválido");
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setConectadaInternet (boolean conectadaInternet) {
        this.conectadaInternet = conectadaInternet;
    }

    public boolean isConectadaInternet() {
        return this.conectadaInternet;
    }

    public void abrirYoutube() {
        // Conectar-se à internet
        if (this.conectadaInternet()) {
            System.out.println("Abrindo YouTube");
        }
        else {
            System.out.println("Sem internet. YouTube não carregou.");
        }
    }
    // Aumentar o volume em X
    public void aumentarVolume(int X) {
        this.setVolume(this.volume + X);
    }

    // Diminuir o valume em X
    public void diminuirVolume(int x){
        this.setVolume(this.volume - x);
    }

    private boolean conectadaInternet () {
        System.out.println("Bucando sinal de wi-fi");
        System.out.println("Verificando credenciais");
        System.out.println("Autenticando IP");
        // 50% de chance de conectar, 50% de não conectar
        int randomico = (int) (Math.random() * 10);
        // Quando um método é chamado por um objeto, ele é um método de instância.
        // Quando um método é chamado pela classe, ele é um método de classe (estático).
        if (randomico <  5) {
            System.out.println("Conectou à internet");
            return true;
        }
        else {
            System.out.println("Erro de conexão");
            return false;
        }
    }
    public String toString(){
        return "Marca: " + this.marca +
                "Modelo " + this.modelo +
                "Volume: " + this.volume;
    }
}