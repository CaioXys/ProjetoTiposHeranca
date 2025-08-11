public abstract class Pessoa {

    private String nome;
    private int idade;
    private String sexo;

    public final void fazerAniv() {
        this.idade++;
    }

    class Visitante extends Pessoa {

    }

    class Aluno extends Pessoa {
        private int matricula;
        private String curso;
        public void PagarMensalidade() {

        }
    }

    class Bolsista extends Aluno {
        private int bolsa;
        public void RenovarBolsa() {

        }

        @Override
        public void PagarMensalidade() {

        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    // Pessoa p1 = new Pessoa(); // Não funciona pois a classe é abstrata
    Visitante v1 = new Visitante();
    Aluno a1 = new Aluno();
    Bolsista b1 = new Bolsista();

}
