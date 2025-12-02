
public class Binarytree{
    static class Node{
        int data;
        Node left;
        Node right;
   
     Node(int data){
      this.data=data;
      this.left=null;
      this.right= null;
}
}
static class Binary{
    static int ind=-1;
    public static Node build(int nodes[]){
        ind++;
        if(nodes[ind]==-1){
            return null;
        }
        else{
            Node n=new Node(nodes[ind]);
            n.left=build(nodes);
            n.right=build(nodes);
            return n;
        }
    }
}
public static void main(String args[]){
    int nodes[]={ 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
    Binary tree=new Binary();
    Node root=tree.build(nodes);
    System.out.println("root node is: "+root.data);
}
}