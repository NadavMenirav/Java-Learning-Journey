class IdenSimi {
    public static int size(Queue<Integer> q1) {
        Queue<Integer> tempQueue = new Queue<Integer>();
        int tempNum;
        int size = 0;
        while (!q1.isEmpty()) {
            tempNum = q1.remove();
            size++;
            tempQueue.insert(tempNum);
        }
        while (!tempQueue.isEmpty()) {
            q1.insert(tempQueue.remove());
        }
        return size;
    }

    public static boolean isIdentical(Queue<Integer> q1, Queue<Integer> q2) {
        Queue<Integer> tempQueue1 = new Queue<Integer>();
        Queue<Integer> tempQueue2 = new Queue<Integer>();
        int tempNum1 = 0, tempNum2 = 0;
        boolean isEqual = true;
        if (size(q1) != size(q2)) {
            return false;
        }
        while (!q1.isEmpty() && !q2.isEmpty()) {
            tempNum1 = q1.remove();
            tempNum2 = q2.remove();
            if (tempNum1 != tempNum2) {
                isEqual = false;
            }
        }
    }
}