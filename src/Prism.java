public class Prism {

    private int length;
    private int width;
    private int height;

    public Prism (int l, int w, int h)
    {
        length = l;
        width = w;
        height = h;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int surfaceArea()
    {
        return (length * width * 2) + (length * height * 2) + (width + height * 2);
    }
    public int volume()
    {
        return (length * width * height);
    }

    public String toString() {
        return "Length: " + length + "\nWidth: " + width + "\nHeight: " + height;
    }
}
