class Programador extends Funcionario{

    public Programador(){
        this.salarioBase = salarioBase;
    }

    @Override
    public Double calcularSalario(){
        return salarioBase + horasextras * 50;
    }
    public void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: Programador"); 
        System.out.printf("Salário total: R$ %.2f\n",calcularSalario());  
        System.out.println();                                         

    }
} 
