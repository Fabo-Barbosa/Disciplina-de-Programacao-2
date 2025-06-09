public class ControleRemoto {
    private Televisao tv;

    public ControleRemoto(Televisao tv) {
        this.tv = tv;
    }

    public void aumentarVolume() {
        tv.aumentarVolume();
    }

    public void diminuirVolume() {
        tv.diminuirVolume();
    }

    public void proximoCanal() {
        tv.proximoCanal();
    }

    public void canalAnterior() {
        tv.canalAnterior();
    }

    public void mudarCanal(int canal) {
        tv.mudarCanal(canal);
    }

    public int consultarVolume() {
        return tv.getVolume();
    }

    public int consultarCanal() {
        return tv.getCanal();
    }
}
