public class Drone {
    private String codigo;
    private float altura;
    private int bateria;
    private boolean emVoo;

    public Drone(){}

    public Drone(String codigo, float altura, int bateria, boolean emVoo){
        this.setCodigo(codigo);
        this.setAltura(altura);
        this.setBateria(bateria);
        this.emVoo = false;
    }

    public void setCodigo(String codigo){
        if(!codigo.isEmpty()){
            this.codigo = codigo;
        }
        else System.out.println("Código inválido");
    }

    public String getCodigo(){
        return this.codigo;
    }

    public void setAltura(float a){
        if(a >= 0 && a <= 120){
            this.altura = a;
        }
        else System.out.println("Altura fora do limite permitido.");
    }

    public float getAltura(){
        return this.altura;
    }

    public void setBateria(int b){
        if(b >= 0 && b <= 100){
            this.bateria = b;
        }
        else System.out.println("Bateria inválida.");
    }

    public int getBateria(){
        return this.bateria;
    }

    public void setEmVoo(boolean emVoo){
        this.emVoo = emVoo;
    }

    public boolean isEmVoo(){
        return this.emVoo;
    }

    // Método público para decolar
    public void decolar(){
        if(this.bateria > 20){
            if(this.testarMotores()){
                System.out.println("Decolando...");
                this.emVoo = true;
                this.setAltura(2);
            }
            else{
                System.out.println("Falha nos motores. Decolagem cancelada.");
            }
        }
        else{
            System.out.println("Bateria insuficiente para decolar.");
        }
    }

    // Método privado
    private boolean testarMotores(){
        System.out.println("Testando hélices...");
        System.out.println("Calibrando GPS...");

        int randomico = (int)(Math.random() * 10);

        if(randomico < 8){
            System.out.println("Motores prontos.");
            return true;
        }
        else{
            System.out.println("Erro nos motores.");
            return false;
        }
    }

    // Subir altura
    public void subir(float x){
        this.setAltura(this.altura + x);
    }

    // Descer altura
    public void descer(float x){
        this.setAltura(this.altura - x);
    }

    public String toString(){
        return "Código: " + this.codigo +
                " Altura: " + this.altura +
                " Bateria: " + this.bateria +
                " Em voo: " + this.emVoo;
    }
}