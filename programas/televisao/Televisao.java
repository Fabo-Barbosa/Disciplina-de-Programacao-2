public class Televisao {
    private int volume;
    private int canal;
    private ControleRemoto controle;

    public Televisao() {
        this.volume = 10;
        this.canal = 1;
        this.controle = new ControleRemoto(this); // Passa a própria TV para o controle
    }

    // Métodos usados pelo controle
    public void aumentarVolume() {
        if (volume < 100) volume++;
    }

    public void diminuirVolume() {
        if (volume > 0) volume--;
    }

    public void proximoCanal() {
        canal++;
    }

    public void canalAnterior() {
        if (canal > 1) canal--;
    }

    public void mudarCanal(int novoCanal) {
        if (novoCanal > 0) canal = novoCanal;
    }

    public int getVolume() {
        return volume;
    }

    public int getCanal() {
        return canal;
    }

    public ControleRemoto getControle() {
        return controle;
    }
}
