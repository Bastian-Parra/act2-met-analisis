public class ProxyHabilidadLuchador implements luchador {
    private luchador luchadorReal;
    private int rondaActual;

    public ProxyHabilidadLuchador(luchador luchadorReal, int rondaInicial) {
        this.luchadorReal = luchadorReal;
        this.rondaActual = rondaInicial;
    }

    public void setRondaActual(int rondaActual) {
        this.rondaActual = rondaActual;
    }

    @Override
    public String atacar() {
        if (rondaActual >= 1) {
            return luchadorReal.atacar();
        } else {
            return "¡No has alcanzado esta habilidad aún!";
        }
    }

    @Override
    public String defender() {
        if (rondaActual >= 2) {
            return luchadorReal.defender();
        } else {
            return "¡No has alcanzado esta habilidad aún!";
        }
    }

    @Override
    public String poderEspecial() {
        if (rondaActual >= 3) {
            return luchadorReal.poderEspecial();
        } else {
            return "¡No has alcanzado esta habilidad aún!";
        }
    }

    @Override
    public String usarArma() {
        if (rondaActual >= 4) {
            return luchadorReal.usarArma();
        } else {
            return "¡No has alcanzado esta habilidad aún!";
        }
    }

    @Override
    public void recibirDano(int dano) {
        luchadorReal.recibirDano(dano);
    }

    @Override
    public boolean estaVivo() {
        return luchadorReal.estaVivo();
    }

    @Override
    public int getVida() {
        return luchadorReal.getVida();
    }

    @Override
    public void setVida(int vida) {
        luchadorReal.setVida(vida);
    }

    @Override
    public int getVidaMaxima() {
        return luchadorReal.getVidaMaxima();
    }
    @Override
    public void incrementarPoderAtaque(int puntosDanoExtra) {
        luchadorReal.incrementarPoderAtaque(puntosDanoExtra);
    }
}
