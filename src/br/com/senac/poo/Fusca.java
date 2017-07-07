package br.com.senac.poo;

/**
 *  POO - Estudo das Classes - Exemplo de criação de um objeto
 * @author Evando Borzi Marques
 */
public class Fusca {
    public static void main(String[] args) {
	//a linha abaixo cria um objeto ("instancia") um objeto tendo como modelo a classe Carro
	Carro fusca = new Carro();
	fusca.ano = 1968;
	fusca.cor = "Azul";
	System.out.println("Carro: Fusca");
	System.out.println("Cor: " + fusca.cor);
	System.out.println("Ano: " + fusca.ano);
	fusca.acelerar();
    }
}
