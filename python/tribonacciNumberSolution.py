class Solution:
    def tribonacci(self, n: int) -> int:
        if n == 0: return 0
        elif n == 1 or n == 2: return 1
        else: 
            seq = [0 for i in range(n+1)]
            seq[1] = 1
            seq[2] = 1
            for i in range(3,n + 1):
                #print("calculating i ", i, " = ", seq[i-1], " + ", seq[i-2], " + ", seq [i-3])
                seq[i] = seq[i-1] + seq[i-2] + seq [i-3]

            #print(seq)
        return seq[n]
