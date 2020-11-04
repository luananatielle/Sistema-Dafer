package trabalho1;
public class Venda {
    private Cliente cliente;
    private Produto prod;
    private String dataVenda;
    private int qtd;
    private float preco;
    
  
    public Cliente getCliente(){
        return this.cliente;
    }
    public Produto getProduto(){
        return this.prod;
    }
    public String getData(){
        return this.dataVenda;
    }
    public int getQtd(){
        return this.qtd;
    }
    
    public float getPreco(){
        return this.preco;
    }
    public void setCliente(Cliente c){
        this.cliente=c;
    }
    public void setProduto(Produto p){
        this.prod=p;
    }
    public void setData(String data){
        this.dataVenda=data;
    }
    public void setQtd(int qtd){
        this.qtd=qtd;
    }
    public void setPreco(float preco){
        int q=getQtd();
        preco*=q;
        this.preco=preco;
    }
    
  
    //organiza os dados
    public String recuperarDado(){
        String dado="";
        dado+="Venda"+"\n"+"Cliente:"+ cliente.getNome() + "\n" +"Produto:"+ prod.getNome() + "\n"+ "Data da venda: "+ dataVenda + "\n"+ "Quantidade:" + qtd + "\n" + "Preço: "+ preco + "\n";
        return dado;
    }
}
