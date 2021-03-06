package projagenda;

public class Contato {
    private String nome;
    private String fone;
    private Data objData;
    
    public Contato(){
        this.objData = new Data();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public Data getObjData() {
        return objData;
    }

    public void setObjData(Data objData) {
        this.objData = objData;
    }

    @Override
    public String toString() {
        return "\n"
                + "Nome: " + nome + "\n"
                + "Telefone: " + fone + "\n"
                + "Data: " + objData;
    }
    
}
