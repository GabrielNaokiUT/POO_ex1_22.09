class Gerente extends Funcionario{

    public Gerente(){ 
        this.salarioBase = salarioBase;
        this.bonus = bonus;       
    }

    @Override
    public Double calcularSalario(){
        return salarioBase + bonus;
        
    }
    public void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: Gerente"); 
        System.out.printf("Salário total: R$ %.2f\n",calcularSalario());
        System.out.println();                                           

    }
    
}
