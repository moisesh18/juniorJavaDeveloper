import java.util.Queue;
import java.util.LinkedList;
public class Tree
{
	private Node root;
	
    public Tree(){
    	//this.root = new Node (k,e); 
    	root=null;
    	//int kand Object e
    }
    public Node getRoot(){
        if (root==null){
        	System.out.print("Tree have no root. It Can't print");
        }else{
        	return root;
        }
        return root;
    }
    public void getBST(int k){
    	if (root==null){
    	System.out.println("Tree have no root, it means " + k + " does not exist.");
    	}else{
    		Node tmp = move(k,root);
    		if (tmp.getKey()==k){
    		        String txt;
    		        
    		        if (tmp==root){
    		        	txt = "Root " +tmp.getE() + ": ";
    		        }else{
    		        	txt = "Node " +tmp.getE() + ": ";
        		        if (tmp.getUp()!=null){
        		        	txt+= "has as father " + tmp.getUp().getKey() + ". ";
        		        }
    		        }
    		        if (tmp.getLeft()!=null){
    		        	txt+= "Its left son is " + tmp.getLeft().getKey() + ", ";
    		        }
    		        if (tmp.getRigth()!=null){
    		        	txt+= "Its rigth son is " + tmp.getRigth().getKey() + ". ";
    		        }
    		        System.out.println(txt);
    		}else{
    			System.out.println("There is not Node with the key: " + k);
    		}
    	}
    }
    public void setBST(int k, Object e){
    	Node Node = new Node(k,e);
    	if (root==null){
    		root = Node;
    	}else{
    		Node tmp = move(k,root);	
			if (tmp.getKey()==k){ 
			tmp.setE(Node.getE());
			}else if (k<tmp.getKey()){
					tmp.setLeft(Node);
					Node.setUp(tmp);
			}else if (k>tmp.getKey()){
				    tmp.setRigth(Node);
				    Node.setUp(tmp);
			}
	    }
	}
    public void remove(int k){
        Node n = move (k,root);
        if (n==null || n.getKey()!=k){
        	System.out.println("Node " + k + " does not exist.");
        }else{
        //n is a sheet
        if (n.getLeft()==null && n.getRigth()==null){
            System.out.println("Node with key "+n.getKey() +" and Object " + n.getE() + ", with Father " + n.getUp().getKey() + " was deleted.");
            NodeElimination(n);
        }

        //n have two children
        else if (n.getLeft()!=null && n.getRigth()!=null){
            Node tmp = LittleNode(n.getRigth());
            System.out.println("Node with key "+n.getKey() +" and Object " + n.getE() + " was deleted. Now Node with key " +tmp.getKey() + " take its place.");
            n.setKey(tmp.getKey());
            n.setE(tmp.getE());
            
            if (tmp.getRigth()==null){
            	tmp.getUp().setLeft(null);
            }else{
            	tmp.getRigth().setUp(tmp.getUp());
            	tmp.getUp().setLeft(tmp.getRigth());
            }
            
            NodeElimination(tmp);
        } 
        //n have a son
        else if (n.getLeft()!=null || n.getRigth()!=null){
            if (n==root){
                System.out.println("Root with key "+n.getKey() +" and Object " + n.getE() + ", was deleted.");
                NodeElimination(n);
            }else{
                if (n.getLeft()!=null){
                    System.out.println("Node with key "+n.getKey() +" and Object " + n.getE() + " was deleted and its left son (" +n.getLeft().getKey() + ") now is " + n.getUp().getKey() + "'s son.");
                    n.getUp().setLeft(n.getLeft());
                    n.getLeft().setUp(n.getUp());
                }
                if (n.getRigth()!=null){
                    System.out.println("Node with key "+n.getKey() +" and Object " + n.getE() + " was deleted and its rigth son (" +n.getRigth().getKey() + ") now is " + n.getUp().getKey() + "'s son.");
                    n.getUp().setRigth(n.getRigth());
                    n.getRigth().setUp(n.getUp());
                }
            }
        }
        }
    }
    public Node move(int key, Node tmp){
    	if (tmp==null){
    		return null;
    	}else{
	    	if (tmp.getKey()==key){
	    		return tmp;
	    	}    	
	    	if (tmp.getKey()<key){
	    		if (tmp.getRigth()!=null){
	    			tmp = move(key,tmp.getRigth());
	    		}else{
	    			return tmp;
	    		}
	    	}    	
	    	if (tmp.getKey()>key){
	    		if (tmp.getLeft()!=null){
	    			tmp = move(key,tmp.getLeft());
	    	  	}else{
	    			return tmp;
	    		}    		
	    	}    	
	    	return tmp;
    	}
	    }
    public void NodeElimination(Node n){
    	if (n==root){
        	if (n.getLeft()!=null){
        		root=n.getLeft();   
        		n.setUp(null);
        		}else{
        		root=n.getRigth();
        		n.setUp(null);
            	}	
    	}else{    	
	    	if (n.getUp().getLeft()==n){
	    		n.getUp().setLeft(null);
	    	}else if (n.getUp().getRigth()==n){
	    		n.getUp().setRigth(null);
	    	}
			n.setUp(null);
    	}
    }
    public Node LittleNode (Node tmp){
    	if (tmp.getLeft()!=null){
    		tmp = LittleNode(tmp.getLeft());
    	}
    	return tmp;
    }
    public void PrintByLevel (Node x){
        Queue <Node> cola = new LinkedList <Node> ();
        do{
            if (x!=null){
                System.out.print(x.getKey()+",");
                if (x.getLeft()!=null){
                    cola.offer(x.getLeft());
                }
                if (x.getRigth()!=null){
                    cola.offer(x.getRigth());
                }
            }
        }while(!cola.isEmpty());
    }
    public void PrintPreOrder (Node x){
        if (x!=null){
            System.out.print(x.getE());
            if (x.getLeft()!=null){
                PrintPreOrder(x.getLeft());
            }
            if (x.getRigth()!=null){
                PrintPreOrder(x.getRigth());
            }
        }
    }
    public void Print (Node x){
        if (x!=null){
            if (x.getLeft()!=null){
                Print(x.getLeft());
            }
            System.out.print(x.getKey() + ", ");
            if (x.getRigth()!=null){
                Print(x.getRigth());
            }
        }
    }
    public void PrintPostOrder (Node x){
        if (x!=null){
            if (x.getLeft()!=null){
                PrintPostOrder(x.getLeft());
            }
            if (x.getRigth()!=null){
                PrintPostOrder(x.getRigth());
            }
            System.out.println(x.getKey());
        }
    }
    
}