a,b,c,d = input().split()

a = int(a)
b = int(b)
c = int(c)
d = int(d)

if abs(a-c)<=d:
    print("Yes")
    exit()

if abs(a-b)<=d:
    if abs(b-c)<=d:
        print("Yes")
    else:
        print("No")
else:
    print("No")



