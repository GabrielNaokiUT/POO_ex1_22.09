class Estagiario extends Funcionario {

    public Estagiario(){
        this.salarioBase = salarioBase;
    }

    @Override
    public Double calcularSalario(){
        return salarioBase / 2;
    }
    public void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: Estagiário"); 
        System.out.printf("Salário total: R$ %.2f\n",calcularSalario());
        System.out.println();
    }
}

