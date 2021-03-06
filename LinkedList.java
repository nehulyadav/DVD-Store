
public class LinkedList<T> implements ListInterface<T> {

    // ========================================================================
    // List Implementation ----------------------------------------------------
    // ========================================================================

    // Properties and Variables -----------------------------------------------
    private Node firstNode;
    private int numberOfEntries;

    // Constructor
    public LinkedList() {
        initializeDataFields();
    }

    // Public Methods ---------------------------------------------------------
    @Override
    public void add(T newEntry) {
        Node newNode = new Node(newEntry);

        if(isEmpty()) {
            firstNode = newNode;
        }
        else {
            Node lastNode = getNodeAt(numberOfEntries);
            lastNode.next = newNode;
        }
        numberOfEntries++;
    }

    @Override
    public void add(int newPosition, T newEntry) {
        if((newPosition >=1) && (newPosition <= numberOfEntries ++)) {
            Node newNode = new Node(newEntry);
            if (newPosition == 1) {
                newNode.next = firstNode;
                firstNode = newNode;
            }
            else {
                Node nodeBefore = getNodeAt(newPosition - 1);
                Node nodeAfter = nodeBefore.next;
                newNode.next = nodeAfter;
                nodeBefore.next = newNode;
            }
        }
        else {
            throw new IndexOutOfBoundsException("Illegal position given to add operation");
        }
    }

    @Override
    public T remove(int givenPosition) {
        T result = null;

        if((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            assert !isEmpty();
            if (givenPosition == 1) {
                result = firstNode.data;
                firstNode = firstNode.next;
            }
            else {
                Node nodeBefore = getNodeAt(givenPosition - 1);
                Node nodeToRemove = nodeBefore.next;
                result = nodeToRemove.data;
                Node nodeAfter= nodeToRemove.next;
                nodeBefore.next = nodeAfter;
            }
            numberOfEntries--;
            return result;
        }
        else {
            throw new IndexOutOfBoundsException("Illegal position given to remove operation");
        }
    }

    @Override
    public void clear() {
        initializeDataFields();
    }

    @Override
    public T replace(int givenPosition, T newEntry) {
        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            assert !isEmpty();
            Node desiredNode = getNodeAt(givenPosition);
            T originalEntry = desiredNode.data;
            desiredNode.data = newEntry;
            return originalEntry;
        }
        else {
            throw new IndexOutOfBoundsException("Illegal position given to replace operation");
        }
    }

    @Override
    public T getEntry(int givenPosition) {
        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            assert !isEmpty();
            return getNodeAt(givenPosition).data;
        }
        else {
            throw new IndexOutOfBoundsException("Illegal Position given to getEntry operation");
        }
    }

    @Override
    public T[] toArray() {

        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Object[numberOfEntries];

        int index = 0;
        Node currentNode = firstNode;
        while((index < numberOfEntries) && (currentNode != null)) {
            result[index] = currentNode.data;
            currentNode = currentNode.next;
            index++;
        }
        return result;
    }

    @Override
    public boolean contains(T anEntry) {
        boolean found = false;
        Node currentNode = firstNode;

        while(!found && (currentNode != null)) {
            if (anEntry.equals(currentNode.data)) {
                found = true;
            }
            else currentNode = currentNode.next;
        }
        return found;
    }

    @Override
    public int getLength() {
        return numberOfEntries;
    }

    @Override
    public boolean isEmpty() {
        boolean result;

        if (numberOfEntries == 0) {
            assert firstNode == null;
            result = true;
        }
        else {
            assert firstNode != null;
            result = false;
        }

        return result;
    }
    // Public Utility Methods -------------------------------------------------
    public int getPositionOf (T data) {
        Node currentNode = firstNode;
        int index = 0;
        boolean found = false;

        if (!contains(data)) {
            return -1;
        }
        while(!found) {
            if (currentNode.data.equals(data)) {
                found = true;
            }
            else {
                currentNode = currentNode.next;
                index++;
            }
        }
        return index;
    }

    // Private Utility Methods ------------------------------------------------
    private void initializeDataFields() {
        firstNode = null;
        numberOfEntries = 0;
    }
    private Node getNodeAt( int givenPosition) {
        assert (firstNode != null) && (1 <= givenPosition) && (givenPosition <= numberOfEntries);
        Node currentNode = firstNode;

        for(int counter = 1; counter < givenPosition; counter++) {
            currentNode = currentNode.next;
        }
        assert currentNode != null;
        return currentNode;
    }
    // ------------------------------------------------------------------------
    // Node Implementation ====================================================
    // ------------------------------------------------------------------------
    private class Node {
        // Properties and Variables -------------------------------------------
        private T data;
        private Node next;

        // Constructor --------------------------------------------------------
        private Node( T dataPortion) {
            this(dataPortion, null);
        }
        private Node( T dataPortion, Node nextNode) {
            data = dataPortion;
            next = nextNode;
        }
    }
}
