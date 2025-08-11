public class Tecnico extends Aluno {

    private boolean registroProfissional;
    public void praticar() {
        System.out.println("O " + this.nome + " está praticando!");
    }

    public boolean getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(boolean registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
