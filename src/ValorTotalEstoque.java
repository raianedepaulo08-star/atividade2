
public class ValorTotalEstoque {
    private String nome;
    private double preco;
    private int quantidade;

    public ValorTotalEstoque(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Preço inválido");
        } else {
            this.preco = preco;
        }
    }
        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade( int Quantidade){
            if (Quantidade < 0){
                System.out.println("Quantidade inválido");
            } else {
                this.quantidade = Quantidade;
            }
        }
        public void entradaEstoque( int qtd){
        quantidade = quantidade + qtd;
        }
        public void saidaEstoque(int qtd) {
            if (qtd > quantidade) {
                System.out.println("Estoque insuficiente");
            } else {
                quantidade = quantidade - qtd;
            }
        }
        public double valorTotalEstoque(){
        return preco * quantidade;
        }
    }


