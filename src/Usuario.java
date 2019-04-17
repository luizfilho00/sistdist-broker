import java.util.Scanner;

public class Usuario {

    private String rga, nome;
    private Curso curso;

    public Usuario(String nome, String codigoCurso, String rga) {
        this.nome = nome;
        this.rga = rga;
        this.curso = Curso.getCurso(codigoCurso);
    }

    public static Usuario cadastrarUsuario() {
        Scanner ler = new Scanner(System.in);
        String curso, nome, rga;
        System.out.print("Informe o código do seu curso: ");
        curso = ler.nextLine();
        System.out.print("\nInforme seu nome completo: ");
        nome = ler.nextLine();
        System.out.print("\nInforme seu rga: ");
        rga = ler.nextLine();
        ler.close();
        return new Usuario(nome, curso, rga);
    }

    public String getRga() {
        return rga;
    }

    public String getNome() {
        return nome;
    }

    public Curso getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + "\nRGA: " + rga + "\nCurso: " + curso;
    }
}
