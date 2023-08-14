package com.example;

class Cliente {
    private double renda;
    private char sexo;
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    private int anoNascimento;

    public double getRenda(){
        return renda;
    }

    public void setRenda (double renda){
        if(renda >= 0)
            this.renda = renda;
        else System.out.println("A renda deve ser maior que zero");
    }
}

public class Classes {
    
    public static void main(String[] args) {
        System.out.println("Criando classes");
        Cliente cliente = new Cliente();
        cliente.setRenda(renda:-1000);
        cliente.setSexo(sexo:'M');
        cliente.SetAnoNascimento(anoNascimento: 1980);
        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Ano de nascimento: " + cliente.getAnoNascimento());

        Cliente cliente2 = new Cliente();
        cliente2.setRenda(renda: 2000);
        cliente2.setSexo(sexo:'s');
        cliente2.SetAnoNascimento(anoNascimento: 1970);
        System.out.println();

        System.out.println("Renda: " + cliente2.getRenda());
        System.out.println("Sexo: " + cliente2.getSexo());
        System.out.println("Ano de nascimento: " + cliente2.getAnoNascimento());

    }
    
}
