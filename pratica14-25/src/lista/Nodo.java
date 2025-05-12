package lista;

public class Nodo<T>{
    private T informazione;
    private Nodo<T> puntatore;

    //Costruttore
    public Nodo(T informazione, Nodo puntatore) {
        this.informazione = informazione;
        this.puntatore = puntatore;
    }

    //Getter e Setter
    public T getInformazione() { return informazione; }
    public void setInformazione(T informazione) { this.informazione = informazione; }
    public Nodo<T> getPuntatore() { return puntatore; }
    public void setPuntatore(Nodo<T> puntatore) { this.puntatore = puntatore; }

    //Equals e toString
    @Override
    public boolean equals(Object o){
        if (o instanceof Nodo){
            Nodo<T> r=(Nodo<T>) o;
            return informazione.equals(r.getInformazione());
        }
        return false;
    }

    @Override
    public String toString(){ return informazione.toString(); }
}
