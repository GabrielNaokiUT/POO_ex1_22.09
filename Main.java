public class Main {

    public static void main(String[] args){

        Funcionario[] funcionario = new Funcionario[3];

        Gerente gerente = new Gerente();
        gerente.nome = "José";
        gerente.bonus = 1250.49;
        gerente.salarioBase = 12687.38;
        Estagiario estagiario = new Estagiario();
        estagiario.nome = "João";
        estagiario.salarioBase = 1750.29;
        Programador programador = new Programador();
        programador.nome = "Gabriel Naoki";
        programador.horasextras = 12;
        programador.salarioBase = 7549.23;

        funcionario[0] = gerente;
        funcionario[1] = estagiario;
        funcionario[2] = programador;

        for(int i = 0; i < funcionario.length; i++){
            funcionario[i].mostrarInfo();
        }
    }
}
