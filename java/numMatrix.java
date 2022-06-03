class NumMatrix {

    int[][] matrix;
    
    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for(int x = row1; x <= row2;  x++) {
            for(int y = col1; y <= col2; y++) {
                //System.out.println(String.format("(x,y) = (%d, %d)", x, y));
                sum += matrix[x][y];
            }
        }
        
        return sum;
    }
}
