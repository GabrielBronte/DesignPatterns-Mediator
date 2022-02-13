public class Control {
    private static Control instancia = new Control();

    private Control() {}

    public static Control getInstancia(){
        return instancia;
    }

    public String receiveMessageAboutRenewal(String mensagem){
        return  "Recebemos o seu contato.\n"+
                "O financeiro responde conforme a solicitação\n"+
                ">>" +  Financial.getInstance().wantToRenew();
    }
    public String receiveMessageAboutIncrease(String mensagem){
        return  "Recebemos o seu contato.\n"+
                "O financeiro responde conforme a solicitação\n"+
                ">>" +  Financial.getInstance().wantSalaryIncrease();
    }
    public String receiveTerminationMessage(String mensagem){
        return  "Recebemos o seu contato.\n"+
                "O financeiro responde conforme a solicitação\n"+
                ">>" +  Financial.getInstance().wantToTerminateContract();
    }
}
