class Solution:
    def transpose(self, matrix: List[List[int]]) -> List[List[int]]:
        results = [[0 for x in range(len(matrix))] for y in range(len(matrix[0]))]
        for i in range(0,len(matrix[0])):
            for j in range(0, len(matrix)):
                results[i][j] = matrix[j][i]
        
        return results
