package cadastrouser;


public class Cadastro {

    private String name = "Ivan";

    private int idade = 32;

    private String userName = "navi23";

    public String email = "ivan123@gmail.com";

    public float senha = 123;

    private boolean statusCadastro = false;

    public Cadastro() {
        super();
    }

    public Cadastro(String name, int idade, String userName, String email, float senha) {
        this.name = name;
        this.idade = idade;
        this.userName = userName;
        this.email = email;
        this.senha = senha;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSenha() {
        return senha;
    }

    public void setSenha(float senha) {
        this.senha = senha;
    }

    public boolean isStatus() {
        return statusCadastro;
    }

    public void UserCadastrado() {

        String name = "Rita";
        String userName = "rita27";
        String email = "ritadek2016@hotmail.com";
        float senha = 1234;

        Cadastro cadastro = new Cadastro();

        cadastro.setName(name);
        cadastro.setUserName(userName);
        cadastro.setEmail(email);
        cadastro.setSenha(senha);

    }

    public boolean verificaCadastro(String UserName) {
        if (UserName == getUserName()) {
            return true;
        } else {
            return false;
        }

    }

    public boolean verificaCadastroPorEmail(String email) {
        if (email == getEmail()) {
            return true;
        } else {
            return false;
        }

    }


}


