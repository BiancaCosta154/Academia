import javax.swing.*;

public class ClasseClientes {
    private int id;
    private String jfNome;
    private String tfCpf;
    private String tfEmail;
    private String tfTelefone;

//questão de segurança e encapsulamento


    public ClasseClientes(int id, String jfNome, String tfCpf, String tfEmail, String tfTelefone) {
        this.id = id;
        this.jfNome = jfNome;
        this.tfCpf = tfCpf;
        this.tfEmail = tfEmail;
        this.tfTelefone = tfTelefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJfNome() {
        return jfNome;
    }

    public void setJfNome(String jfNome) {
        this.jfNome = jfNome;
    }

    public String getTfCpf() {
        return tfCpf;
    }

    public void setTfCpf(String tfCpf) {
        this.tfCpf = tfCpf;
    }

    public String getTfEmail() {
        return tfEmail;
    }

    public void setTfEmail(String tfEmail) {
        this.tfEmail = tfEmail;
    }

    public String getTfTelefone() {
        return tfTelefone;
    }

    public void setTfTelefone(String tfTelefone) {
        this.tfTelefone = tfTelefone;
    }
}