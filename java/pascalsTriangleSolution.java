class pascalsTriangleSolution {
    public List<List<Integer>> generate(int numRows) {
        int[][] pascalTriangle = new int[numRows][numRows];
        
        for(int i = 0; i <= (numRows - 1); i++ ) {
            pascalTriangle[i][0] = 1;
            pascalTriangle[0][i] = 1;
        }
        
        for(int i = 1; i < (numRows - 1); i++){
            //System.out.println(String.format("Current i = %d, Next limit on j: %d", i, numRows - i - 1));
            for(int j = 1; j <= ((numRows - i - 1)); j++){
                //System.out.println(String.format("i = %d ; j = %d; limit on j = %d", i, j, (numRows - i - 1)));
                pascalTriangle[i][j] = pascalTriangle[i][j-1] + pascalTriangle[i-1][j]; 
                //System.out.println(String.format("PT(%d,%d) = %d", i, j, pascalTriangle[i][j]));
            }
        }
        
        ArrayList<List<Integer>> pascalList = new ArrayList<List<Integer>>();
        
        int counter = 0;
        while(counter < numRows){
            ArrayList<Integer> row = new ArrayList<Integer>();
            
            for(int i = 0, j = counter; i <= counter && j >= 0; i++, j--){
                row.add(pascalTriangle[i][j]);
                //System.out.println(String.format("Adding to row %d: %d", counter, pascalTriangle[i][j]));
                
            }
            
            //System.out.println("Row " + counter + ": " + row);
            pascalList.add(row);
            
            counter++;
        }
        
        return pascalList;
    }
}
