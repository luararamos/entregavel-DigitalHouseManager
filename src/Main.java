public class Main {
    public static void main(String[] args) {

        DigitalHouseManager digitalHouseManager = new DigitalHouseManager ();

        digitalHouseManager.registrarProfessorTitular ("Fábio","Tadashi",5201,"Android");
        digitalHouseManager.registrarProfessorAdjunto ("Guilherme","Sartori",5202,6);
        digitalHouseManager.registrarProfessorAdjunto ("Guilherme","Sartori",5202,6);

        System.out.println ("------------------------------------");

        digitalHouseManager.registrarUmCurso ("Full Stack",20001,3);
        digitalHouseManager.registrarUmCurso ("Android",20002,2);
        digitalHouseManager.registrarUmCurso ("Android",20002,2);

        System.out.println ("------------------------------------");


        digitalHouseManager.alocarProfessores (20001,5201,5202);

        System.out.println ("------------------------------------");

        digitalHouseManager.matricularAluno ("Luara","Ramos",201801);
        System.out.println ("------------------------------------");
        digitalHouseManager.matricularAluno (201801,20002);


        System.out.println ("------------------------------------");

        digitalHouseManager.matricularAluno ("Jade","Inarelli",201802);
        System.out.println ("------------------------------------");
        digitalHouseManager.matricularAluno (201802,20001);

        System.out.println ("------------------------------------");

        digitalHouseManager.matricularAluno ("Brian","Rodrigues",201803);
        System.out.println ("------------------------------------");
        digitalHouseManager.matricularAluno (201803,20002);
        digitalHouseManager.matricularAluno (201803,20001);

        System.out.println ("------------------------------------");
        digitalHouseManager.matricularAluno (201803,20001);
        System.out.println ("------------------------------------");

        digitalHouseManager.excluirAluno (201802);
        System.out.println ("------------------------------------");

        digitalHouseManager.excluirAluno (201802);



    }
}
