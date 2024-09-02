from tkinter import *
import time, os, sys
from Types import *
from View import *
from utils import *

root= Tk()
canvas=Canvas(root,width=10000,height=10000)
canvas.pack() 
root.bind("<Button-1>",onClick)


view=View(width=601,height=601,title="Illustrating the minimum level graphical models",background="alice blue",canvas=canvas,root=root)


cellSize=float(200)
canvas.create_line(Line.converter((-cellSize,cellSize),(50,50)),fill="red")
canvas.create_line(Rectangle.converter((0,cellSize),(50,50)),fill="orange")
canvas.create_oval(Ellipse.converter((cellSize,cellSize),(60,40)),fill="blue")
canvas.create_arc(Arc.converter((-cellSize,0),(50,50)),start=30,extent=100,outline="tomato")
canvas.create_arc(ArcChord.converter((cellSize,0),(50,50)),start=30,extent=150,fill="cyan")
canvas.create_arc(PieSlice.converter((-cellSize,-cellSize),(50,50)),start=30,extent=300,fill="blue")
canvas.create_text((0,-cellSize),text="Bla bla ...",fill="purple")
dot=Dot((cellSize,-cellSize),fill="black",canvas=canvas)
view.refresh()
print("Press any mouse button to quit")
p=getMouse(canvas)
print(p)
view.canvas.destroy()