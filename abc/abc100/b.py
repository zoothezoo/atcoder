d,n = map(int,input().split())

num = 1

if d == 0:
    num = 1
else:
    for i in range(0,d):
         num = num * 100

if d == 100:
    ans = num * 101
else:
    ans = num * n

print(ans)