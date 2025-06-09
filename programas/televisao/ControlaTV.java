public class ControlaTV {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        ControleRemoto controle = tv.getControle(); // Obtendo o controle da TV

        controle.aumentarVolume();
        controle.proximoCanal();
        controle.mudarCanal(7);

        System.out.println("Volume atual: " + controle.consultarVolume());
        System.out.println("Canal atual: " + controle.consultarCanal());
    }
}
