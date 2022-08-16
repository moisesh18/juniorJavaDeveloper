public class Node
{
    private int key;
    private Object e;
    private Node left,rigth,up;

    public Node(){
        setKey(0);
        setE(null);
    }

    public Node (int key, Object e){
       this.setKey(key);
        this.setE(e);
    }

    public int getKey(){
        return key;
    }

    public Node getLeft(){
        return left;
    }

    public Node getRigth(){
        return rigth;
    }

    public Node getUp(){
        return up;
    }
    
    public Object getE(){
    	return e;
    }

    public void setKey(int key){
        this.key=key;
    }

    public void setLeft(Node left){
        this.left=left;
    }

    public void setRigth(Node rigth){
        this.rigth=rigth;
    }

    public void setUp(Node up){
        this.up=up;
    }

    public void setE(Object e){
    	this.e=e;
    }
    
}
