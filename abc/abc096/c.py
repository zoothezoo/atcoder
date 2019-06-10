h,w = map(int,input().split())

grid = list()

for i in range(h):
    grid.append(input())

x = [1,-1,0 ,0]   
y = [0, 0,1,-1]   

count = 0

for i in range(h):
    for j in range(w):
        count = 0
        if grid[i][j] == '#':
            for s,t in zip(x,y):
                if h > i+s >= 0 and w > j+t >= 0 and grid[i+s][j+t] == '#':
                    break
            else:
                print("No")
                exit()
                
print("Yes")