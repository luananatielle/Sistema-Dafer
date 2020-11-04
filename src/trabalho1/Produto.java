package trabalho1;
public class Produto {
    private int codigo;
    private String nome;
    private String descricao;
    private int estoque;
    private float preco;

    public Produto(int cod,String nome,String desc, int estoque, float preco){
        this.codigo=cod;
        this.nome=nome;
        this.descricao=desc;
        this.estoque=estoque;
        this.preco=preco;
    }
    
    public int getCod(){
        return this.codigo;
    }
    public String getNome(){    
        return this.nome;
    }
    public String getDesc(){
        return this.descricao;
    }
    public int getEstoque(){
        return this.estoque; 
    }
    public float getPreco(){
        return this.preco;
    }
    public void setCod(int cod){
        this.codigo=cod;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
    public void setEstoque(int estoque){
        this.estoque=estoque;
    }
    public void setPreco(float preco){
        this.preco=preco;
    }
    
    //Almenta estoque do produto
    public void adicionarAoEstoque(int qtd){
        this.estoque+=qtd;  
    }
    //diminui estoque do produto
    public void diminuirEstoque(int qtd){
        this.estoque-=qtd;
    }
    //organizada dados para serem mostrados
    public String recuperarDado(){
        String dado="";
        dado+="Produto:"+"\n"+"Código:"+ codigo+ "\n" +"Nome:"+ nome + "\n"+ "Descrição: "+ descricao + "\n"+ "Quantidade em estoque:" + estoque + "\n" +"Preço: "+ preco + "\n";
        return dado;
    }
            
}