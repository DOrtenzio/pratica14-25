package lista;

public class ListeConcatenate<T> {
    private Nodo<T> head;
    private int size;

    //Costruttore
    public ListeConcatenate() {
        this.head = null;
        this.size=0;
    }

    //Getter e Setter
    public Nodo<T> getHead() { return head; }
    public void setHead(Nodo<T> head) { this.head = head; }
    public int getSize() { return size; }
    public void setSize(int size) { this.size = size; }

    //Metodi
    public boolean isEmpty(){ return size==0; }

    @Override
    public String toString(){
        String r="";
        Nodo<T> appoggio=head;
        while (appoggio.getPuntatore()!=null) {
            r=r+appoggio.toString(); //Costruisco la stringa
            appoggio=appoggio.getPuntatore(); //Ogni passo dopo
        }
        return r;
    }

    //Inserimenti
    public boolean addInTesta(T valDaAggiungere){
        if (isEmpty())
            head=new Nodo<T>(valDaAggiungere,null);
        else{
            Nodo<T> appoggio=head;
            head=new Nodo<T>(valDaAggiungere,appoggio);
        }
        size++;
        return true;
    }

    public boolean addInCoda(T valDaAggiungere){
        if (isEmpty())
            head=new Nodo<T>(valDaAggiungere,null);
        else{
            Nodo<T> app1=head;
            while (app1.getPuntatore()!=null) app1=app1.getPuntatore(); //Ogni passo dopo
            app1.setPuntatore(new Nodo<T>(valDaAggiungere,null));
        }
        size++;
        return true;
    }

    public boolean addInPosizione(int posizione, T valDaAggiungere) {
        if (isEmpty() && posizione < 0 && posizione > size)
            return false;
        else {
            int contApp = 0;
            Nodo<T> app1 = head;
            while (app1.getPuntatore() != null) {
                if (contApp == posizione) { //trovato
                    Nodo<T> app2=app1.getPuntatore();
                    app1.setPuntatore(new Nodo<T>(valDaAggiungere, app2));

                    size++;
                    return true;
                } else { //Incrementi
                    contApp++;
                    app1 = app1.getPuntatore(); //Ogni passo dopo
                }
            }
        }
        return false;
    }

    public boolean addBeforeElement(T valRicercato,T valDaAggiungere) {
        if (isEmpty())
            return false;
        else {
            //Nodi di appoggio
            Nodo<T> att = head;
            Nodo<T> prec=null;

            while (att.getPuntatore() != null) {
                if (att.equals(valRicercato)) {
                    if (prec != null) {
                        prec.setPuntatore(new Nodo<T>(valDaAggiungere, att));
                    } else {
                        head=new Nodo<T>(valDaAggiungere, att);
                    }
                    size++;
                    return true;
                } else { //Incrementi
                    prec = att;
                    att = att.getPuntatore();
                }
            }
        }
        return false;
    }

    //Cancellazioni
    public boolean cancellazione(T valRicercato) {
        if (isEmpty())
            return false;
        else {
            //Nodi di appoggio
            Nodo<T> att = head;
            Nodo<T> prec=null;

            while (att.getPuntatore() != null) {
                if (att.equals(valRicercato)) {
                    if (prec != null) {
                        prec.setPuntatore(att.getPuntatore());
                    } else {
                        head=att.getPuntatore();
                    }
                    size++;
                    return true;
                } else { //Incrementi
                    prec = att;
                    att = att.getPuntatore();
                }
            }
        }
        return false;
    }

}
