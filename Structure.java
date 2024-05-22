class Structure {
    private Pixel[] arr;

    public boolean isBalanced() {
        int redC = 0, greenC = 0, blueC = 0;
        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i].isRed()) {
                redC++;
            }
            else if (this.arr[i].isGreen()) {
                greenC++;
            }
            else if (this.arr[i].isBlue()) {
                blueC++;
            }
        }
        if (redC == greenC && redC == blueC) {
            return true;
        }
        return false;
    }

    public boolean isBlackWhite() {
        int whiteC = 0, blackC = 0;
        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i].isWhite()) {
                whiteC++;
            }
            else if (this.arr[i].isBlack()) {
                blackC++;
            }
        }
        if (whiteC + blackC == this.arr.length) {
            return true;
        }
        return false;
    }
}