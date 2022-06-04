package user;

import cadastrouser.Cadastro;

public class User extends Cadastro {

    private String userName = getUserName();
    private String email = getEmail();
    private float senha = getSenha();

    public User(){
        super();
    }

    public String User () {

        String userName = "Renan";
        String email = "renan@gamil.com";
        float senha = 12345;

        User user = new User();

        user.setUserName(userName);
        user.setEmail(email);
        user.setSenha(senha);

        return User();

    }


}
