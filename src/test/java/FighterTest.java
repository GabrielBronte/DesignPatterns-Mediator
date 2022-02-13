import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FighterTest {
    @Test
    void deveSolicitarRenovaçaoContratual(){
        Fighter fighter = new Fighter();
        assertEquals("Recebemos o seu contato.\nO financeiro responde conforme a solicitação\n"+
                        ">>O financeiro recebeu o seu comunicado. Enviaremos uma proposta de um novo contrato em breve.",
                fighter.messageAboutRenewal("Preciso de uma resposta sobre meu futuro. Renovaremos com o UFC ou mudaremos de organização?"));
    }
    @Test
    void deveSolicitarAumentoSalarial(){
        Fighter fighter = new Fighter();
        assertEquals("Recebemos o seu contato.\nO financeiro responde conforme a solicitação\n"+
                        ">>O financeiro recebeu o seu comunicado. Enviaremos uma contra-proposta em breve.",
                fighter.messageAboutIncrease("Acredito que não estou sendo valorizado na companhia."));
    }

    @Test
    void deveSolicitarRescisaoContratual(){
        Fighter fighter = new Fighter();
        assertEquals("Recebemos o seu contato.\nO financeiro responde conforme a solicitação\n"+
                        ">>O financeiro recebeu o seu comunicado. A multa de rescisão contratual será enviada em breve.",
                fighter.messageAboutTermination("Quero me demitir dessa empresa!"));
    }
}