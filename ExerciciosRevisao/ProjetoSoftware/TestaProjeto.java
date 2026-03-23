package ProjetoSoftware;

public class TestaProjeto {
    public static void main(String[] args){
        Programador p1 = new Programador(1, "Jonata", "Java");
        Programador p2 = new Programador(2, "Marina", "Python");
        Programador p3 = new Programador(3, "Isadora", "C++");
        Programador p4 = new Programador(4, "Laura", "Go");
        Programador p5 = new Programador(5, "Laura", "Cobol")

        Projeto projeto1 = new Projeto(5, "Edifícios e Apartamentos");
        Projeto projeto2 = new Projeto(6, "Clínica Médica");

        projeto1.adicionarProgramador(p1);
        projeto1.adicionarProgramador(p2);
        projeto1.adicionarProgramador(p3);
        projeto1.adicionarProgramador(p4);
        projeto1.adicionarProgramador(p5);

        projeto1.listarProgramadores();
        projeto2.listarProgramadores();

    }
}