package validacaoUserTest;

import cadastrouser.Cadastro;
import login.Login;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

public class CadastroDeUsuarioTest {

    @BeforeEach
        public void initEach() {
        System.out.println("Inicializando teste de cadastro de usuários");
    }

    @Test
    public void UserName (){
     Cadastro newUserName = mock(Cadastro.class);
     when(newUserName.verificaCadastro("rita27")).thenReturn(true);
        newUserName.verificaCadastro(String.valueOf(true));
        assertTrue(newUserName.verificaCadastro("rita27"));
        verify(newUserName).verificaCadastro("rita27");


    }

    @Test
    public void UserEmail (){
        Cadastro newUserEmail = mock(Cadastro.class);
        when(newUserEmail.verificaCadastroPorEmail("ritadek2017@hotmail.com")).thenReturn(false);
        newUserEmail.verificaCadastroPorEmail(String.valueOf(true));
        assertFalse(newUserEmail.verificaCadastroPorEmail("ritadek2016@hotmail.com"));
        verify(newUserEmail).verificaCadastroPorEmail("ritadek2016@hotmail.com");


    }

    @Test
    public void LoginSocial ()throws Exception{
        Login newLogin = mock(Login.class);
        when(newLogin.loginPorUserName("Logado com Sucesso"));
        newLogin.loginPorUserName("Logado com Sucesso");


        given(newLogin.loginPorUserName("Logado com Sucesso"));


    }




}
