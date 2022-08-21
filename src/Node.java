public class Node {
    public int data;
    public Node link;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }

    public Node() {
    }

    public Node(int data) {
        this.data = data;
    }
}
