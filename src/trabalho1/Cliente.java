package trabalho1;
public class Cliente {
    private String nome;
    private String telefone;
    private String cpf;
    private String endereco;
    
    public Cliente(String n,String t,String cpf,String end){
        this.nome=n;
        this.telefone=t;
        this.cpf=cpf;
        this.endereco=end;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getTel(){
        return this.telefone;
    }
    public String getCpf(){
        return this.cpf;
    }
    public String getEnd(){
        return this.endereco;
    }
    public void setNome(String n){
        this.nome=n;
    }
    public void setTel(String t){
        this.telefone=t;
    }
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
    public void setEnd(String end){
        this.endereco=end;
    }
    
    //Atualiza o endereço do cliente instanciado
    public void atualizarEnd(String end){
        setEnd(end);
    }
     //Atualiza o telefone do cliente instanciado
    public void atualizarTel(String tel){
        setTel(tel);
    }
    //Organiza os dados para serem mostrados
    public String recuperarDado(){
        String dado="";
        dado+="Cliente:"+"\n"+ "Nome:"+ nome+ "\n" +"Telefone:"+ telefone + "\n"+ "CPF: "+ cpf + "\n"+ "Endereço:" + endereco + "\n";
        return dado;
    }


    
}
