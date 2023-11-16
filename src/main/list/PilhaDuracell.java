public class PilhaDuracell {
    ListaLigada lista=null;
    
    public boolean isEmpty(){
        if(lista.cabeca==null){
            return true; 
        }
        return false;
    }

    public void push(int item){
        lista.insereInicio(item);
    }

    public int pop(){
        int a = lista.getValorInicio();
        lista.removeInicio();
        return a;
    }
}