public class Funcionario{
    String nome;
    Double salarioBase;
    Double bonus;
    int horasextras;

    public Double calcularSalario(){
        return salarioBase;
    }
    public void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: Funcionário");
        System.out.printf("Salário total: R$ ¢.2f\n",calcularSalario());
        System.out.println();
    }
}
