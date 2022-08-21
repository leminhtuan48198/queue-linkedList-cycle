public class Queue {
    private Node rear;
    private Node front;
    public void enQueue(int data){
        Node temp=new Node(data);
        if(rear==null){
            front=rear=temp;
            temp.link=temp;
        }else {
            rear.link=temp;
            rear=temp;
            temp.link=front;
        }
    }
    public void deQueue(){
        if(front==null){
            return;
        }else{
            if(front==rear){
                front=rear=null;
            }else {
                front=front.link;
                rear.link=front;
            }
        }

    }
    public void displayQueue(){
        Node temp=front;
        if(temp==null){
            System.out.println("empty");
        }else {
            System.out.println(temp.data);
             while (temp!=rear) {
            temp=temp.link;
            System.out.println(temp.data);
        }
        }

    }
}
