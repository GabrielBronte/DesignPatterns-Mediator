public class Financial implements Sector{
    private static Financial instance = new Financial();

    private Financial() {}

    public static Financial getInstance(){
        return instance;
    }

    public String wantToRenew(){
        return "O financeiro recebeu o seu comunicado. Enviaremos uma proposta de um novo contrato em breve.";
    }

    public  String wantSalaryIncrease(){
        return "O financeiro recebeu o seu comunicado. Enviaremos uma contra-proposta em breve.";
    }

    public  String wantToTerminateContract(){
        return "O financeiro recebeu o seu comunicado. A multa de rescisão contratual será enviada em breve.";
    }

}
