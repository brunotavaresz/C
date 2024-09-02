from tkinter import *
import time, os, sys
from Types import *
from View import *
from utils import *

root= Tk()
canvas=Canvas(root,width=10000,height=10000)
canvas.pack() 
root.bind("<Button-1>",onClick)


num1=int(1)
num2=int(1)
Blob_ex=Blob((50,0),point=(0,0),point1=(20,20),point2=(20,0),point3=(0,20),point4=(10,10),point5=(10,0),point6=(0,10),point7=(10,20),fill="red",smooth=True,canvas=canvas)
Poly_ex=Polygon((0,50),point=(50,50),point1=(70,70),point2=(70,50),fill="green",canvas=canvas)
poly_line=PolyLine((50,50),point=(100,100),point1=(120,120),point2=(150,100),point3=(120,170),fill="blue",canvas=canvas)
Spline_ex=Spline((0,0),point=(0,50),point1=(50,0),fill="black",smooth=True,canvas=canvas)
view=View(Ox=0,Oy=0,width=401,height=401,title="New objects",background="alice blue",canvas=canvas,root=root)


if num2==num1:
    for i in range(1,10):

        view.move(Spline_ex.object,(10,0))
     
     
else: 
    print("This is not a test")
     
print("Press any mouse button to quit")
pos=getMouse(canvas)