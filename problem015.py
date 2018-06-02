#Change for different size latice
max = 20

#Initialize latice
lat = [[0 for i in range (0,max + 1)] for i in range (0, max + 1)]

#Set bottom right to 1
lat[max][max] = 1

#Loop calls
for i in range(max, -1, -1):
    x = max
    for j in range(i, max + 1):
        if j != max:
            lat[j][x] += lat[j+1][x]
        if x != max:
            lat[j][x] += lat[j][x+1]
        x-=1

for i in range(max - 1, -1, -1):
    x = 0
    for j in range(i, -1, -1):
        lat[x][j] = lat[j][x+1] + lat[j+1][x]
        x+=1

print(lat[0][0])
