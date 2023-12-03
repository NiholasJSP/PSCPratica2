package herançaB;

import javax.swing.JOptionPane;

public class Amigo extends PF {
    private String blog;

    public Amigo() {
        super();
        blog = "";
    }

    public Amigo(String nome, String telefone, String endereco, String RG, String CPF, String blog) {
        super(nome, telefone, endereco, RG, CPF);
        this.blog = blog;
    }

    @Override
    public void exibe() {
        super.exibe();
        JOptionPane.showMessageDialog(null, "Blog: " + blog);
    }
}
