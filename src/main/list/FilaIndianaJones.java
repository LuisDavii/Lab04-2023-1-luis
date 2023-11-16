public class FilaIndianaJones implements FilaIndiana{
    
    PilhaDuracell pilha2=null;
    PilhaDuracell pilha1=null;

    public void	enqueue(int item){
        pilha1.push(item);
    }

    public int	dequeue(){
        if(pilha2!=null){
            return pilha2.pop();
        }
            return pilha1.pop();
        
    }

    public boolean isEmpty(){
        if(pilha1==null){
            return true;
        }
        return false;

    }

    public int	size(){
        return pilha1.indiceFinal()+pilha2.indiceFinal();
    }

}