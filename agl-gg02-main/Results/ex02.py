from tkinter import *
import time, os, sys
from Types import *
from View import *
from utils import *

root= Tk()
canvas=Canvas(root,width=10000,height=10000)
canvas.pack() 
root.bind("<Button-1>",onClick)


view=View(width=401,height=401,title="Illustrating the rectangle shape",background="white",canvas=canvas,root=root)


p=Point(0,0)
canvas.create_line(Rectangle.converter((0,0),(100,100)),fill="pink")
r=Rectangle(p.value,(50,50),fill="wheat",canvas=canvas)
view.refresh()
for i in range(1,10):

    canvas.itemconfig(r.object,state="hidden") 
    view.refresh(100)

    canvas.itemconfig(r.object,state="normal") 
    view.refresh(100)
 
print("Press any mouse button to quit")
p=getMouse(view.canvas)
view.canvas.destroy()