public class Curso {

    String sigla, nome, codigo;

    public Curso(String sigla, String nome, String codigo){
        this.sigla = sigla;
        this.nome = nome;
        this.codigo = codigo;
    }

    String getNome(){return this.nome;}
    String getSigla(){return this.sigla;}
    String getCodigo(){return this.codigo;}

    static Curso getCurso(String codigo){
        switch(codigo){
            case "1901":
                return new Curso("TRC", "Engenharia de Software", codigo);
            case "1902":
                return new Curso("TADS", "Análise e Desenvolvimento de Sistemas", codigo);
            case "1903":
                return new Curso("CC", "Ciência da Computação", codigo);
            case "1905":
                return new Curso("EC", "Engenharia da Computação", codigo);
            case "1906":
                return new Curso("ES", "Engenharia de Software", codigo);
            case "1907":
                return new Curso("SI", "Sistemas de Informação", codigo);
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        return "[" + codigo + "][" + sigla + "][" + nome + "]";
    }
}
