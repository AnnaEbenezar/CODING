from math import degrees, sqrt, atan

def distance (x,y,xt,yt):
    distance = sqrt((x-xt)**2 + (y-yt)**2)
    return distance
def angle (x,y,xt,yt):
    angle = degrees(atan(abs((yt-y)/(xt-x))))
    return angle
x = float(input("x: "))
y = float(input("y: "))
xt = float(input("xt: "))
yt = float(input("yt: "))
Distance = distance(x,y,xt,yt)
Angle = angle(x,y,xt,yt)
print(f"Distance: {Distance}")
print(f"Angle: {Angle}")



