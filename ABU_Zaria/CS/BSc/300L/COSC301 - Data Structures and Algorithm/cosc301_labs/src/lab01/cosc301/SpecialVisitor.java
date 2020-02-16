package lab01.cosc301;

public class SpecialVisitor extends AbstractVisitor{
    private Comparable target;
    private int n;
    private int count;
    
    public SpecialVisitor(Comparable target, int n){
        this.target = target;
        this.n = n;
    }

    @Override
    public void visit(Object object) {
           Comparable visitor = (Comparable) object;
           if(visitor.equals(target)){
               count++;
           }
    }
    
    @Override
    public boolean isDone(){
        return count == n;
    }
    
    public boolean hasAtleastNobjects(){
        return count == n; // return isDone();
    }
}
