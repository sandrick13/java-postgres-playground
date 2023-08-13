package com.example;

class Cliente {
    double renda;
    char sexo;
    int anoNascimento;
}

public class Classes {
    
    public static void main(String[] args) {
        System.out.println("Criando classes");
        Cliente cliente = new Cliente();
        cliente.renda = 1000;
        cliente.sexo = 'M';
        cliente.anoNascimento = 1980;
        System.out.println("Renda: " + cliente.renda);
        System.out.println("Sexo: " + cliente.sexo);
        System.out.println("Ano de nascimento: " + cliente.anoNascimento);

        Cliente cliente2 = new Cliente();
        cliente2.renda = 2000;
        cliente2.sexo = 'F';
        cliente2.anoNascimento = 1970;

        System.out.println("Renda: " + cliente2.renda);
        System.out.println("Sexo: " + cliente2.sexo);
        System.out.println("Ano de nascimento: " + cliente2.anoNascimento);

    }
    
}
