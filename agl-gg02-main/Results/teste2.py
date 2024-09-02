from tkinter import *
import time, os, sys
from Types import *
from View import *
from utils import *

root= Tk()
canvas=Canvas(root,width=10000,height=10000)
canvas.pack() 
root.bind("<Button-1>",onClick)


canvas.create_line(Rectangle.converter((0,0),(1000,70)),fill="blue")
view=View(Ox=-450,Oy=0,width=401,height=401,title="Illustrating a moving rectangle",background="alice blue",canvas=canvas,root=root)


rect=Rectangle((-450,0),(100,50),fill="red",canvas=canvas)
view.refresh()
for i in range(1,10):

    view.move(rect.object,(10,0))

    view.moveView((10,0))
    view.refresh(20)
 
print("Press any mouse button to quit")
pos=getMouse(canvas)
view.canvas.destroy()