class Pixel {
    private int red;
    private int green;
    private int blue;

    public Pixel(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return this.red;
    }

    public int getGreen() {
        return this.green;
    }

    public int getBlue() {
        return this.blue;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }


    public boolean isRed() {
        if (this.red > 0 && this.green == 0 && this.blue == 0) {
            return true;
        }
        return false;
    }

    public boolean isGreen() {
        if (this.green > 0 && this.red == 0 && this.blue == 0) {
            return true;
        }
        return false;
    }

    public boolean isBlue() {
        if (this.blue > 0 && this.green == 0 && this.red == 0) {
            return true;
        }
        return false;
    }

    public boolean isWhite() {
        if (this.blue == 255 && this.green == 255 && this.blue == 255) {
            return true;
        }
        return false;
    }

    public boolean isBlack() {
        if (this.blue == 0 && this.green == 0 && this.blue == 0) {
            return true;
        }
        return false;
    }



}
