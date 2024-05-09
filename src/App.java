public class App {
    public static void main(String[] args) throws Exception {
        CD damn = new CD("DAMN.", "Kdot", 13, 100);
        CD nevermind = new CD("nevermind", "Nirvana", 16, 120);
        CD abnormal = new CD("The New Abnormal","The Strokes", 15, 200);
        System.out.println(damn.toString());
        System.out.println(nevermind);
        if (nevermind.compareCD(damn)>0){
            System.out.println("nevermind è superione a DAMN.");
        }
        CD[] nono = {damn , nevermind};
        portaCD coso = new portaCD(nono);
        System.out.println(coso);
        coso.killCD(1);
        System.out.println(coso +""+ coso.getN());
        coso.setCD(nevermind, 5);
        System.out.println(coso+""+coso.getN());
        System.out.println(coso.cercaCD("nevermind"));
        CD[] non = {damn, abnormal};
        portaCD gigio = new portaCD(non);
        coso.setCD(damn, 6);
        gigio.setCD(damn, 10);
        System.out.println(gigio.confrontaCollezione(coso));
    }
}
