class NodeContain {
    public static boolean isIncluded(Node<Integer> lst1, Node<Range> lst2) {
        Node<Integer> p1 = lst1;
        Node<Range> p2 = lst2;
        while (p1 != null && p2 != null) {
            if (p2.getValue().isXIncluded(p1.getValue())) {
                p1 = p1.getNext();
            }
            else {
                p2 = p2.getNext();
            }
        }

        if (p1 == null) {
            return true;
        }
        return false;
    }
}