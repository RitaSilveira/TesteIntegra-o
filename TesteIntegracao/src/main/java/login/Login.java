package login;

public class Login {

    public Login(String logado_com_sucesso) {

    }

    public String loginPorEmail (String email, float senha) throws Exception{
        if (email == getEmail() && senha == getSenha()) {
            return "Logado com Sucesso";
        }else if (email == getEmail() && senha != getSenha()){
            throw new Exception("Senha Incorreta, por favor, tente novamente");
        }else {
            throw new Exception("Usuário não cadastrado, por favor, realize o cadastro");
        }
    }

    private float getSenha() {
        return getSenha();
    }

    private String getEmail() {
        return getEmail();
    }

    private String getUserName() {
        return getUserName();
    }



    public String loginPorUserName (String logado_com_sucesso, String UserName) throws Exception {
        if (UserName == getUserName() ) {
            return "Logado com Sucesso";
        }else if (UserName == getUserName()) {
            throw new Exception("Senha Incorreta, por favor, tente novamente");
        }else {
            throw new Exception("Usuário não cadastrado, por favor, realize o cadastro");
        }

    }



}
