N = int(input())

a = list()

for i in range(N):
	s,p = input().split()
	p = int(p)	
	a.append([s,p,i+1])

a.sort(key = lambda x: x[1], reverse = True)

a.sort(key = lambda x: x[0])
#a.sort(key = lambda x:(x[0], -x[1]))

for i in a:
	print(i[2])
