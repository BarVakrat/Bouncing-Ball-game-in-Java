package gamebox_Final;


/**
 * This class represents a single node in a LinkedList that implements LinkedListInterface.
 *
 */
public class Node implements NodeInterface{

	private GeoShape data;
	private NodeInterface next;
	

	public Node(GeoShape data, NodeInterface next) {
		this.data = data;
		this.next = next;
	}
	
	public GeoShape getData() {
		return data;
	}

	@Override
	public void setData(GeoShape g) {
		this.data = g;
	}
	
	@Override
	public NodeInterface getNext() {
		return next;
	}

	@Override
	public void setNext(NodeInterface next) {
	this.next = next;	
	}
	


}
