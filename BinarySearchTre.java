public class BST<K extends Comparable<K>, V> {
    private class Node {
        private K key;
        private V val;
        private Node left, right;


        public Node(K key, V val) {
            this.key = key;
            this.val = val;
        }
        private Node root(K key, V value) {
            size++;
            if (head == null) {
                head = new Node(key, value, 0);
                return head;
            }
        }
        class InorderIterator {
            private Stack<Node> traversal;

            InorderIterator(Node root)
            {
                traversal = new Stack<Node>();
                moveLeft(root);
            }

            private void moveLeft(Node current)
            {
                while (current != null) {
                    traversal.push(current);
                    current = current.left;
                }
            }

            public boolean hasNext()
            {
                return !traversal.isEmpty();
            }

            public Node next()
            {
                if (!hasNext())
                    throw new NoSuchElementException();

                Node current = traversal.pop();

                if (current.right != null)
                    moveLeft(current.right);

                return current;
            }
        }

        public void put(K key, V val) {...}
        public V get(K key) {...}
        public void delete(K key) {...}
        public Iterable<K> iterator() {...}
        var value;
        Object.keys(map).forEach(function(key) {
            value = map[key];
            console.log(value);
        }
    }
}

