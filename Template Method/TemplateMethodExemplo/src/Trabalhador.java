public abstract class Trabalhador {
    public void executar(){
        iniciarRotina();
        levantar();
        irAoTrabalho();
        trabalhar();
        voltarDoTrabalho();
    }

    protected abstract void trabalhar();

    private void voltarDoTrabalho() {
        System.out.println("Voltar do trabalho");
    }

    private void irAoTrabalho() {
        System.out.println("Ir ao trabalho");
    }

    public void iniciarRotina(){
        System.out.println("Iniciando rotina");
    }
    public void levantar(){
        System.out.println("Levantando da cama");
    }
}
