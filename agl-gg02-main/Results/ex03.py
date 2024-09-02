from tkinter import *
import time, os, sys
from Types import *
from View import *
from utils import *

root= Tk()
canvas=Canvas(root,width=10000,height=10000)
canvas.pack() 
root.bind("<Button-1>",onClick)


view=View(width=401,height=401,title="Illustrating the rectangle shape",background="wheat",canvas=canvas,root=root)


canvas.create_line(Rectangle.converter((10,0),(200,60)),fill="blue")
pacman=PieSlice((0,0),(50,50),fill="pink",start=30,extent=300,canvas=canvas)
view.refresh()
for i in range(1,10):
    view.canvas.itemconfig(pacman.object,start=1,extent=359)
    view.refresh(20)
    view.canvas.itemconfig(pacman.object,start=30,extent=300)
    view.refresh(25)

    view.move(pacman.object,(10,0))

    view.moveView((10,0))
    view.refresh()
 
print("Press any mouse button to quit")
pos=getMouse(canvas)
view.canvas.destroy()