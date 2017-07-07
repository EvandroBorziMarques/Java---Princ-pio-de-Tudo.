package br.com.senac.poo;

/**
 * POO - Estudo das Classes - Exemplo de criação de outro objeto
 * @author Evandro Borzi Marques
 */
public class Ferrari {
    public static void main(String[] args) {
	Carro ferrari = new Carro();
	ferrari.ano = 2012;
	ferrari.cor ="Vermelho";
	System.out.println("Carro: Ferrari");
	System.out.println("Cor: " + ferrari.cor);
	System.out.println("Ano: " + ferrari.ano);
	ferrari.acelerar();
    }
    
}
