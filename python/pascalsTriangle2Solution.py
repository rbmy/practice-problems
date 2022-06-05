class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        if (rowIndex == 0): return [1]
        elif (rowIndex == 1): return [1,1]
        else:
            pascalTriangle = [[0 for x in range(0,rowIndex+2)] for x in range(0, rowIndex+2)]
            
            for i in range(0,rowIndex+2):
                for j in range(0,rowIndex+2):
                    pascalTriangle[0][j] = 1
                    pascalTriangle[i][0] = 1
            
            for i in range(1, rowIndex+2):
                for j in range(1,rowIndex-i+2):
                    #print(i,j,pascalTriangle[i-1][j] + pascalTriangle[i][j-1])
                    pascalTriangle[i][j] = pascalTriangle[i-1][j] + pascalTriangle[i][j-1]
            
            answer = [0 for x in range(0,rowIndex+1)]
            
            for i in range(0, rowIndex+1):
                #print(i,rowIndex)
                answer[i] = pascalTriangle[i][rowIndex]
                rowIndex = rowIndex - 1
                
            return answer
