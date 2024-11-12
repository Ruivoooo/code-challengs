package desafios.com.logica.IfElse.Cardapio;

import java.util.Scanner;

public class CardapioItens {
    private int codigo;
    private String especificacao;
    private double preco;
    private int quantidade;


    Scanner scanner = new Scanner(System.in);

    public CardapioItens(int codigo, String especificacao, double preco){}
    public CardapioItens(){}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void cachorroQuente(){
        System.out.println("Qual a quantidade que você deseja ?");
        quantidade = scanner.nextInt();
        preco = 4 * quantidade;
        System.out.println("Total: R$ " + preco);
    }
    public void xSalada(){
        System.out.println("Qual a quantidade que você deseja ?");
        quantidade = scanner.nextInt();
        preco = 4.50 * quantidade;
        System.out.println("Total: R$ " + preco);
    }
    public void xBacon(){
        System.out.println("Qual a quantidade que você deseja ?");
        quantidade = scanner.nextInt();
        preco = 5 * quantidade;
        System.out.println("Total: R$ " + preco);
    }
    public void torradaSimples(){
        System.out.println("Qual a quantidade que você deseja ?");
        quantidade = scanner.nextInt();
        preco = 2 * quantidade;
        System.out.println("Total: R$ " + preco);
    }
    public void refrigerante(){
        System.out.println("Qual a quantidade que você deseja ?");
        quantidade = scanner.nextInt();
        preco = 1.5 * quantidade;
        System.out.println("Total: R$ " + preco);
    }


}
