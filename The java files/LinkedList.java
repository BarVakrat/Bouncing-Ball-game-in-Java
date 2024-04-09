package gamebox_Final;

/**
 * This is a simple LinkedList class that implements LinkedListInterface.
 *
 */
public class LinkedList implements LinkedListInterface{
	private NodeInterface head;
	@Override
	public Node  getHead() {
		Node p = (Node) head;
		return p;
	}

	@Override
	public void add(NodeInterface p) {
		NodeInterface q = head;
		if (q == null)
			head = p;
		else {
			while (q.getNext() != null) {
				q = q.getNext();
			}
			q.setNext(p);
		}
	}

	@Override
	public void remove(NodeInterface p) {
		NodeInterface q = head;
		NodeInterface q1 = head;
		if(p==head)
			 head=head.getNext();
		else q1=head.getNext();
		while(q1!=p) {
			q=q.getNext();
			q1=q1.getNext();
		}
		q.setNext(q1.getNext());
			
		}

}




