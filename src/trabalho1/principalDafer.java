/*A empresa Dafer Presentes, é uma loja que comercializa utensílios domésticos, brinquedos, 
itens de decoração e papelaria. 
A empresa não possui um controle de estoque e seu controle de vendas é feito manualmente. 
A Dafer Presentes pretende adquirir um sistema que controle o estoque de cada produto, as 
vendas feitas e armazene os dados dos seus clientes.
*/
package trabalho1;

public class principalDafer {

    public static void main(String[] args) {
        //instanciando objetos da classe cliente
        Cliente c1=new Cliente("Ana Francisca Chaves","(38)99955-2211","143.987.999-00","Rua:Hermilo Tupiná, 123, Centro, Lontra");
        Cliente c2=new Cliente("José Fernando de Assis","(31)99888-7766","234.231.222-99","Rua: João Pereira, 43, Flores, Lontra");
        Cliente c3=new Cliente("João Alfredo Magalhães","(38)99878-9898","453.345.232-22","Av.Montes Claros, 65, Centro, Lontra");
        
        //Mostrar os dados de um cliente
        System.out.println(c3.recuperarDado());
        
        //Atualiza dados: telefone e endereçoo
        c3.atualizarTel("(31)99999-8877");
        c3.atualizarEnd("Av.Belo Horizonte, 16, centro, Lontra");
        
        //Mostrar os dados de um cliente
        System.out.println("Após ter alterado o telefone e endereço:"+"\n"+c3.recuperarDado());
        
        
        //instanciando objetos da classe produto
        Produto p1=new Produto(03,"Caderno de desenho","96 folhas, de arame", 10, (float)6.50);
        Produto p2=new Produto(01,"Caneta Bic","Azul, tubo transparente",20,(float)2.00);
        Produto p3=new Produto(02,"Porta retrato","Material: vidro, para fotos 10x15",0,(float)10.00);
       
        //Mostrar os dados de um produto
        System.out.println(p3.recuperarDado());
        
        //Adicionar itens ao estoque
        p3.adicionarAoEstoque(10);
        
        //Mostrar os dados de um produto
        System.out.println("Após alterar a quantidade em estoque"+"\n"+p3.recuperarDado());
        
        //instanciando objetos da classe vendas
        Venda v1=new Venda();   
        v1.setCliente(c1);
        v1.setProduto(p3);
        v1.setData("10/10/2020");
        v1.setQtd(3);
        //verificando se possui a qtd desejada em estoque
        if(p3.getEstoque()<v1.getQtd()){
            System.out.println("Não há em estoque a quantidade desejada!");
            v1.setQtd(0);
        }else 
            // se houver qtd disponivel, diminui a quantidade em estoque
            p3.diminuirEstoque(3);
        v1.setPreco(p3.getPreco());
        
        //Mostrar os dados da venda
        System.out.println(v1.recuperarDado());
       
        //Mostrar os dados de um produto após alterar a quantidade em estoque
        System.out.println(p3.recuperarDado());
    }
    
}
