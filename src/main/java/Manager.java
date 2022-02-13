public class Manager {
    public String messageAboutRenewal(String mensagem){
        return Control.getInstancia().receiveMessageAboutRenewal(mensagem);
    }

    public String messageAboutIncrease(String mensagem){
        return Control.getInstancia().receiveMessageAboutIncrease(mensagem);
    }

    public String messageAboutTermination(String mensagem){
        return Control.getInstancia().receiveTerminationMessage(mensagem);
    }
}
