package smartphone;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone();

        //Reprodutor Musical
        meuiPhone.tocar();
        meuiPhone.pausar();
        meuiPhone.selecionarMusica("Imagine - Jhon Lennon");

        //Aparelho Telefonico
        meuiPhone.ligar("12345678");
        meuiPhone.atender();
        meuiPhone.iniciarCorreioVoz();

        //Navegador de Internet
        meuiPhone.exibirPagina("https://www.youtube.com/watch?v=9ou608QQRq8");
        meuiPhone.adicionarNovaAba();
        meuiPhone.atualizarPagina();
    }

    @Override
    public void exibirPagina(String url) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exibirPagina'");
    }

    @Override
    public void adicionarNovaAba() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionarNovaAba'");
    }

    @Override
    public void atualizarPagina() {
        //TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarPagina'");
    }

    @Override
    public void ligar(String numero) {
        //TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ligar'");
    }

    @Override
    public void atender() {
        //TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atender'");
    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iniciarCorreioVoz'");
    }

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tocar'");
    }

    @Override
    public void pausar() {
        //TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pausar'");
    }

    @Override
    public void selecionarMusica(String musica) {
        //TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selecionarMusica'");
    }
}
