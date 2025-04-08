public class Loja {
    public static void main(String[] args) {
        Produto[] produtos = {
            new Produto("Celular", 2000.0, 0.10), //Descontos
            new Produto("Notebook", 4500.0, 0.15),
            new Produto("Tablet", 1500.0, 0.05)
        };
        //imprime o preço final 
        for (Produto produto : produtos) {
            System.out.println(produto.gerarDescricaoPrecoFinal());
        }
    }
}
//representa o produto com preço, nome e desconto
class Produto {
    private String nome;
    private double preco;
    private double desconto;
    
    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }
    //calculo do desconto baseado no percentual
    public double calcularDesconto() {
        return preco * desconto;
    }
    //retorna o preço com desconto
    public double calcularPrecoFinal() {
        return preco - calcularDesconto();
    }
    //string gerada formatada para a exibição
    public String gerarDescricaoPrecoFinal() {
        return String.format("%s - Preço final: R$ %.2f", nome, calcularPrecoFinal());
    }
}