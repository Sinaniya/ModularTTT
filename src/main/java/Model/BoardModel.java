package Model;

class BoardModel{
    int width;
    int height;
    CellModel cells[][];

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public CellModel[][] getCells() {
        return cells;
    }

    public void setCells(CellModel[][] cells) {
        this.cells = cells;
    }
}