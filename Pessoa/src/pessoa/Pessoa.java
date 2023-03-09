package pessoa;
import javax.swing.JOptionPane;
/**
 *
 * @author Gigi Ap
 */
public class Pessoa {
    private String Nome;
    private String Endereco;
    private String Telefone;

    public Pessoa(){
     this("","","");
    }
    public Pessoa(String nome, String endereco, String telefone){
        this.Nome= nome;
        this.Endereco= endereco;
        this.Telefone= telefone;
    }
    //Aqui tem os gets e sets
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        this.Nome = JOptionPane.showInputDialog("Digite aqui o seu nome: ");
    }
    public String getEndereco() {
        return Endereco;
    }
    public void setEndereco(String endereco) {
        this.Endereco = JOptionPane.showInputDialog("Agora, digite aqui o seu endereço: ");
    }
    public String getTelefone() {
        return Telefone;
    }
    public void setTelefone(String telefone) {
        this.Telefone = JOptionPane.showInputDialog("Digite aqui o seu telefone: ");
    }
    //Metodo
    public void InserirDadosPessoa(){
        JOptionPane.showMessageDialog(null, "Olá, seja bem vindo (a) a nossa área de cadastro!");
        setNome(Nome);
        setEndereco(Endereco);
        setTelefone(Telefone);
    }
    public void ApresentarDados(){
        
        JOptionPane.showMessageDialog(null, "De acordo com o que foi digitado, confira os seguintes dados: \n"
                    + "Nome: " +getNome()
                    + "\n Endereço: " +getEndereco()
                    + "\n Telefone: " +getTelefone());
        JOptionPane.showMessageDialog(null, "Parabéns, os seus dados foram salvos com sucesso!!!");
    }
}