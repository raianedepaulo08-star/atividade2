public class Main {
    public static void main(String[] args){
        ValorTotalEstoque p = new ValorTotalEstoque("Teclado",120,10);
        System.out.println("Preço: " + p.getPreco());

        p.setPreco(-50);
        System.out.println("Preço:" + p.getPreco());

        p.setPreco(150);
        System.out.println("Preço:" + p.getPreco());

        p.setQuantidade(-3);
        System.out.println("Quantidade:" + p.getQuantidade());

        p.setQuantidade(50);
        System.out.println("Quantidade:" + p.getQuantidade());
        p.entradaEstoque(5);
        p.saidaEstoque(3);
        p.saidaEstoque(1000);
        System.out.println("Quantidade:" + p.getQuantidade());
        System.out.println("Valor Total estoque:" + p.valorTotalEstoque());
    }
}
