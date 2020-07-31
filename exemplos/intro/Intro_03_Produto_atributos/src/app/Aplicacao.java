package app;
class Aplicacao {
    public static void main(String args[])
    {
        Produto p = new Produto();

        p.descricao = "Shulambs";
        p.preco = 1.99F;
        p.quant = 200;
    
        System.out.println("Produto: " + p.descricao);
        System.out.println("Preço: " + p.preco);
        System.out.println("Estoque: " + p.quant);
        
        if (p.emEstoque())
            System.out.println("Produto em estoque.");
    }
}
